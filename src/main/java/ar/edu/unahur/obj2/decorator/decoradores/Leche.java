package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.Infusionable;

public class Leche extends IngredienteDecorator {

    public Leche(Infusionable infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 1.0;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Leche";
    }

}
