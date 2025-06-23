import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase principal que gestiona todas las operaciones del sistema de viajes.
 * Incluye el registro de choferes, vehículos y ciudades, así como la planificación
 * y consulta de viajes.
 */
public class Sistema {
    /** Lista de todos los choferes registrados en el sistema. */
    private ArrayList<Chofer> choferes;
    /** Lista de todos los vehículos registrados en el sistema. */
    private ArrayList<Vehiculo> vehiculos;
    /** Lista de todas las ciudades registradas en el sistema. */
    private ArrayList<Ciudad> ciudades;
    /** Lista de todos los viajes planificados en el sistema. */
    private ArrayList<Viaje> viajes;

    /**
     * Constructor de la clase Sistema.
     * Inicializa las listas de choferes, vehículos, ciudades y viajes como ArrayLists vacíos.
     */
    public Sistema() {
        this.choferes = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.ciudades = new ArrayList<>();
        this.viajes = new ArrayList<>();
    }

    /**
     * Registra un nuevo chofer en el sistema.
     *
     * @param chofer El objeto Chofer a registrar.
     */
    public void registrarChofer(Chofer chofer) {
        this.choferes.add(chofer);
    }

    /**
     * Registra un nuevo vehículo en el sistema.
     *
     * @param vehiculo El objeto Vehiculo a registrar.
     */
    public void registrarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    /**
     * Registra una nueva ciudad en el sistema.
     *
     * @param ciudad El objeto Ciudad a registrar.
     */
    public void registrarCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    /**
     * Intenta planificar un nuevo viaje, validando que el chofer asignado
     * no tenga superposición de horarios con viajes ya programados para la misma fecha.
     * Si el viaje es válido, se asocia al chofer, vehículo y ciudades correspondientes,
     * y se añade a la lista general de viajes.
     *
     * @param nuevoViaje El objeto Viaje a planificar.
     * @return true si el viaje se planificó con éxito (sin superposición), false en caso contrario.
     */
    public boolean planificarViaje(Viaje nuevoViaje) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        LocalDate fechaNuevo = LocalDate.parse(nuevoViaje.getFecha(), dateFormatter);
        LocalTime salidaNuevo = LocalTime.parse(nuevoViaje.getHorarioSalida(), timeFormatter);
        LocalTime llegadaNuevo = LocalTime.parse(nuevoViaje.getHorarioLlegada(), timeFormatter);

        // Validar superposición de horarios para el chofer
        for (Viaje v : nuevoViaje.getChofer().getViajes()) { // Aquí es donde se usa getViajes() del chofer
            LocalDate fechaV = LocalDate.parse(v.getFecha(), dateFormatter);
            LocalTime salidaV = LocalTime.parse(v.getHorarioSalida(), timeFormatter);
            LocalTime llegadaV = LocalTime.parse(v.getHorarioLlegada(), timeFormatter);

            if (fechaNuevo.equals(fechaV)) {
                // Comprueba si los intervalos de tiempo se solapan
                if (!(llegadaNuevo.isBefore(salidaV) || salidaNuevo.isAfter(llegadaV))) {
                    System.out.println("ERROR: El chofer ya tiene un viaje en ese horario.");
                    return false;
                }
            }
        }

        // Asociar el nuevo viaje a sus respectivas entidades
        nuevoViaje.getChofer().agregarViaje(nuevoViaje);
        nuevoViaje.getVehiculo().agregarViaje(nuevoViaje);
        nuevoViaje.getCiudadOrigen().agregarViaje(nuevoViaje);
        nuevoViaje.getCiudadDestino().agregarViaje(nuevoViaje);
        this.viajes.add(nuevoViaje); // Añadir a la lista general de viajes del sistema

        return true;
    }

    /**
     * Muestra en la consola un resumen de todos los viajes programados en el sistema.
     * Incluye fecha, horarios, ciudades de origen y destino, chofer y vehículo.
     */
    public void mostrarViajes() {
        System.out.println("--- Lista de Viajes Programados ---");
        if (this.viajes.isEmpty()) {
            System.out.println("No hay viajes programados actualmente.");
            return;
        }
        for (Viaje v : viajes) {
            System.out.println("Viaje: " + v.getFecha() + " " + v.getHorarioSalida() +
                    " | " + v.getCiudadOrigen().getNombre() + " → " + v.getCiudadDestino().getNombre() +
                    " | Chofer: " + v.getChofer().getNombre() + " " + v.getChofer().getApellido() +
                    " | Vehículo: " + v.getVehiculo().getPatente());
        }
    }

    /**
     * Genera un informe detallado de todos los viajes que ha realizado un colectivo
     * específico, identificado por su patente.
     *
     * @param patente La patente del colectivo sobre el cual se desea el informe.
     */
    public void informeViajesPorColectivo(String patente) {
        boolean encontrado = false;
        for (Vehiculo v : vehiculos) {
            // Verifica que sea un Colectivo y que coincida la patente
            if (v instanceof Colectivo && v.getPatente().equals(patente)) {
                System.out.println("\n--- Viajes del colectivo " + patente + " ---");
                if (v.getViajes().isEmpty()) {
                    System.out.println("El colectivo " + patente + " no ha realizado viajes.");
                } else {
                    for (Viaje viaje : v.getViajes()) {
                        System.out.println(" - " + viaje.getFecha() + ": " +
                                viaje.getCiudadOrigen().getNombre() + " → " +
                                viaje.getCiudadDestino().getNombre() +
                                " (Chofer: " + viaje.getChofer().getNombre() + " " + viaje.getChofer().getApellido() + ")");
                    }
                }
                return; // Se encontró el colectivo, no hay necesidad de seguir buscando
            }
        }
        System.out.println("\nNo se encontró un colectivo con la patente: " + patente);
    }

    /**
     * Genera un informe que muestra la cantidad de viajes que cada chofer
     * ha realizado utilizando exclusivamente vehículos de tipo Colectivo.
     */
    public void informeViajesPorChoferDeColectivo() {
        System.out.println("\n--- Informe de viajes por chofer en Colectivos ---");
        boolean algunChoferConViajesEnColectivo = false;

        for (Chofer c : choferes) {
            int contador = 0;
            for (Viaje v : c.getViajes()) {
                if (v.getVehiculo() instanceof Colectivo) {
                    contador++;
                }
            }

            if (contador > 0) {
                System.out.println("Chofer " + c.getNombre() + " " + c.getApellido() +
                        " realizó " + contador + " viajes en colectivos.");
                algunChoferConViajesEnColectivo = true;
            }
        }
        if (!algunChoferConViajesEnColectivo) {
            System.out.println("Ningún chofer ha realizado viajes en colectivos hasta el momento.");
        }
    }
}