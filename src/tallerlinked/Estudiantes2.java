
package tallerlinked;


public class Estudiantes2 {
    String nombre;
    int ID;
    double promedio;

<<<<<<< HEAD
    public Estudiantes2(int ID, String nombre, double promedio) {
=======
    public Estudiantes2(String nombre, int ID, double promedio) {
>>>>>>> 78ebae50f63d262b791e7bed4f8a90a82cb435ef
        this.nombre = nombre;
        this.ID = ID;
        this.promedio = promedio;
    }
    public Estudiantes2() {
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

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiantes2{" + "nombre=" + nombre + ", ID=" + ID + ", promedio=" + promedio + '}';
    }
    
}
