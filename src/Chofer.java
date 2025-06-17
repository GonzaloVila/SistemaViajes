public class Chofer extends Persona{
    private String nroLicencia;
    private Categoria categoria;

    public Chofer(){
        this.nroLicencia = nroLicencia;
        this.categoria = categoria;
    }

    public Chofer(String nroLicencia, Categoria categoria,long dni, String nombre, String apellido){
        super(dni,nombre,apellido);
        this.nroLicencia = nroLicencia;
        this.categoria = categoria;
    }


}
