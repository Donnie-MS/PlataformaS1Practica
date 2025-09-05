package ar.edu.unahur.obj2.wtoj.contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.wtoj.CanonIdra.CanonIdra;

public class CanonIdraTest {
    @Test
    public void cambiarCanonIdra() {
        CanonIdra.getInstancia().setCanon(5.0);
        Double valorEsperado = 5.0;
        Double valorObtenido = CanonIdra.getInstancia().getCanon();

        assertEquals(valorEsperado, valorObtenido);
    }
}
