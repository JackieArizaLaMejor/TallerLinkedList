/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_Biblioteca;

/**
 *
 * @author USUARIO
 */
public class Prestamo {
    
    String libroPrestado;
    int usuarioPrestamo;
    String fechaPrestamo;
    String fechaDevolucion;

    public Prestamo(String libroPrestado, int usuarioPrestamo, String fechaPrestamo, String fechaDevolucion) {
        this.libroPrestado = libroPrestado;
        this.usuarioPrestamo = usuarioPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(String libroPrestado) {
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

    @Override
    public String toString() {
        return "Prestamo{" + "libroPrestado=" + libroPrestado + ", usuarioPrestamo=" + usuarioPrestamo + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + '}';
    }
    
    
    

   
    
    
}
