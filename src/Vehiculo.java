import java.util.ArrayList;

/**
 * Representa un vehículo utilizado para transportar pasajeros en el sistema.
 *
 * Cada vehículo posee una patente, una capacidad máxima y una lista de viajes
 * que ha realizado. Esta clase puede ser extendida por clases específicas
 * como Colectivo o Minibus.
 */
public class Vehiculo {

    /** Patente del vehículo. */
    private String patente;

    /** Capacidad máxima de pasajeros del vehículo. */
    private int capacidad;

    /** Lista de viajes que ha realizado el vehículo. */
    private ArrayList<Viaje> viajes;

    /**
     * Constructor vacío. Inicializa la lista de viajes vacía.
     */
    public Vehiculo() {
        this.viajes = new ArrayList<Viaje>();
    }

    /**
     * Constructor que permite crear un vehículo con patente y capacidad definidas.
     * Inicializa la lista de viajes vacía.
     *
     * @param patente   Patente del vehículo.
     * @param capacidad Capacidad máxima de pasajeros.
     */
    public Vehiculo(String patente, int capacidad) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.viajes = new ArrayList<Viaje>();
    }

    /**
     * Devuelve la patente del vehículo.
     *
     * @return Patente como cadena de texto.
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Establece la patente del vehículo.
     *
     * @param patente Nueva patente.
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * Devuelve la capacidad del vehículo.
     *
     * @return Capacidad máxima de pasajeros.
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad del vehículo.
     *
     * @param capacidad Nueva capacidad máxima de pasajeros.
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Agrega un viaje a la lista de viajes realizados por el vehículo.
     *
     * @param v Viaje a agregar.
     */
    public void agregarViaje(Viaje v) {
        this.viajes.add(v);
    }

    /**
     * Devuelve la lista de viajes realizados por el vehículo.
     *
     * @return Lista de viajes.
     */
    public ArrayList<Viaje> getViajes() {
        return this.viajes;
    }

    /**
     * Reemplaza la lista completa de viajes del vehículo.
     *
     * @param viajes Nueva lista de viajes.
     */
    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }
}