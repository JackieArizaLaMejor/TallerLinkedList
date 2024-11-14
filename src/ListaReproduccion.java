import java.util.LinkedList;
import java.util.ListIterator;

class Cancion {
    String titulo;
    String artista;
    double duracion;

    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }
}

public class ListaReproduccion {
    private LinkedList<Cancion> canciones = new LinkedList<>();
    private ListIterator<Cancion> iterador = canciones.listIterator();
    private Cancion cancionActual;

    public void agregarCancion(String titulo, String artista, double duracion) {
        canciones.add(new Cancion(titulo, artista, duracion));
    }

    public void reproducirSiguiente() {
        if (iterador.hasNext()) {
            cancionActual = iterador.next();
            System.out.println("Reproduciendo: " + cancionActual.titulo);
        }
    }

    public void reproducirAnterior() {
        if (iterador.hasPrevious()) {
            cancionActual = iterador.previous();
            System.out.println("Reproduciendo: " + cancionActual.titulo);
        }
    }

    public void mostrarLista() {
        for (Cancion cancion : canciones) {
            System.out.println("Título: " + cancion.titulo + ", Artista: " + cancion.artista + ", Duración: " + cancion.duracion);
        }
    }

    public void eliminarCancion(String titulo) {
        canciones.removeIf(cancion -> cancion.titulo.equals(titulo));
    }
}
