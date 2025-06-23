import java.util.ArrayList;
/**
 * Representa una categoría de choferes, definida por un tipo específico
 */
public class Categoria {

    /** Tipo de categoría (definido por un enum). */
    private CategoriaEnum tipo;

    /** Lista de choferes que pertenecen a esta categoría. */
    private ArrayList<Chofer> choferes;

    /** Constructor por defecto. Inicializa la lista de choferes vacía. */
    public Categoria() {
        this.choferes = new ArrayList<Chofer>();
    }

    /**
     * Constructor que define el tipo de categoría.
     *
     * @param tipo Tipo de categoría .
     */
    public Categoria(CategoriaEnum tipo) {
        this.tipo = tipo;
        this.choferes = new ArrayList<Chofer>();
    }

    /**
     * Obtiene el tipo de categoría.
     *
     * @return Tipo de la categoría.
     */
    public CategoriaEnum getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de categoría.
     *
     * @param tipo Nuevo tipo de categoría.
     */
    public void setTipo(CategoriaEnum tipo) {
        this.tipo = tipo;
    }

    /**
     * Agrega un chofer a la lista de esta categoría.
     *
     * @param c Chofer a agregar.
     */
    public void agregarCategoria(Chofer c) {
        this.choferes.add(c);
    }

    /**
     * Establece la lista completa de choferes para esta categoría.
     *
     * @param choferes Lista de choferes a asignar.
     */
    public void setChoferes(ArrayList<Chofer> choferes) {
        this.choferes = choferes;
    }
}