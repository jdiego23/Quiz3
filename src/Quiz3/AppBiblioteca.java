package Quiz3;

import java.util.Arrays;

public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro masacre = new Libro("laidy Masacre",false);
        Revista cosmos = new Revista("Cosmos",false);
        Computador portatil = new Computador("Portatil",false);
        
        Tesis grado = new Tesis("Trabajo de Grados",false);
        Plano pUniversidad = new Plano("Planos de la  Universidad",false);

        biblioteca.addRecurso(Arrays.asList(masacre,cosmos,portatil,grado,pUniversidad));


        biblioteca.getRecursos().forEach(r->{
            if(r instanceof Prestable)
            {
                biblioteca.prestadoRecurso((Prestable) r);
                biblioteca.listarPrestados(r);
            }
        });
        System.out.println("");
        biblioteca.devolverRecurso(masacre);

        biblioteca.getRecursos().forEach(r->{
            if(r instanceof Prestable && r.isPrestado()==true)
            {
                biblioteca.listarPrestados(r);
            }
        });

    }
}
