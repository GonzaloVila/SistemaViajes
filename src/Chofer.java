import java.util.ArrayList;

public class Chofer extends Persona{
    private String nroLicencia;
    private ArrayList<ChoferCategoria> categorias;
    private ArrayList<Viaje> viajes;

    public Chofer(){
        this.categorias = new ArrayList<ChoferCategoria>();
        this.viajes = new ArrayList<Viaje>();
    }

    public Chofer(String nroLicencia, CategoriaEnum categoria,long dni, String nombre, String apellido){
        super(dni,nombre,apellido);
        this.nroLicencia = nroLicencia;
        this.categorias = new ArrayList<ChoferCategoria>();
        this.viajes = new ArrayList<Viaje>();
    }

    public String getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(String nroLicencia) {
        this.nroLicencia = nroLicencia;
    }

    public void agregarCategoria(ChoferCategoria c){
        this.categorias.add(c);
    }

    public void setCategorias(ArrayList<ChoferCategoria> categorias) {
        this.categorias = categorias;
    }

    public void agregarViaje(Viaje v){
        this.viajes.add(v);
    }

    public ArrayList<Viaje> getViajes() {
        return this.viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }
}
