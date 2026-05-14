package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.Infusionable;

public class ChocolateExtra extends IngredienteDecorator {

    public ChocolateExtra(Infusionable infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 2.0;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Chocolate Extra";
    }

}
