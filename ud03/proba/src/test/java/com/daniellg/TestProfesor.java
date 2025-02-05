package com.daniellg;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class TestProfesor {
    
    @Test
    public void comprobar() {
        Profesor profe = new Profesor();
        assertNull(profe.getEspecialidad());
        assertNull(profe.getSustituto());
        assertNull(profe.getCuerpo());
        assertNull(profe.getFecOposicion());
    }
    @Test
    public void comprobarConstructor() {
        Profesor profe = new Profesor("53797704a","Pepe","José","Alvarez","test@gmail.com",606604475,LocalDate.of(2025, 1, 29), "mates", "a", false, new Date());
        assertTrue(profe.getEspecialidad().equals("mates"));
        assertTrue(profe.getCuerpo().equals("a"));
        assertFalse(profe.getSustituto());
        assertTrue(profe.getFecOposicion() instanceof Date);

    }
    @Test
    public void comprobarSetters() {
        Profesor profe = new Profesor();
        profe.setEspecialidad("mates");
        profe.setCuerpo("a");
        profe.setSustituto(true);
        profe.setFecOposicion(new Date());
        assertTrue(profe.getEspecialidad().equals("mates"));
        assertTrue(profe.getCuerpo().equals("a"));
        assertTrue(profe.getSustituto());
        assertTrue(profe.getFecOposicion() instanceof Date);

        System.out.println(profe);
    }
}
