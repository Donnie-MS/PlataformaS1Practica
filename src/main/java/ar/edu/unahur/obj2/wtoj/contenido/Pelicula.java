package ar.edu.unahur.obj2.wtoj.contenido;

public class Pelicula {
    private String titulo;
    private Double costoBase;

    public Pelicula(String titulo, double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }
    public Double calcularCostoLicencia() {
        return costoBase;
    }
}
