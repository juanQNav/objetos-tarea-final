package uaslp.objetos.figuras;

import uaslp.objetos.exception.DatoFaltanteException;
import uaslp.objetos.exception.LadoNoProvistoException;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(){
        super("Cuadrado","Lados iguales");
        lado = 0;
    }

    public Cuadrado(double lado){
        this();
        this.lado = lado;
    }


    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public double getArea() throws LadoNoProvistoException {
        if(lado == 0) throw new LadoNoProvistoException();
        return lado*lado;
    }

    @Override
    public void draw() {
        System.out.println("■");
    }
}
