package Gestion_Biblioteca;

public class Libro {

    public String titulo;
    public String autor;
    public String isbn;
    public boolean estadoPrestamo;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estadoPrestamo = false; // Inicialmente, el libro no está prestado
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(boolean estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    // Método para prestar el libro
    public void prestar() {
        if (!estadoPrestamo) {
            this.estadoPrestamo = true;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    // Método para devolver el libro
    public void devolver() {
        this.estadoPrestamo = false;  // Cambiar el estado a disponible
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", estadoPrestamo=" + estadoPrestamo + '}';
    }
}
