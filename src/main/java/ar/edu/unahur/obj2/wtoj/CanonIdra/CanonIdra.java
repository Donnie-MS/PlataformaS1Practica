package ar.edu.unahur.obj2.wtoj.CanonIdra;
//Creacion de singletone
public class CanonIdra {
    private static CanonIdra instancia;

    private final Double canonInicial = 0.5;
    private Double canon = canonInicial;
    
    private CanonIdra() {}

    public static CanonIdra getInstancia() {
        if (instancia == null) {
            instancia = new CanonIdra();
        }

        return instancia;
    }

    public Double getCanon() {
        return canon;
    }
    
    public void setCanon(Double nuevoCanon) {
        canon = nuevoCanon;
    }

    public void reset() {
        canon = canonInicial;
    }
}
