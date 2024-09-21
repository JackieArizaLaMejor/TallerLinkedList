/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gestion_Biblioteca;
/**
 *
 * @author USUARIO
 */
public class Libro {
    
    public String titulo;
    public String autor;
    public String isbn;
    public boolean estadoPrestamo;

    public Libro(String titulo, String autor, String isbn, boolean estadoPrestamo) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estadoPrestamo = false;
    }

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

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", estadoPrestamo=" + estadoPrestamo + '}';
    }
    
    
    

    
}
