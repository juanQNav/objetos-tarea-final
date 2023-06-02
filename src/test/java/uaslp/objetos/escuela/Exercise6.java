package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX
     */

    @Test
    public void validateTwoEqualIntegers(){
        int a = 3;
        int b = 3;
        String c = "";
        InstanciaDependencia instanciaDependencia = new InstanciaDependencia();

        AlgoritmoX algoritmoX = new
                AlgoritmoX(instanciaDependencia,instanciaDependencia,instanciaDependencia);
        algoritmoX.algoritmoACubrir(a,b,c);

        Assertions.assertTrue(instanciaDependencia.isSaved());
    }

    @Test
    public void validateBIsGreaterThanA(){
        int a = 1;
        int b = 3;
        String c = "";
        InstanciaDependencia instanciaDependencia = new InstanciaDependencia();

        AlgoritmoX algoritmoX = new
                AlgoritmoX(instanciaDependencia,instanciaDependencia,instanciaDependencia);
        algoritmoX.algoritmoACubrir(a,b,c);

        Assertions.assertTrue(instanciaDependencia.isPrinted());
    }

    @Test
    public void validateAIsGreaterThanB(){
        int a = 6;
        int b = 3;
        String c = "";
        InstanciaDependencia instanciaDependencia = new InstanciaDependencia();

        AlgoritmoX algoritmoX = new
                AlgoritmoX(instanciaDependencia,instanciaDependencia,instanciaDependencia);
        algoritmoX.algoritmoACubrir(a,b,c);

        Assertions.assertTrue(instanciaDependencia.isSent());
    }

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }
}
