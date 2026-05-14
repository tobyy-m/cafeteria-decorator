package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.Infusionable;

public class Canela extends IngredienteDecorator {

   public Canela(Infusionable infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
       return 0.5;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Canela";
    }
    
}
