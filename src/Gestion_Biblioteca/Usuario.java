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
public class Usuario {
    public String nombre;
    public int ID;
    LinkedList<Prestamo> prestamosActuales = new LinkedList<>();
    

    public Usuario(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LinkedList<Prestamo> getPrestamosActuales() {
        return prestamosActuales;
    }

    public void setPrestamosActuales(LinkedList<Prestamo> prestamosActuales) {
        this.prestamosActuales = prestamosActuales;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", ID=" + ID + ", prestamosActuales=" + prestamosActuales + '}';
    }
    
    public void agregarPrestamo(Prestamo p){
    prestamosActuales.add(p);
    }
    public void eliminarPrestamo(Prestamo p){
    prestamosActuales.remove(p);
    }
}
