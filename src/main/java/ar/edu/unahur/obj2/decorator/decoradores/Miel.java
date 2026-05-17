package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.Infusionable;

public class Miel extends IngredienteDecorator {

    public Miel(Infusionable infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 1.5;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Miel";
    }
}
