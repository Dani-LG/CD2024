package com.daniellg;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestNivel {
    @Test
    public void comprobarGetters() {
        Nivel ingles = new Nivel("C2");
        assertTrue(ingles.getNivel().equals("C2"));
    }
    @Test
    public void comprobarConstructor() {
        Nivel ingles = new Nivel();
        assertNull(ingles.getNivel());
    }
    @Test
    public void comprobarSetters() {
        Nivel ingles = new Nivel();
        ingles.setNivel("C1");
        assertTrue(ingles.getNivel().equals("C1"));
        System.out.println(ingles);
    }
}
