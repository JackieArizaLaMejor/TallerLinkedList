import java.util.ArrayList;

class Usuario {
    int id;
    String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}

public class RedSocial {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private boolean[][] conexiones;

    public RedSocial(int numUsuarios) {
        conexiones = new boolean[numUsuarios][numUsuarios];
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void seguir(int idUsuario1, int idUsuario2) {
        conexiones[idUsuario1][idUsuario2] = true;
    }

    public void mostrarSeguidores(int idUsuario) {
        for (int i = 0; i < conexiones.length; i++) {
            if (conexiones[i][idUsuario]) {
                System.out.println("Usuario " + usuarios.get(i).nombre + " sigue a " + usuarios.get(idUsuario).nombre);
            }
        }
    }

    public boolean estanConectados(int idUsuario1, int idUsuario2) {
        return conexiones[idUsuario1][idUsuario2];
    }

    public Usuario usuarioConMasSeguidores() {
        int maxSeguidores = 0;
        Usuario popular = null;

        for (int i = 0; i < conexiones.length; i++) {
            int seguidores = 0;
            for (boolean[] conexion : conexiones) {
                if (conexion[i]) seguidores++;
            }
            if (seguidores > maxSeguidores) {
                maxSeguidores = seguidores;
                popular = usuarios.get(i);
            }
        }
        return popular;
    }
}
