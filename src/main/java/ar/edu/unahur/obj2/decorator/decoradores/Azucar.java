package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.Infusionable;

public class Azucar extends IngredienteDecorator{

    public Azucar(Infusionable infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 1.0;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Azúcar";
    }

}
