package Quiz3;

public class Libro extends Recurso implements Prestable {
    public Libro(String nombre, boolean prestado) {
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
        return "Libro {" +
                " Nombre = " + this.getNombre() +
                '}';
    }
}
