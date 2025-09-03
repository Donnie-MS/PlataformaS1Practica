package ar.edu.unahur.obj2.wtoj.contenido;

public class Pelicula extends Contenido{

    public Pelicula(String titulo, Double costoBase) {
        super(titulo, costoBase);

    }
    public Double calcularCostoLicencia() {
        return getCostoBase();
    }
}
