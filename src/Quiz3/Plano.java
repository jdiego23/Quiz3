package Quiz3;

public class Plano extends Recurso  {

    public Plano(String nombre, boolean prestado) {
        super(nombre, prestado);
    }

    @Override
    public String toString() {
        return "Plano{" +
        "Nombre = " + this.getNombre() +
                '}';
    }
}
