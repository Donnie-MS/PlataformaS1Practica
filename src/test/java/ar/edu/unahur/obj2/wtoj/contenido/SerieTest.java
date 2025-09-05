package ar.edu.unahur.obj2.wtoj.contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SerieTest {
    Serie modernFamily = new Serie("Modern Family", 5.0);
    Temporada t1 = new Temporada(1);
    Episodio ep1 = new Episodio("Piloto", 1, 2.0);
    @Test
    public void testQueCalculaCostoLicencia() {
        modernFamily.agregarTemporada(t1);
        modernFamily.agregarEpisodio(ep1);
        Double valorEsperado = 7.0;
        Double valorObtenido = modernFamily.calcularCostoLicencia();

        assertEquals(valorEsperado, valorObtenido);
    }
}
