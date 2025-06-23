import java.util.ArrayList;

/**
 * Representa un chofer del sistema, que extiende de Persona.
 * Contiene su número de licencia, una lista de categorías que posee
 * y los viajes que ha realizado.
 */
public class Chofer extends Persona {

    /**
     * Número de licencia del chofer.
     */
    private String nroLicencia;

    /**
     * Lista de categorías que el chofer posee.
     */
    private ArrayList<ChoferCategoria> categorias;

    /**
     * Lista de viajes que ha realizado el chofer.
     */
    private ArrayList<Viaje> viajes;

    /**
     * Constructor por defecto. Inicializa las listas de categorías y viajes vacías.
     */
    public Chofer() {
        this.categorias = new ArrayList<ChoferCategoria>();
        this.viajes = new ArrayList<Viaje>();
    }

    /**
     * Constructor que inicializa el chofer con los datos personales y la licencia.
     * Las listas de categorías y viajes se inicializan vacías.
     *
     * @param nroLicencia Número de licencia del chofer.
     * @param categoria   Categoría principal del chofer.
     * @param dni         Documento del chofer.
     * @param nombre      Nombre del chofer.
     * @param apellido    Apellido del chofer.
     */
    public Chofer(String nroLicencia, CategoriaEnum categoria, long dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.nroLicencia = nroLicencia;
        this.categorias = new ArrayList<ChoferCategoria>();
        this.viajes = new ArrayList<Viaje>();
    }

    /**
     * Obtiene el número de licencia del chofer.
     *
     * @return Número de licencia.
     */
    public String getNroLicencia() {
        return nroLicencia;
    }

    /**
     * Establece el número de licencia del chofer.
     *
     * @param nroLicencia Número de licencia nuevo.
     */
    public void setNroLicencia(String nroLicencia) {
        this.nroLicencia = nroLicencia;
    }

    /**
     * Agrega una nueva categoría (habilitación) al chofer.
     *
     * @param c Objeto ChoferCategoria a agregar.
     */
    public void agregarCategoria(ChoferCategoria c) {
        this.categorias.add(c);
    }

    /**
     * Establece la lista completa de categorías del chofer.
     *
     * @param categorias Lista de categorías a asignar.
     */
    public void setCategorias(ArrayList<ChoferCategoria> categorias) {
        this.categorias = categorias;
    }

    /**
     * Agrega un nuevo viaje realizado por el chofer.
     *
     * @param v Objeto Viaje a agregar.
     */
    public void agregarViaje(Viaje v) {
        this.viajes.add(v);
    }

    /**
     * Obtiene la lista de viajes que ha realizado el chofer.
     *
     * @return Lista de viajes.
     */
    public ArrayList<Viaje> getViajes() {
        return this.viajes;
    }

    /**
     * Establece la lista completa de viajes del chofer.
     *
     * @param viajes Lista de viajes a asignar.
     */
    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }
}