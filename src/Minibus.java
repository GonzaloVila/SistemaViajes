import java.util.ArrayList;

public class Minibus extends Vehiculo {
    boolean tieneBodega;
    boolean aireAcondicionado;

    public Minibus() {
        this.tieneBodega = false;
        this.aireAcondicionado = false;
    }

    public Minibus(boolean tieneBodega, boolean aireAcondicionado, String patente, int capacidad, ArrayList<Viaje> listaViajes) {
        super(patente, capacidad, listaViajes);
        this.tieneBodega = tieneBodega;
        this.aireAcondicionado = aireAcondicionado;
    }
}