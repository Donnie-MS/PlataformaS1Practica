package ar.edu.unahur.obj2.wtoj.contenido;

import ar.edu.unahur.obj2.wtoj.CanonIdra.CanonIdra;

public class Documental extends Contenido {

    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }
    public Double calcularCostoLicencia() {
        return getCostoBase() + CanonIdra.getInstancia().getCanon();
    }
}
