class Anime(
    private val nombre: String,
    private val genero: String,
    private val numeroEpisodios: Int
) {
    override fun toString(): String {
        return "Nombre: $nombre\nGenero: $genero\nNumero de episodios: $numeroEpisodios"
    }
}
