package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    public EvaluadorDePromedios evaluadorDePromedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios e){
        evaluadorDePromedios = e;
    }

    public EvaluadorDePromedios getInstanceEvaluadorDePromedios(){
        if(evaluadorDePromedios == null){
            evaluadorDePromedios = new EvaluadorDePromedios();
        }
        return evaluadorDePromedios;
    }

    public double evalua(String numbers){
        List<Double> calificaciones = new ArrayList<>();
        String[] numbersArray = numbers.split(",");

        for(String a: numbersArray){
            calificaciones.add(Double.parseDouble(a));
        }

        return evaluadorDePromedios.evalua(calificaciones);
    }
}
