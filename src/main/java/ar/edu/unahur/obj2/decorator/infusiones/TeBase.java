package ar.edu.unahur.obj2.decorator.infusiones;

public abstract class TeBase implements Infusionable {

    @Override
    public String getNombre() {
        return "Té" + this.doExtra();
    }

    @Override
    public Double getCosto() {
        return this.doCosto();
    }

    public abstract String doExtra();

    public abstract Double doCosto();
}
