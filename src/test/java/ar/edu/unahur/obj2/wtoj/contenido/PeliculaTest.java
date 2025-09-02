package ar.edu.unahur.obj2.wtoj.contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PeliculaTest {
    @Test
    public void testQueCalculaCostoLicencia() {
        //Preparacion (Armo el escenario)
        Pelicula pelicula = new Pelicula("Matriz", 3.0);
        Double valorEsperado = 3.0;
        //Ejecucion (Invoco el comportamiento a probar)
        Double valorObtenido = pelicula.calcularCostoLicencia();
        //Contrastacion (Verifico que lo que espero que suceda vaya a suceder)
        assertEquals(valorEsperado, valorObtenido);
    }
}
