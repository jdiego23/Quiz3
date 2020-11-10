package Quiz3;

public class Computador extends Recurso implements Prestable{
    public Computador(String nombre, boolean prestado) {
        super(nombre, prestado);
    }

    @Override
    public void prestar() {
        this.setPrestado(true);
    }

    @Override
    public void devolver() {
        this.setPrestado(false);
    }

    @Override
    public String toString() {
        return "Computador{" +
                " Nombre = " + this.getNombre() +
                '}';
    }
}
