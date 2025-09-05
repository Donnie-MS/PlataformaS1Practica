package ar.edu.unahur.obj2.wtoj.contenido;
import java.util.List;
import java.util.ArrayList;

public class Serie extends Contenido{
    private List<Temporada> temporadas;


    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);
        this.temporadas = new ArrayList<>();
    }   

    public void agregarTemporada(Temporada nuevaTemporada) {
        temporadas.add(nuevaTemporada);
    }

    public void agregarEpisodio(Episodio nuevoEpisodio) {
        temporadas.getLast().agregarEpisodio(nuevoEpisodio);
    }

    @Override
    public Double calcularCostoLicencia() {
        return getCostoBase() + calcularPromedioDeTodosLosEpisodios();
    }
    public Double calcularPromedioDeTodosLosEpisodios() {
        return this.ListaDeTodosLosEpisodios().stream()
            .mapToDouble(episodio -> episodio.getCostoDeEpisodio())
            .average()
            .orElse(0.0);
    }

    public List<Episodio> ListaDeTodosLosEpisodios() {
        return temporadas.stream()
            .flatMap(temporada -> temporada.getEpisodios().stream())
            .toList();
    }
}
