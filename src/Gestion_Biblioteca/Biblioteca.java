package Gestion_Biblioteca;

import Gestion_Biblioteca.Libro;
import Gestion_Biblioteca.Prestamo;
import Gestion_Biblioteca.Usuario;
import java.util.LinkedList;

public class Biblioteca {

    LinkedList<Libro> libro = new LinkedList<>();
    LinkedList<Usuario> usuario = new LinkedList<>();
    LinkedList<Prestamo> prestamo = new LinkedList<>();

    public void agregarLibro(Libro libros) {
        libro.add(libros);
    }

<<<<<<< HEAD
    public void registrarLibro() {
=======
    public void registrarUsuario() {

>>>>>>> 54bb75728240899a10524c8ecab74031e09f7244
    }

    public boolean prestarLibro(String isbn, int ID) {
        Libro libro = buscarLibroPorIsbn(isbn);

        return true;

    }

    public void devolverLibro() {

    }

    public void mostrarTodosLosLibros() {

    }

    public void mostrarTodosLosUsuarios() {

    }

    public void mostrarPrestamosActivos() {

    }

    public Libro buscarLibroPorIsbn(String isbn) {
        return null;
    }

    public void buscarUsuarioPorId() {

    }

    public void listaPrestamosVencidos() {

    }
}
