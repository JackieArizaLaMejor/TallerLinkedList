package Gestion_Biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestamo {
    
    Libro libroPrestado;  // Cambia de String a Libro
    int usuarioPrestamo;
    String fechaPrestamo;
    String fechaDevolucion;

public Prestamo(Libro libroPrestado, int usuarioPrestamo, String fechaPrestamo, String fechaDevolucion) {
    this.libroPrestado = libroPrestado;  // Tipo Libro
    this.usuarioPrestamo = usuarioPrestamo;
    this.fechaPrestamo = fechaPrestamo;
    this.fechaDevolucion = fechaDevolucion;
}

    public Libro getLibroPrestado() {  // Cambia el getter a Libro
        return libroPrestado;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public int getUsuarioPrestamo() {
        return usuarioPrestamo;
    }

    public void setUsuarioPrestamo(int usuarioPrestamo) {
        this.usuarioPrestamo = usuarioPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
        // Método para verificar si el préstamo está vencido
    public boolean isVencido() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaDevolucionLocal = LocalDate.parse(fechaDevolucion, formatter);
        LocalDate fechaActual = LocalDate.now();

        // Si la fecha actual es después de la fecha de devolución
        return fechaActual.isAfter(fechaDevolucionLocal);
    }

    @Override
    public String toString() {
        return "Prestamo{" + "libroPrestado=" + libroPrestado.getTitulo() + ", usuarioPrestamo=" + usuarioPrestamo + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + '}';
    }
}
