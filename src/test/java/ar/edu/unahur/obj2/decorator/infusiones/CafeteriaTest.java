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
}
