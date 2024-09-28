
package tallerlinked;


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

    public Estudiantes(int ID, String nombre, double promedio) {
        this.nombre = nombre;
        this.ID = ID;
        this.promedio = promedio;
    }

    public Estudiantes() {
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", ID=" + ID + ", promedio=" + promedio + '}';
    }
    
    
}
