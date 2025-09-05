package ar.edu.unahur.obj2.wtoj.PlanesDeSubscripcion;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.plataforma.Usuario;

import java.util.List;

public class PlanBasico implements PlanDeSubscripcion {
    private Integer limite;
    private Double valor = 5.0;
    public PlanBasico(Integer limite) {
        this.limite = limite;
    }

    @Override
    public Double calcularCostoPlanDe(Usuario usuario) {
        
        if (limite >= usuario.cantidadDeContenidos()) {
            return valor;
        }
        else {
            List<Contenido> excedentes = usuario.getContenidos()
                .subList(limite, usuario.cantidadDeContenidos());
            
            Double adicional = excedentes.stream()
                .mapToDouble(contenido -> contenido.calcularCostoLicencia())
                .sum();
            return valor + adicional;
        }
    }
}
