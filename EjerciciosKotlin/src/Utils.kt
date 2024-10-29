import java.util.Scanner

object Utils {
    fun mostrarMenu() {
        println("\nMenú:")
        println("1. Agregar Videojuego")
        println("2. Eliminar Videojuego")
        println("3. Mostrar Inventario")
        println("4. Salir")
        print("Selecciona una opción: ")
    }

    fun gestionarInventario() {
        val inventario = InventarioVideojuegos()
        val scanner = Scanner(System.`in`)
        var opcion: Int

        do {
            mostrarMenu()
            opcion = scanner.nextInt()
            scanner.nextLine() // Limpiar el buffer

            when (opcion) {
                1 -> {
                    print("Introduce el título del videojuego: ")
                    val titulo = scanner.nextLine()
                    print("Introduce la plataforma del videojuego: ")
                    val plataforma = scanner.nextLine()
                    print("Introduce las horas jugadas: ")
                    val horasJugadas = scanner.nextInt()
                    scanner.nextLine() // Limpiar el buffer

                    val videojuego = Videojuego(titulo, plataforma, horasJugadas)
                    inventario.agregarVideojuego(videojuego)
                }

                2 -> {
                    print("Introduce el título del videojuego a eliminar: ")
                    val tituloEliminar = scanner.nextLine()
                    inventario.eliminarVideojuego(tituloEliminar)
                }

                3 -> {
                    inventario.mostrarInventario()
                }

                4 -> {
                    println("Saliendo del programa.")
                }

                else -> {
                    println("Opción no válida. Intente nuevamente.")
                }
            }
        } while (opcion != 4)
    }
}
