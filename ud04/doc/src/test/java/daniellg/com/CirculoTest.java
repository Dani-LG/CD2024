package test.java.daniellg.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Circulo.
 */
class CirculoTest {
    private static int num5 = 5;
    private static int num10 = 10;
    private static int num8 = 8;
    private static int num15 = 15;
    private static double doubl0 = 0.0001;
    private static double doubl2 = -2.0;
    private static double doubl3 = 3.0;
    private static double doubl5 = 5.5;
    private static double doubl6 = 6.0;
    private static double doubl9 = 9.0;
    private Circulo circulo;

    @BeforeEach
    void setUp() {
        circulo = new Circulo(num5, num10, doubl3);
    }

    @Test
    void testConstructor() {
        assertEquals(num5, circulo.obtenerX());
        assertEquals(num10, circulo.obtenerY());
        assertEquals(doubl3, circulo.obtenerRadio(), doubl0);
    }

    @Test
    void testEstablecerYObtenerX() {
        circulo.establecerX(num8);
        assertEquals(num8, circulo.obtenerX());
    }

    @Test
    void testEstablecerYObtenerY() {
        circulo.establecerY(num15);
        assertEquals(num15, circulo.obtenerY());
    }

    @Test
    void testEstablecerYObtenerRadio() {
        circulo.establecerRadio(doubl5);
        assertEquals(doubl5, circulo.obtenerRadio(), doubl0);
    }

    @Test
    void testEstablecerRadioNegativoDebeSerCero() {
        circulo.establecerRadio(doubl2);
        assertEquals(0.0, circulo.obtenerRadio(), doubl0);
    }

    @Test
    void testObtenerDiametro() {
        assertEquals(doubl6, circulo.obtenerDiametro(), doubl0);
    }

    @Test
    void testObtenerCircunferencia() {
        assertEquals(Math.PI * doubl6, circulo.obtenerCircunferencia(), doubl0);
    }

    @Test
    void testObtenerArea() {
        assertEquals(Math.PI * doubl9, circulo.obtenerArea(), doubl0);
    }

    @Test
    void testToString() {
        assertEquals("Centro  = [5,10]; Radio = 3.0", circulo.toString());
    }
}
