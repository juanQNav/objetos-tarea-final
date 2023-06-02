package uaslp.objetos.figuras;

import uaslp.objetos.exception.NumeroInvalidoDeLados;

import static java.lang.Math.tan;
import static java.lang.Math.toRadians;

public class PoligonoRegular extends Figura{
    private final int lados;
    private double lado;

    public PoligonoRegular(int lados) {
        super("Poligono Regular","Poligono");
        if(lados < 5) throw new NumeroInvalidoDeLados
                ("Número de lados válido a partir de 5");
        this.lados = lados;
    }

    public PoligonoRegular(int lados, double lado){
        this(lados);
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return (getPerimetro() * getApotema()) / 2;
    }

    public double getPerimetro(){
        return lado * lados;
    }

    public double getApotema(){
        double theta = 360.0/(2*lados);
        theta = toRadians(theta);
        return lado/(2*tan(theta));

    }

    @Override
    public void draw() {
        System.out.println("■");
    }
}
