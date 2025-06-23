/**
 * Representa un vehículo tipo colectivo, que hereda de Vehiculo.
 * Este tipo de vehículo puede ser de uno o dos pisos, indicado por el atributo pisoDoble.
 */

public class Colectivo extends Vehiculo {

    /** Indica si el colectivo es de doble piso. */
    private boolean pisoDoble;

    /**
     * Constructor vacío.
     */
    public Colectivo() {}

    /**
     * Constructor completo que permite definir un colectivo con todos sus atributos.
     *
     * @param patente Patente del colectivo.
     * @param capacidad Capacidad máxima de pasajeros.
     * @param pisoDoble true si el colectivo es de doble piso; false si es de un solo piso.
     */
    public Colectivo(String patente, int capacidad, boolean pisoDoble) {
        super(patente, capacidad);
        this.pisoDoble = pisoDoble;
    }

    /**
     * Indica si el colectivo es de doble piso.
     *
     * @return true si es de doble piso; false en caso contrario.
     */
    public boolean isPisoDoble() {
        return pisoDoble;
    }

    /**
     * Establece si el colectivo es de doble piso.
     *
     * @param pisoDoble true para indicar que es de doble piso.
     */
    public void setPisoDoble(boolean pisoDoble) {
        this.pisoDoble = pisoDoble;
    }
}
