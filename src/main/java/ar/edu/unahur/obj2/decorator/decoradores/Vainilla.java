package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.Infusionable;

public class Vainilla extends IngredienteDecorator {
    public Vainilla(Infusionable infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {

        return 2.5;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Vainilla";
    }

}
