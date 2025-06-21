import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Sistema {
    private ArrayList<Chofer> choferes;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Ciudad> ciudades;
    private ArrayList<Viaje> viajes;

    public Sistema() {
        this.choferes = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.ciudades = new ArrayList<>();
        this.viajes = new ArrayList<>();
    }

    // Registrar un nuevo chofer
    public void registrarChofer(Chofer chofer) {
        this.choferes.add(chofer);
    }

    // Registrar un nuevo vehículo
    public void registrarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    // Registrar una ciudad
    public void registrarCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    // Planificar un viaje con validación de superposición de horarios para el chofer
    public boolean planificarViaje(Viaje nuevoViaje) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        LocalDate fechaNuevo = LocalDate.parse(nuevoViaje.getFecha(), dateFormatter);
        LocalTime salidaNuevo = LocalTime.parse(nuevoViaje.getHorarioSalida(), timeFormatter);
        LocalTime llegadaNuevo = LocalTime.parse(nuevoViaje.getHorarioLlegada(), timeFormatter);

        for (Viaje v : nuevoViaje.getChofer().getViajes()) {
            LocalDate fechaV = LocalDate.parse(v.getFecha(), dateFormatter);
            LocalTime salidaV = LocalTime.parse(v.getHorarioSalida(), timeFormatter);
            LocalTime llegadaV = LocalTime.parse(v.getHorarioLlegada(), timeFormatter);

            if (fechaNuevo.equals(fechaV)) {
                if (!(llegadaNuevo.isBefore(salidaV) || salidaNuevo.isAfter(llegadaV))) {
                    System.out.println("ERROR: El chofer ya tiene un viaje en ese horario.");
                    return false;
                }
            }
        }

        // Asociar viaje
        nuevoViaje.getChofer().agregarViaje(nuevoViaje);
        nuevoViaje.getVehiculo().agregarViaje(nuevoViaje);
        nuevoViaje.getCiudadOrigen().agregarViaje(nuevoViaje);
        nuevoViaje.getCiudadDestino().agregarViaje(nuevoViaje);
        this.viajes.add(nuevoViaje);

        return true;
    }
    // Mostrar todos los viajes programados
    public void mostrarViajes() {
        for (Viaje v : viajes) {
            System.out.println("Viaje: " + v.getFecha() + " " + v.getHorarioSalida() +
                    " | " + v.getCiudadOrigen().getNombre() + " → " + v.getCiudadDestino().getNombre() +
                    " | Chofer: " + v.getChofer().getNombre() + " " + v.getChofer().getApellido() +
                    " | Vehículo: " + v.getVehiculo().getPatente());
        }
    }

    // Informe: viajes que tiene un colectivo determinado
    public void informeViajesPorColectivo(String patente) {
        for (Vehiculo v : vehiculos) {
            if (v instanceof Colectivo && v.getPatente().equals(patente)) {
                System.out.println("Viajes del colectivo " + patente + ":");
                for (Viaje viaje : v.getViajes()) {
                    System.out.println(" - " + viaje.getFecha() + ": " +
                            viaje.getCiudadOrigen().getNombre() + " → " +
                            viaje.getCiudadDestino().getNombre());
                }
                return;
            }
        }
        System.out.println("No se encontró un colectivo con la patente: " + patente);
    }


}