package Gestion_Biblioteca;

import java.util.LinkedList;

public class Biblioteca {

    LinkedList<Libro> libros = new LinkedList<>();
    LinkedList<Usuario> usuarios = new LinkedList<>();
    LinkedList<Prestamo> prestamos = new LinkedList<>();

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
        Libro libro = buscarLibroPorIsbn(isbn); // Encuentra el libro por su ISBN

        if (libro == null || libro.isEstadoPrestamo()) { // Si no existe o ya está prestado
            System.out.println("El libro no está disponible.");
            return false;
        }

        Usuario usuario = buscarUsuarioPorId(ID); // Encuentra el usuario por su ID
        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return false;
        }

        // Crear un nuevo préstamo para el libro y agregarlo a la lista de préstamos
        Prestamo prestamo = new Prestamo(libro, ID, "2024-10-11", "2024-10-10");
        prestamos.add(prestamo);

        // Cambiar el estado del libro a prestado
        libro.prestar();

        // Agregar el préstamo a la lista de préstamos del usuario
        usuario.agregarPrestamo(prestamo);

        System.out.println("El libro ha sido prestado con éxito.");
        return true;
    }

    // Método para devolver un libro
    public void devolverLibro(String isbn, int ID) {
        // Buscar el préstamo correspondiente
        Prestamo prestamo = buscarPrestamo(isbn, ID);

        if (prestamo != null) {
            // Eliminar el préstamo de la lista de préstamos activos
            prestamos.remove(prestamo);

            // Buscar el libro por ISBN y marcarlo como disponible
            Libro libro = buscarLibroPorIsbn(isbn);
            if (libro != null) {
                libro.devolver();  // Cambiar el estado del libro a "disponible"
            }

            // Buscar el usuario por ID y eliminar el préstamo de su lista
            Usuario usuario = buscarUsuarioPorId(ID);
            if (usuario != null) {
                usuario.eliminarPrestamo(prestamo); // Eliminar el préstamo de la lista del usuario
            }

            System.out.println("El libro " + libro.getTitulo() + " ha sido devuelto.");
        } else {
            System.out.println("No se encontró un préstamo activo para este libro y usuario.");
        }
    }

    // Otros métodos necesarios (buscar libro, buscar usuario, etc.)
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) { // Si los ISBN coinciden
                return libro;
            }
        }
        return null; // Si no se encuentra el libro
    }

    public Usuario buscarUsuarioPorId(int ID) {
        for (Usuario usuario : usuarios) {
            if (usuario.getID() == ID) { // Si los ID coinciden
                return usuario;
            }
        }
        return null; // Si no se encuentra el usuario
    }

    public Prestamo buscarPrestamo(String isbn, int ID) {
        for (Prestamo prestamo : prestamos) {
            // Ahora comparamos el ISBN del objeto Libro
            if (prestamo.getLibroPrestado().getIsbn().equals(isbn) && prestamo.getUsuarioPrestamo() == ID) {
                return prestamo;
            }
        }
        return null;
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    public void mostrarPrestamosActivos() {
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }

    // Método para encontrar los préstamos vencidos
    public LinkedList<Prestamo> prestamosVencidos() {
        LinkedList<Prestamo> vencidos = new LinkedList<>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.isVencido()) { // Si el préstamo está vencido
                vencidos.add(prestamo);
            }
        }
        return vencidos;
    }

    public void mostrarPrestamosVencidos() {
        LinkedList<Prestamo> vencidos = prestamosVencidos();
        if (vencidos.isEmpty()) {
            System.out.println("No hay préstamos vencidos.");
        } else {
            for (Prestamo prestamo : vencidos) {
                System.out.println(prestamo);
            }
        }
    }
}
