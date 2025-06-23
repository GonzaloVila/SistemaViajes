/**
 * Representa la asociación entre un chofer y una categoría específica de vehículo
 * para la cual está habilitado.
 * Esta clase también almacena la fecha de vencimiento de dicha habilitación.
 */
public class ChoferCategoria {

    /**
     * Fecha de vencimiento de la habilitación del chofer para esta categoría,
     */
    private String fechaVencimiento;

    /**
     * El objeto Chofer al que se le asocia esta categoría y habilitación.
     */
    private Chofer chofer;

    /**
     * La categoría específica de vehículo
     * para la cual el chofer está habilitado.
     */
    private Categoria categoria;

    /**
     * Constructor por defecto de ChoferCategoria.
     * Inicializa un objeto ChoferCategoria sin valores asignados.
     */
    public ChoferCategoria() {}

    /**
     * Constructor que permite inicializar una nueva asociación de Chofer-Categoría
     * con una fecha de vencimiento específica.
     *
     * @param fechaVencimiento La fecha de vencimiento de la habilitación, en formato String.
     * @param chofer           El objeto Chofer al que se asocia la categoría.
     * @param categoria        La categoría de vehículo asociada a la habilitación.
     */
    public ChoferCategoria(String fechaVencimiento, Chofer chofer, Categoria categoria) {
        this.fechaVencimiento = fechaVencimiento;
        this.chofer = chofer;
        this.categoria = categoria;
    }

    /**
     * Obtiene la fecha de vencimiento de la habilitación.
     *
     * @return La fecha de vencimiento como String.
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Establece la fecha de vencimiento de la habilitación.
     *
     * @param fechaVencimiento La nueva fecha de vencimiento.
     */
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Obtiene el objeto Chofer asociado a esta habilitación.
     *
     * @return El Chofer asociado.
     */
    public Chofer getChofer() {
        return chofer;
    }

    /**
     * Establece el objeto Chofer para esta habilitación.
     *
     * @param chofer El nuevo Chofer a asociar.
     */
    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    /**
     * Obtiene el objeto Categoria de la habilitación.
     *
     * @return La Categoria de vehículo asociada.
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Establece el objeto Categoria para esta habilitación.
     *
     * @param categoria La nueva Categoria a asociar.
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
