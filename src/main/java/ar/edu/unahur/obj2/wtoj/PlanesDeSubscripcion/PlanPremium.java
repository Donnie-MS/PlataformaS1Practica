package ar.edu.unahur.obj2.wtoj.PlanesDeSubscripcion;

import ar.edu.unahur.obj2.wtoj.plataforma.Usuario;

public class PlanPremium implements PlanDeSubscripcion{
    private Double valor = 12.0;

    public Double calcularCostoPlanDe(Usuario usuario) {
        return valor;
    }
}
