package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.excepciones.InfusionNulaException;
import ar.edu.unahur.obj2.decorator.infusiones.Infusionable;

public abstract class IngredienteDecorator implements Infusionable {
    private final Infusionable infusion;

    public IngredienteDecorator(Infusionable infusion) {
        if(infusion==null) throw new InfusionNulaException();
        this.infusion = infusion;
    }

    @Override
    public Double getCosto() {
        return infusion.getCosto() + this.getCostoExtra();
    }

    protected abstract Double getCostoExtra();

    @Override
    public String getNombre() {
        return infusion.getNombre() + " con " + this.getNombreIngrediente();
    }

    protected abstract String getNombreIngrediente();
    

}
