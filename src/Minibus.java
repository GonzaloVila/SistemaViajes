public class Minibus extends Vehiculo {
    boolean tieneBodega;
    boolean aireAcondicionado;

    public Minibus() {}

    public Minibus(boolean tieneBodega, boolean aireAcondicionado, String patente, int capacidad) {
        super(patente, capacidad);
        this.tieneBodega = tieneBodega;
        this.aireAcondicionado = aireAcondicionado;
    }
}