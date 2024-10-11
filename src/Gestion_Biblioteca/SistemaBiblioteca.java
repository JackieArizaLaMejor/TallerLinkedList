package Gestion_Biblioteca;

import java.util.LinkedList;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros
        biblioteca.agregarLibro(new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", "978-0307474728"));
        biblioteca.agregarLibro(new Libro("El codigo Da Vinci", "Dan Brown", "978-0307474729"));
        biblioteca.agregarLibro(new Libro("El alquimista", "Paulo Coelho", "978-0062315007"));

        // Registrar usuarios
        biblioteca.registrarUsuario(new Usuario("Juan Perez", 1));
        biblioteca.registrarUsuario(new Usuario("Maria Lopez", 2));

        // Prestar libros
        biblioteca.prestarLibro("978-0307474728", 1);
        biblioteca.prestarLibro("978-0307474729", 2);

        // Mostrar estado actual
        System.out.println("\nLibros en la biblioteca:");
        biblioteca.mostrarLibros();

        System.out.println("\nUsuarios registrados:");
        biblioteca.mostrarUsuarios();

        System.out.println("\nPrestamos activos:");
        biblioteca.mostrarPrestamosActivos();

        // Devolver un libro
        biblioteca.devolverLibro("978-0307474728", 1);

        System.out.println("\nEstado despues de devolucion:");
        biblioteca.mostrarPrestamosActivos();

        // Mostrar prestamos vencidos (simular)
        System.out.println("\nPrestamos vencidos:");
        biblioteca.mostrarPrestamosVencidos();
    }
}
