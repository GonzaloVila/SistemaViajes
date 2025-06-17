public class Colectivo extends Vehiculo{
    boolean pisoDoble;

    public Colectivo(){
        this.pisoDoble = true;
    
    }
    
    public Colectivo(String patente, int capacidad, ArrayList<Viaje> ListaViajes, boolean pisoDoble){
        super(patente,capacidad, ListaViajes);
        this.pisoDoble = pisoDoble;
    }


}