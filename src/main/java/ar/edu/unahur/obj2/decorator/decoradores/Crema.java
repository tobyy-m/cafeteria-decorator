package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.Infusionable;

public class Crema extends IngredienteDecorator {

    public Crema(Infusionable infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 2.0;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Crema";
    }

}
