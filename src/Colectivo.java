public class Colectivo extends Vehiculo{
    String patente;
    int capacidad;
    Arraylist <Viaje> ListaViajes;
    boolean pisoDoble;

    public Colectivo(){
        this.super(patente, nombre, ListaViajes);
        this.pisoDoble = ;
    }

    public Colectivo(String patente, int capacidad, List<Viaje> ListaViajes, boolean pisoDoble){
        this.super(patente, nombre, ListaViajes);
        this.pisoDoble = pisoDoble;
    }


}