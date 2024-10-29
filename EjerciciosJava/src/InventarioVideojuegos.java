import java.util.ArrayList;

public class InventarioVideojuegos {
    private ArrayList<Videojuego> inventario;

    public InventarioVideojuegos() {
        inventario = new ArrayList<>();
    }

    public void agregarVideojuego(Videojuego videojuego) {
        inventario.add(videojuego);
        System.out.println("Videojuego agregado al inventario.");
    }

    public void eliminarVideojuego(String titulo) {
        boolean encontrado = false;
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                inventario.remove(i);
                System.out.println("Videojuego eliminado del inventario.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el videojuego con el título especificado.");
        }
    }

    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de Videojuegos:");
            for (Videojuego videojuego : inventario) {
                System.out.println(videojuego);
            }
        }
    }
}

