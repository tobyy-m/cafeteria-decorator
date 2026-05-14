package ar.edu.unahur.obj2.decorator.infusiones;

public class Te implements Infusionable{

    @Override
    public String getNombre() {
        return "Té";
    }

    @Override
    public Double getCosto() {
        return 2.0;
    }

}
