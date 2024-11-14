import java.util.HashMap;
import java.util.Map;

class Instrumento {
    String codigo;
    String nombre;
    double precio;
    int stock;

    public Instrumento(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}

public class Main {
    private Map<String, Instrumento> inventario = new HashMap<>();

    public void agregarInstrumento(String codigo, String nombre, double precio, int stock) {
        inventario.put(codigo, new Instrumento(codigo, nombre, precio, stock));
    }

    public Instrumento buscarInstrumento(String codigo) {
        return inventario.get(codigo);
    }

    public void realizarVenta(String codigo) {
        Instrumento instrumento = inventario.get(codigo);
        if (instrumento != null && instrumento.stock > 0) {
            instrumento.stock--;
        }
    }

    public void mostrarInstrumentosConStockBajo() {
        for (Instrumento instrumento : inventario.values()) {
            if (instrumento.stock < 5) {
                System.out.println("Código: " + instrumento.codigo + ", Nombre: " + instrumento.nombre + ", Stock: " + instrumento.stock);
            }
        }
    }
}
