package ar.edu.unahur.obj2.decorator.excepciones;

public class InfusionNulaException extends RuntimeException {
    public InfusionNulaException(){
        super("La infusion no puede ser nula");
    }
}
