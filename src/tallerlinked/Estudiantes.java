/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerlinked;

/**
 *
 * @author USUARIO
 */
public class Estudiantes {
    String nombre;
    int ID;
    Double promedio;

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

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Estudiantes(String nombre, int ID, Double promedio) {
        this.nombre = nombre;
        this.ID = ID;
        this.promedio = promedio;
    }

    public Estudiantes() {
    }
    
    
}
