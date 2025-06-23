/**
 * Representa un viaje realizado por un Vehiculo, conducido por un Chofer,
 * entre dos ciudades, en una fecha y horario determinados.
 *
 * Esta clase contiene toda la información necesaria para registrar un viaje en el sistema,
 * incluyendo la ciudad de origen, ciudad de destino, horarios y recursos utilizados.
 */
public class Viaje {

    /** Fecha del viaje */
    private String fecha;

    /** Horario de salida del viaje. */
    private String horarioSalida;

    /** Horario de llegada del viaje. */
    private String horarioLlegada;

    /** Chofer asignado al viaje. */
    private Chofer chofer;

    /** Ciudad de origen del viaje. */
    private Ciudad ciudadOrigen;

    /** Ciudad de destino del viaje. */
    private Ciudad ciudadDestino;

    /** Vehículo utilizado para el viaje. */
    private Vehiculo vehiculo;

    /**
     * Constructor vacío.
     */
    public Viaje() {}

    /**
     * Constructor completo que inicializa todos los datos del viaje.
     *
     * @param fecha           Fecha del viaje.
     * @param horarioSalida   Horario de salida.
     * @param horarioLlegada  Horario de llegada.
     * @param chofer          Chofer asignado.
     * @param ciudadOrigen    Ciudad desde donde parte el viaje.
     * @param ciudadDestino   Ciudad a la que se dirige el viaje.
     * @param vehiculo        Vehículo utilizado en el viaje.
     */
    public Viaje(String fecha, String horarioSalida, String horarioLlegada,
                 Chofer chofer, Ciudad ciudadOrigen, Ciudad ciudadDestino, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.horarioSalida = horarioSalida;
        this.horarioLlegada = horarioLlegada;
        this.chofer = chofer;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.vehiculo = vehiculo;
    }

    /** @return Fecha del viaje. */
    public String getFecha() {
        return fecha;
    }

    /** @param fecha Fecha del viaje a establecer. */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /** @return Horario de salida del viaje. */
    public String getHorarioSalida() {
        return horarioSalida;
    }

    /** @param horarioSalida Horario de salida a establecer. */
    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    /** @return Horario de llegada del viaje. */
    public String getHorarioLlegada() {
        return horarioLlegada;
    }

    /** @param horarioLlegada Horario de llegada a establecer. */
    public void setHorarioLlegada(String horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }

    /** @return Chofer asignado al viaje. */
    public Chofer getChofer() {
        return chofer;
    }

    /** @param chofer Chofer a asignar al viaje. */
    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    /** @return Ciudad de origen del viaje. */
    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    /** @param ciudadOrigen Ciudad de origen a establecer. */
    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    /** @return Ciudad de destino del viaje. */
    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    /** @param ciudadDestino Ciudad de destino a establecer. */
    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    /** @return Vehículo utilizado en el viaje. */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /** @param vehiculo Vehículo a asignar al viaje. */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}