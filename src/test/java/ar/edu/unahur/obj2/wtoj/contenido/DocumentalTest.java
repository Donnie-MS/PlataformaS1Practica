package ar.edu.unahur.obj2.wtoj.contenido;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.wtoj.CanonIdra.CanonIdra;

// static asi se utilzia el motodo sin crear una classe
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentalTest {
    @Test
    public void testQueCalculaCostoLicenciaPorDefecto() {
        Documental documental = new Documental("Jeffrey dahmer", 4.0);
        Double valorObtenido = documental.calcularCostoLicencia();
        Double valorEsperado = 4.5;

        assertEquals(valorEsperado, valorObtenido);
    }
    
    @Test
    public void testQueCalculaCostoLicenciaModificado() {
        Documental documental = new Documental("Los hermanos menendez", 2.0);
        CanonIdra.getInstancia().setCanon(2.0);
        Double valorObtenido = documental.calcularCostoLicencia();
        Double valorEsperado = 4.0;

        assertEquals(valorEsperado, valorObtenido);
    }
}
