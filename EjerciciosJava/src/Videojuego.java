
public class Videojuego {
    private String titulo;
    private String plataforma;
    private int horasJugadas;

    public Videojuego(String titulo, String plataforma, int horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getHorasJugadas() {
        return horasJugadas;
    }


@Override
    public String toString() {
        return "Titulo: " + titulo + "\nPlataforma: " + plataforma + "\nHoras jugadas: " + horasJugadas;
    }

}
