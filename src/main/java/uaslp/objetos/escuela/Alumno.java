package uaslp.objetos.escuela;

import java.time.LocalDate;

public class Alumno {
    private final String nombre;
    private final String clave;
    private final String claveDeCarrera;
    private final int anioDeIngreso;
    private final LocalDate fechaNacimiento;

    Alumno(String nombre, String clave, String claveDeCarrera, int anioDeIngreso, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.clave = clave;
        this.claveDeCarrera = claveDeCarrera;
        this.anioDeIngreso = anioDeIngreso;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public static AlumnoBuilder builder (){
        return new AlumnoBuilder();
    }

}
