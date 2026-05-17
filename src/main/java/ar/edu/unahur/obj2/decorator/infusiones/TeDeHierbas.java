package ar.edu.unahur.obj2.decorator.infusiones;

public class TeDeHierbas extends TeBase {
    private String hierba;

    @Override
    public Double doCosto() {
        return 4.0;
    }

    @Override
    public String doExtra() {
        return " de " + this.hierba;
    }

    public TeDeHierbas(String hierba) {
        this.hierba = hierba;
    }

    

}
