import java.util.ArrayList;

public class Categoria {
    private CategoriaEnum tipo;
    private ArrayList<Chofer> choferes;

    public Categoria(){
        this.choferes = new ArrayList<Chofer>();
    }

    public Categoria(CategoriaEnum tipo) {
        this.tipo = tipo;
        this.choferes = new ArrayList<Chofer>();
    }

    public CategoriaEnum getTipo() {
        return tipo;
    }

    public void setTipo(CategoriaEnum tipo) {
        this.tipo = tipo;
    }

    public void agregarCategoria(Chofer c){
        this.choferes.add(c);
    }

    public void setChoferes(ArrayList<Chofer> choferes) {
        this.choferes = choferes;
    }
}
