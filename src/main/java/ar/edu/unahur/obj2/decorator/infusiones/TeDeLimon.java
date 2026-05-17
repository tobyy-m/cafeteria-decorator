package ar.edu.unahur.obj2.decorator.infusiones;

public class TeDeLimon extends TeBase {


    @Override
    public String doExtra() {
        return " de limón";
    }

    @Override
    public Double doCosto() {
        return 3.0;
    }
}
