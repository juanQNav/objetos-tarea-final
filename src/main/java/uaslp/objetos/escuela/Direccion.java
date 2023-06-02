package uaslp.objetos.escuela;

public class Direccion {
    private static Direccion instancia;

    private Direccion() {

    }

    public static Direccion getInstance() {
        if (instancia == null) {
            instancia = new Direccion();
        }
        return instancia;
    }
}

