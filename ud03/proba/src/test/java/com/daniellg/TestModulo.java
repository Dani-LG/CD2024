package com.daniellg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestModulo {
    Modulo modulo;
    Modulo moduloconst;

    @BeforeEach
    void createModulo() {
        modulo = new Modulo();
        moduloconst = new Modulo("cod", "mod", "des", 10, 5);

        modulo.setCodigo("codigo");
        modulo.setDescripcion("description");
        modulo.setHoras(100);
        modulo.setNombre("modulo");
        modulo.setSesiones(30);
    }
    @Test
    public void comprobarSetters() {
        assertTrue(modulo.getCodigo().equals("codigo"));
        assertTrue(modulo.getDescripcion().equals("description"));
        assertEquals(modulo.getHoras(), 100);
        assertTrue(modulo.getNombre().equals("modulo"));
        assertEquals(modulo.getSesiones(), 30);
        System.out.println(modulo);
    }
    @Test
    public void comprobarConstructor() {
        assertTrue(moduloconst.getCodigo().equals("cod"));
        assertTrue(moduloconst.getDescripcion().equals("des"));
        assertEquals(moduloconst.getHoras(), 10);
        assertTrue(moduloconst.getNombre().equals("mod"));
        assertEquals(moduloconst.getSesiones(), 5);
        System.out.println(moduloconst);

    }

    
}
