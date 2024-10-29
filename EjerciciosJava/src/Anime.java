public class Anime {

    private String nombre;
    private  String genero;
    private int numeroEpisodios;

    public Anime(String nombre, String genero, int numeroEpisodios) {
        this.nombre = nombre;
        this.genero = genero;
        this.numeroEpisodios = numeroEpisodios;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nGenero: " + genero + "\nNumero de episodios: " + numeroEpisodios;
    }
}
