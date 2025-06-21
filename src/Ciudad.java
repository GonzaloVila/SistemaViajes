import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private ProvinciaEnum provincia;
    private ArrayList<Viaje> viajes;

    public Ciudad() {
        this.viajes = new ArrayList<Viaje>();
    }

    public Ciudad(String nombre, ProvinciaEnum provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.viajes = new ArrayList<Viaje>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ProvinciaEnum getProvincia() {
        return provincia;
    }

    public void setProvincia(ProvinciaEnum provincia) {
        this.provincia = provincia;
    }

    public void agregarViaje(Viaje v){
        this.viajes.add(v);
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }
}
