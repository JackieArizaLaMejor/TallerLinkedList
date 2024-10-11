package Gestion_Biblioteca;

import java.util.LinkedList;

public class Biblioteca {

    LinkedList<Libro> libros = new LinkedList<>(); // Cambiado de 'libro' a 'libros'
    LinkedList<Usuario> usuarios = new LinkedList<>();
    LinkedList<Prestamo> prestamos = new LinkedList<>(); // Cambiado de 'prestamo' a 'prestamos'

    // Método para agregar libros a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para registrar usuarios
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para prestar un libro
    public boolean prestarLibro(String isbn, int ID) {
        Libro libro = buscarLibroPorIsbn(isbn);

        if (libro == null || libro.isEstadoPrestamo()) {
            System.out.println("El libro no está disponible.");
            return false;
        }

        Usuario usuario = buscarUsuarioPorId(ID);
        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return false;
        }

        Prestamo prestamo = new Prestamo(libro.getTitulo(), ID, "2024-10-11", "2024-10-25");
        prestamos.add(prestamo);
        libro.prestar();

        System.out.println("El libro ha sido prestado con éxito.");
        return true;
    }

    // Método para devolver un libro
    public void devolverLibro(String isbn, int ID) {
        Prestamo prestamo = buscarPrestamo(isbn, ID);
        if (prestamo != null) {
            prestamos.remove(prestamo);
            Libro libro = buscarLibroPorIsbn(isbn);
            if (libro != null) {
                libro.devolver();
                System.out.println("El libro ha sido devuelto.");
            }
        } else {
            System.out.println("No se encontró un préstamo activo para este libro y usuario.");
        }
    }

    // Método para mostrar todos los libros
    public void mostrarTodosLosLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    // Método para mostrar todos los usuarios
    public void mostrarTodosLosUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    // Método para mostrar préstamos activos
    public void mostrarPrestamosActivos() {
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }

    // Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Buscar usuario por ID
    public Usuario buscarUsuarioPorId(int ID) {
        for (Usuario usuario : usuarios) {
            if (usuario.getID() == ID) {
                return usuario;
            }
        }
        return null;
    }

    // Buscar préstamo
    public Prestamo buscarPrestamo(String isbn, int ID) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibroPrestado().equals(isbn) && prestamo.getUsuarioPrestamo() == ID) {
                return prestamo;
            }
        }
        return null;
    }

    public LinkedList<Prestamo> prestamosVencidos() {
        LinkedList<Prestamo> vencidos = new LinkedList<>();
        // Lógica para simular los préstamos vencidos (puedes agregar reglas basadas en fechas)
        for (Prestamo prestamo : prestamos) {
            // Simula que todos los préstamos están vencidos
            vencidos.add(prestamo);
        }
        return vencidos;
    }

}
