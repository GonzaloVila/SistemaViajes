/**
 * Representa un vehículo tipo minibus, que hereda de Vehiculo.
 * Incluye características específicas como presencia de bodega y aire acondicionado.
 *
 */
public class Minibus extends Vehiculo {

    /** Indica si el minibus posee bodega para equipaje. */
    private boolean tieneBodega;

    /** Indica si el minibus tiene aire acondicionado. */
    private boolean aireAcondicionado;

    /**
     * Constructor vacío.
     */
    public Minibus() {}

    /**
     * Constructor completo que permite crear un minibus con todas sus características.
     *
     * @param tieneBodega         true si el minibus tiene bodega para equipaje.
     * @param aireAcondicionado   true si el minibus tiene aire acondicionado.
     * @param patente             Patente del vehículo.
     * @param capacidad           Capacidad máxima de pasajeros.
     */
    public Minibus(boolean tieneBodega, boolean aireAcondicionado, String patente, int capacidad) {
        super(patente, capacidad);
        this.tieneBodega = tieneBodega;
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Indica si el minibus tiene bodega.
     *
     * @return true si tiene bodega; false en caso contrario.
     */
    public boolean isTieneBodega() {
        return tieneBodega;
    }

    /**
     * Establece si el minibus tiene bodega.
     *
     * @param tieneBodega true para indicar que tiene bodega.
     */
    public void setTieneBodega(boolean tieneBodega) {
        this.tieneBodega = tieneBodega;
    }

    /**
     * Indica si el minibus tiene aire acondicionado.
     *
     * @return true si tiene aire acondicionado; false en caso contrario.
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Establece si el minibus tiene aire acondicionado.
     *
     * @param aireAcondicionado true para indicar que tiene aire acondicionado.
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
}