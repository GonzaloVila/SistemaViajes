/**
 * Representa una persona con datos básicos de identificación:
 * DNI, nombre y apellido.
 */
public class Persona {

    /** Documento Nacional de Identidad de la persona. */
    private long dni;

    /** Nombre de la persona. */
    private String nombre;

    /** Apellido de la persona. */
    private String apellido;

    /**
     * Constructor vacío.
     */
    public Persona() {}

    /**
     * Constructor completo que permite crear una persona con todos sus datos.
     *
     * @param dni      Documento Nacional de Identidad.
     * @param nombre   Nombre de la persona.
     * @param apellido Apellido de la persona.
     */
    public Persona(long dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Obtiene el DNI de la persona.
     *
     * @return DNI como número largo.
     */
    public long getDni() {
        return dni;
    }

    /**
     * Establece el DNI de la persona.
     *
     * @param dni Número de documento.
     */
    public void setDni(long dni) {
        this.dni = dni;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return Nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el apellido de la persona.
     *
     * @return Apellido.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido de la persona.
     *
     * @param apellido Nuevo apellido.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}