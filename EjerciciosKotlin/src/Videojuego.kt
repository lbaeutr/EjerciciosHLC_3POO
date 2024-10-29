data class Videojuego(
    val titulo: String,
    val plataforma: String,
    val horasJugadas: Int
) {
    override fun toString(): String {
        return "Titulo: $titulo\nPlataforma: $plataforma\nHoras jugadas: $horasJugadas"
    }
}
