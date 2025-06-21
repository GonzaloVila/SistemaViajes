import java.util.ArrayList;
public class Vehiculo {
    private String patente;
    private int capacidad;
    private ArrayList<Viaje> viajes;

    public Vehiculo() {
        this.viajes = new ArrayList<Viaje>();
    }

    public Vehiculo(String patente, int capacidad) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.viajes = new ArrayList<Viaje>();
    }


    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
