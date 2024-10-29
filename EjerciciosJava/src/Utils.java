import java.util.Scanner;

public class Utils {
    public static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Agregar Videojuego");
        System.out.println("2. Eliminar Videojuego");
        System.out.println("3. Mostrar Inventario");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void gestionarInventario() {
        InventarioVideojuegos inventario = new InventarioVideojuegos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el título del videojuego: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Introduce la plataforma del videojuego: ");
                    String plataforma = scanner.nextLine();
                    System.out.print("Introduce las horas jugadas: ");
                    int horasJugadas = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    Videojuego videojuego = new Videojuego(titulo, plataforma, horasJugadas);
                    inventario.agregarVideojuego(videojuego);
                    break;

                case 2:
                    System.out.print("Introduce el título del videojuego a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    inventario.eliminarVideojuego(tituloEliminar);
                    break;

                case 3:
                    inventario.mostrarInventario();
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);


    }
}
