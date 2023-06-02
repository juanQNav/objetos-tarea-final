package uaslp.objetos.escuela;


import java.util.HashMap;
import java.util.Map;

public class SalaDeJuntasFactory {
    private static Map<String, SalaDeJuntas> salaMap = new HashMap<>();

    public static SalaDeJuntas get(String nombre) {
        if (salaMap.containsKey(nombre)) {
            return salaMap.get(nombre);
        } else {
            SalaDeJuntas salaDeJuntas = new SalaDeJuntas(nombre);
            salaMap.put(nombre, salaDeJuntas);
            return salaDeJuntas;
        }
    }
}

