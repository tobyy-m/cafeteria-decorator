package ar.edu.unahur.obj2.decorator.infusiones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.decorator.decoradores.*;
import ar.edu.unahur.obj2.decorator.excepciones.InfusionNulaException;

public class CafeteriaTest {
    @Test
    void cafeConLecheSale4(){
        Infusionable cafeConLeche = new Leche(new Cafe());
        assertEquals(4, cafeConLeche.getCosto());
    }

    @Test
    void cafeConLecheYAzucarSale5(){
        Infusionable cafeConLecheYAzucar = new Azucar(new Leche(new Cafe()));
        assertEquals(5, cafeConLecheYAzucar.getCosto());
    }

    @Test
    void cafeConLecheSeMuestraComoCafe_con_Leche(){
        Infusionable cafeConLeche = new Leche(new Cafe());
        assertEquals("Café con Leche", cafeConLeche.getNombre());
    }

    @Test
    void teConLecheYAzucarYCanelaSale6(){
        Infusionable teConLecheYAzucarYCanela = new Canela(new Azucar(new Leche(new Te())));
        assertEquals(4.5, teConLecheYAzucarYCanela.getCosto());
    }
    @Test
    void teConLecheYAzucarYCanelaSeMuestraComoTe_con_Leche_con_Azucar_con_Canela(){
        Infusionable teConLecheYAzucarYCanela = new Canela(new Azucar(new Leche(new Te())));
        assertEquals("Té con Leche con Azúcar con Canela", teConLecheYAzucarYCanela.getNombre());
    }

    @Test
    void chocolateCalienteConChocolateExtraYAzucarSale7(){
        Infusionable chocolateCalienteConChocolateExtraYAzucar = new Azucar(new ChocolateExtra(new ChocolateCaliente()));
        assertEquals(7, chocolateCalienteConChocolateExtraYAzucar.getCosto());
    }

    @Test
    void chocolateCalienteConChocolateExtraYAzucarSeMuestraComoChocolateCaliente_con_ChocolateExtra_con_Azucar(){
        Infusionable chocolateCalienteConChocolateExtraYAzucar = new Azucar(new ChocolateExtra(new ChocolateCaliente()));
        assertEquals("Chocolate Caliente con Chocolate Extra con Azúcar", chocolateCalienteConChocolateExtraYAzucar.getNombre());
    }

    @Test
    void lanzaExcepcionSiSeCreaUnaInfusionDecoradaConDecoradorNull(){
        assertThrows(InfusionNulaException.class, 
            ()-> new Leche(null));
    }

    @Test
    void chocolateCalienteConCremaYCanelaSale7(){
        Infusionable chocolateCalienteConCremaYCanela = new Canela(new Crema(new ChocolateCaliente()));
        assertEquals(6.5, chocolateCalienteConCremaYCanela.getCosto());
    }

    @Test
    void chocolateCalienteConCremaYCanelaSeMuestraComoChocolateCaliente_con_Crema_con_Canela(){
        Infusionable chocolateCalienteConCremaYCanela = new Canela(new Crema(new ChocolateCaliente()));
        assertEquals("Chocolate Caliente con Crema con Canela", chocolateCalienteConCremaYCanela.getNombre());
    }

    @Test
    void teDeHierbasDeMentaConAzucarSale5(){
        Infusionable teDeHierbasDeMentaConAzucar = new Azucar(new TeDeHierbas("menta"));
        assertEquals(5, teDeHierbasDeMentaConAzucar.getCosto());
    }

    @Test
    void teDeHierbasDeMentaConAzucarSeMuestraComoTe_de_Hierbas_de_menta_con_Azucar(){
        Infusionable teDeHierbasDeMentaConAzucar = new Azucar(new TeDeHierbas("menta"));
        assertEquals("Té de menta con Azúcar", teDeHierbasDeMentaConAzucar.getNombre());
    }

    @Test
    void teDeHierbasDeBoldoConAzucarConAzucarSale6(){
        Infusionable teDeHierbasDeBoldoConAzucarConAzucar = new Azucar(new Azucar(new TeDeHierbas("boldo")));
        assertEquals(6, teDeHierbasDeBoldoConAzucarConAzucar.getCosto());
    }

    @Test
    void teDeHierbasDeBoldoConAzucarConAzucarSeMuestraComoTe_de_Hierbas_de_boldo_con_Azucar_con_Azucar(){
        Infusionable teDeHierbasDeBoldoConAzucarConAzucar = new Azucar(new Azucar(new TeDeHierbas("boldo")));
        assertEquals("Té de boldo con Azúcar con Azúcar", teDeHierbasDeBoldoConAzucarConAzucar.getNombre());
    }

    @Test 
    void teDeLimonConAzucarSale4(){
        Infusionable teDeLimonConAzucar = new Azucar(new TeDeLimon());
        assertEquals(4, teDeLimonConAzucar.getCosto());
    }

    @Test
    void teDeLimonConAzucarSeMuestraComoTe_de_Limon_con_Azucar(){
        Infusionable teDeLimonConAzucar = new Azucar(new TeDeLimon());
        assertEquals("Té de limón con Azúcar", teDeLimonConAzucar.getNombre());
    }

    @Test
    void cafeConLecheYAzucarYVainillaSale7Con5(){
        Infusionable cafeConLecheYAzucarYVainilla = new Vainilla(new Azucar(new Leche(new Cafe())));
        assertEquals(7.5, cafeConLecheYAzucarYVainilla.getCosto());
    }

    @Test
    void cafeConLecheYAzucarYVainillaSeMuestraComoCafe_con_Leche_con_Azucar_con_Vainilla(){
        Infusionable cafeConLecheYAzucarYVainilla = new Vainilla(new Azucar(new Leche(new Cafe())));
        assertEquals("Café con Leche con Azúcar con Vainilla", cafeConLecheYAzucarYVainilla.getNombre());
    }
    @Test
    void mateCocidoConLecheYAzucarSale4Con5(){
        Infusionable mateCocidoConLecheYAzucar = new Azucar(new Leche(new MateCocido()));
        assertEquals(4.5, mateCocidoConLecheYAzucar.getCosto());
    }
    @Test
    void mateCocidoConLecheYAzucarSeMuestraComoMate_Cocido_con_Leche_con_Azucar(){
        Infusionable mateCocidoConLecheYAzucar = new Azucar(new Leche(new MateCocido()));
        assertEquals("Mate Cocido con Leche con Azúcar", mateCocidoConLecheYAzucar.getNombre());
    }
    @Test
    void teDeLimonConMielSale4Con5(){
        Infusionable teDeLimonConMiel = new Miel(new TeDeLimon());
        assertEquals(4.5, teDeLimonConMiel.getCosto());
    }
    @Test
    void teDeLimonConMielSeMuestraComoTe_de_Limon_con_Miel(){
        Infusionable teDeLimonConMiel = new Miel(new TeDeLimon());
        assertEquals("Té de limón con Miel", teDeLimonConMiel.getNombre());
    }
}
