package ar.edu.unahur.obj2.decorator.infusiones;

public class MateCocido implements Infusionable{

    @Override
    public String getNombre() {
        return "Mate Cocido";
    }

    @Override
    public Double getCosto() {
        return 2.5;
    }

}
