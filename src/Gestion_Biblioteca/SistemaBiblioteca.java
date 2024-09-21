/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_Biblioteca;

import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class SistemaBiblioteca {
        public static void main(String[] args) {
            Biblioteca biblioteca = new Biblioteca();

            // Agregar libros
            biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474728"));
            biblioteca.agregarLibro(new Libro("El código Da Vinci", "Dan Brown", "978-0307474729"));
            biblioteca.agregarLibro(new Libro("El alquimista", "Paulo Coelho", "978-0062315007"));

            // Registrar usuarios
            biblioteca.registrarUsuario(new Usuario("Juan Pérez", "U001"));
            biblioteca.registrarUsuario(new Usuario("María López", "U002"));

            // Prestar libros
            biblioteca.prestarLibro("978-0307474728", "U001");
            biblioteca.prestarLibro("978-0307474729", "U002");

            // Mostrar estado actual
            System.out.println("Libros en la biblioteca:");
            biblioteca.mostrarLibros();

            System.out.println("\nUsuarios registrados:");
            biblioteca.mostrarUsuarios();

            System.out.println("\nPréstamos activos:");
            biblioteca.mostrarPrestamosActivos();

            // Devolver un libro
            biblioteca.devolverLibro("978-0307474728", "U001");

            System.out.println("\nEstado después de devolución:");
            biblioteca.mostrarPrestamosActivos();

            // Mostrar préstamos vencidos (simular)
            System.out.println("Préstamos vencidos:");
            LinkedList<Prestamo> vencidos = biblioteca.prestamosVencidos();
            for (Prestamo prestamo : vencidos) {
                System.out.println(prestamo);
            }
        }
    }


