package com.example.android.tallerenclase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void MasculinoZapatillasNike() {
        double ve = 120000;
        double vr = Metodos.Cotizar(0,0,0,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void MasculinoZapatillasNikeCantidadIgualADos() {
        double ve = 240000;
        double vr = Metodos.Cotizar(0,0,0,2)[1];
        assertEquals(ve,vr,0);
    }

    @Test
    public void MasculinoZapatillasAdidas() {
        double ve = 140000;
        double vr = Metodos.Cotizar(0,0,1,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void MasculinoZapatillasAdidasCantidadIgualADos() {
        double ve = 280000;
        double vr = Metodos.Cotizar(0,0,1,2)[1];
        assertEquals(ve,vr,0);
    }

    @Test
    public void MasculinoZapatillasPuma() {
        double ve = 130000;
        double vr = Metodos.Cotizar(0,0,2,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void MasculinoZapatillasPumaCantidadIgualADos() {
        double ve = 260000;
        double vr = Metodos.Cotizar(0,0,2,2)[1];
        assertEquals(ve,vr,0);
    }

    @Test
    public void MasculinoClasicoNike() {
        double ve = 50000;
        double vr = Metodos.Cotizar(0,1,0,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void MasculinoClasicoNikeCantidadIgualADos() {
        double ve = 100000;
        double vr = Metodos.Cotizar(0,1,0,2)[1];
        assertEquals(ve,vr,0);
    }

    @Test
    public void MasculinoClasicoAdidas() {
        double ve = 80000;
        double vr = Metodos.Cotizar(0,1,1,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void MasculinoClasicoAdidasCantidadIgualADos() {
        double ve = 160000;
        double vr = Metodos.Cotizar(0,1,1,2)[1];
        assertEquals(ve,vr,0);
    }

    @Test
    public void MasculinoClasicoPuma() {
        double ve = 100000;
        double vr = Metodos.Cotizar(0,1,2,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void MasculinoClasicoPumaCantidadIgualADos() {
        double ve = 200000;
        double vr = Metodos.Cotizar(0,1,2,2)[1];
        assertEquals(ve,vr,0);
    }

    @Test
    public void FemeninoZapatillasNike() {
        double ve = 100000;
        double vr = Metodos.Cotizar(1,0,0,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void FemeninoZapatillasNikeCantidadIgualADos() {
        double ve = 200000;
        double vr = Metodos.Cotizar(1,0,0,2)[1];
        assertEquals(ve,vr,0);
    }

    @Test
    public void FemeninoZapatillasAdidas() {
        double ve = 130000;
        double vr = Metodos.Cotizar(1,0,1,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void FemeninoZapatillasAdidasCantidadIgualADos() {
        double ve = 260000;
        double vr = Metodos.Cotizar(1,0,1,2)[1];
        assertEquals(ve,vr,0);
    }

    @Test
    public void FemeninoZapatillasPuma() {
        double ve = 110000;
        double vr = Metodos.Cotizar(1,0,2,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void FemeninoZapatillasPumaCantidadIgualADos() {
        double ve = 220000;
        double vr = Metodos.Cotizar(1,0,2,2)[1];
        assertEquals(ve,vr,0);
    }

    @Test
    public void FemeninoClasicoNike() {
        double ve = 60000;
        double vr = Metodos.Cotizar(1,1,0,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void FemeninoClasicoNikeCantidadIgualADos() {
        double ve = 120000;
        double vr = Metodos.Cotizar(1,1,0,2)[1];
        assertEquals(ve,vr,0);
    }

    @Test
    public void FemeninoClasicoAdidas() {
        double ve = 70000;
        double vr = Metodos.Cotizar(1,1,1,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void FemeninoClasicoAdidasCantidadIgualADos() {
        double ve = 140000;
        double vr = Metodos.Cotizar(1,1,1,2)[1];
        assertEquals(ve,vr,0);
    }

    @Test
    public void FemeninoClasicoPuma() {
        double ve = 120000;
        double vr = Metodos.Cotizar(1,1,2,4)[0];
        assertEquals(ve,vr,0);
    }
    @Test
    public void FemeninoClasicoPumaCantidadIgualADos() {
        double ve = 240000;
        double vr = Metodos.Cotizar(1,1,2,2)[1];
        assertEquals(ve,vr,0);
    }
}