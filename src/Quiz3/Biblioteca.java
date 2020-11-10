package Quiz3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Recurso> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }
    public void addRecurso(List<Recurso> recursos)
    {
        this.recursos.addAll(recursos);
    }

    public boolean prestadoRecurso(Prestable p)
    {
            p.prestar();
            return true;
    }
    public boolean devolverRecurso(Prestable p)
    {
        p.devolver();
        return false;
    }
    public void listarPrestados(Recurso recursosPrestados)
    {
        boolean prestados = recursos.stream().filter(r-> r.isPrestado()==recursosPrestados.isPrestado()).findAny().isPresent();
        if(!prestados)
        {
            this.recursos.add(recursosPrestados);
        }
        System.out.println(recursosPrestados);
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }
}
