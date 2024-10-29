class InventarioVideojuegos {
    private val inventario = mutableListOf<Videojuego>()

    fun agregarVideojuego(videojuego: Videojuego) {
        inventario.add(videojuego)
        println("Videojuego agregado al inventario.")
    }

    fun eliminarVideojuego(titulo: String) {
        val encontrado = inventario.removeIf { it.titulo.equals(titulo, ignoreCase = true) }
        if (encontrado) {
            println("Videojuego eliminado del inventario.")
        } else {
            println("No se encontró el videojuego con el título especificado.")
        }
    }

    fun mostrarInventario() {
        if (inventario.isEmpty()) {
            println("El inventario está vacío.")
        } else {
            println("Inventario de Videojuegos:")
            for (videojuego in inventario) {
                println(videojuego)
                println()
            }
        }
    }
}
