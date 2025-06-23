import java.util.ArrayList;
/**
 * Representa una ciudad en el sistema, definida por su nombre y la provincia
 * a la que pertenece.
 * Cada ciudad puede tener asociados múltiples viajes (ya sea como origen o destino).
 */
public class Ciudad {

    /** Nombre de la ciudad. */
    private String nombre;

    /** Provincia a la que pertenece la ciudad, definida por un enum. */
    private ProvinciaEnum provincia;

    /** Lista de viajes asociados a esta ciudad (como origen o destino). */
    private ArrayList<Viaje> viajes;

    /**
     * Constructor por defecto de Ciudad.
     * Inicializa el nombre y la provincia como nulos, y la lista de viajes vacía.
     */
    public Ciudad() {
        this.viajes = new ArrayList<Viaje>();
    }

    /**
     * Constructor que permite inicializar una ciudad con su nombre y provincia.
     * La lista de viajes se inicializa vacía.
     *
     * @param nombre    El nombre de la ciudad.
     * @param provincia La provincia a la que pertenece la ciudad (usando ProvinciaEnum).
     */
    public Ciudad(String nombre, ProvinciaEnum provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.viajes = new ArrayList<Viaje>();
    }

    /**
     * Obtiene el nombre de la ciudad.
     *
     * @return El nombre de la ciudad como String.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la ciudad.
     *
     * @param nombre El nuevo nombre de la ciudad.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la provincia a la que pertenece la ciudad.
     *
     * @return La provincia de la ciudad (ProvinciaEnum).
     */
    public ProvinciaEnum getProvincia() {
        return provincia;
    }

    /**
     * Establece la provincia a la que pertenece la ciudad.
     *
     * @param provincia La nueva provincia de la ciudad (ProvinciaEnum).
     */
    public void setProvincia(ProvinciaEnum provincia) {
        this.provincia = provincia;
    }

    /**
     * Agrega un viaje a la lista de viajes asociados a esta ciudad.
     *
     * @param v El objeto Viaje a agregar.
     */
    public void agregarViaje(Viaje v) {
        this.viajes.add(v);
    }

    /**
     * Establece la lista completa de viajes asociados a esta ciudad.
     *
     * @param viajes La nueva lista de viajes a asignar.
     */
    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }
}