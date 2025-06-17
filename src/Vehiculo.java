import java.util.ArrayList;
public class Vehiculo {
    String patente;
    int capacidad;
    ArrayList<Viaje> ListaViajes;

    public Vehiculo() {
        this.patente = "";
        this.capacidad = 0;
        this.ListaViajes = new ArrayList<Viaje>();
    }

    public Vehiculo(String patente, int capacidad, ArrayList<Viaje> ListaViajes) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.ListaViajes = ListaViajes;
    }
}

