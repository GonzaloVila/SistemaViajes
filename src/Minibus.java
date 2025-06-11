public class Minibus extends Vehiculo{
    String patente;
    int capacidad;
    ArrayList<Viaje> ListaViaje;
    boolean tieneBodega;
    boolean AireAcondicionado;

    public Colectivo(){
        this.super(patente, capacidad, ListaViajes);
        this.tieneBodega = tieneBodega;
        this.AireAcondicionado = AireAcondicionado;

    }
}