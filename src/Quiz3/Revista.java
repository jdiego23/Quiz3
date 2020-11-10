package Quiz3;

public class Revista extends Recurso  implements Prestable{

    public Revista(String nombre, boolean prestado) {
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
        return "Revista{" +
                " Nombre = " + this.getNombre() +
                "}";
    }
}
