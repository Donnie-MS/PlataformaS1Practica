package ar.edu.unahur.obj2.wtoj.contenido;

public class Episodio {
    private final String titulo;
    private final Integer nroDeEpisodio;
    private Double costoDeEpisodio;
    
    public Episodio(String titulo, Integer nroDeEpisodio, Double costoDeEpisodio) {
        this.titulo = titulo;
        this.nroDeEpisodio = nroDeEpisodio;
        this.costoDeEpisodio = costoDeEpisodio;
    }

    public Double getCostoDeEpisodio() {
        return costoDeEpisodio;
    }
    public Integer getNroDeEpisodio() {
        return nroDeEpisodio;
    }
}
