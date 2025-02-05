package com.daniellg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestPersona {

    @Test
    public void comprobarGetters () {
        Persona mengano = new Persona();

        assertNull(mengano.getNome());
        assertNull(mengano.getApellido1());
        assertNull(mengano.getApellido2());
        assertNull(mengano.getCorreo());
        assertNull(mengano.getDni());
        assertNull(mengano.getFecNacimiento());
        assertNull(mengano.getMovil());
    }
    @Test
    public void comprobarConstructor() {
        Persona mengano = new Persona("53797704a","Pepe","José","Alvarez","test@gmail.com",606604475,LocalDate.of(2025, 1, 29));
        assertTrue(mengano.getNome().equals("Pepe"));
        assertTrue(mengano.getApellido1().equals("José"));
        assertTrue(mengano.getApellido2().equals("Alvarez"));
        assertTrue(mengano.getCorreo().equals("test@gmail.com"));
        assertTrue(mengano.getDni().equals("53797704a"));
        assertTrue(mengano.getFecNacimiento() instanceof LocalDate);
        assertEquals(mengano.getMovil(), 606604475);
    }
    @Test
    public void comprobarSetters() {
        Persona mengano = new Persona();
        mengano.setApellido1("José");
        mengano.setApellido2("Alvarez");
        mengano.setCorreo("test@gmail.com");
        mengano.setDni("53797704a");
        mengano.setFecNacimiento(LocalDate.of(2025, 1, 29));
        mengano.setMovil(606604475);
        mengano.setNome("Pepe");
        assertTrue(mengano.getNome().equals("Pepe"));
        assertTrue(mengano.getApellido1().equals("José"));
        assertTrue(mengano.getApellido2().equals("Alvarez"));
        assertTrue(mengano.getCorreo().equals("test@gmail.com"));
        assertTrue(mengano.getDni().equals("53797704a"));
        assertTrue(mengano.getFecNacimiento() instanceof LocalDate);
        assertEquals(mengano.getMovil(), 606604475);

        System.out.println(mengano);
    }
}
