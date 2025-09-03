package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.List;
import java.util.ArrayList;

public class Temporada {
    private List<Episodio> episodios;
    private Integer nroDeTemporada;

    public Temporada(Integer nroDeTemporada) {
        this.nroDeTemporada = nroDeTemporada;
        this.episodios = new ArrayList<>();
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }
    public Integer getNroDeTemporada() {
        return nroDeTemporada;
    }
}
