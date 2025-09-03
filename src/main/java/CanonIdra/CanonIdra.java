package CanonIdra;
//Creacion de singletone
public class CanonIdra {
    private static CanonIdra instancia;

    private Double canon = 5.0;

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
}
