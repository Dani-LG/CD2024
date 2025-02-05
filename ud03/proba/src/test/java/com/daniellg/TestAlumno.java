package com.daniellg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAlumno {
    Alumno alumno;
    Alumno alumnoconst;

    @BeforeEach
    void crearalumno() {
        alumno = new Alumno();
        alumnoconst = new Alumno("53797704a","Pepe","José","Alvarez","test@gmail.com",606604475,LocalDate.of(2025, 1, 29), "cod", true);

        alumno.setDni("dni");
        alumno.setNome("nome");
        alumno.setApellido1("ap1");
        alumno.setApellido2("ap2");
        alumno.setCorreo("correo");
        alumno.setMovil(606604475);
        alumno.setFecNacimiento(LocalDate.of(2025, 1, 29));
        alumno.setCodigoXade("cod");
        alumno.setAutorizaTutores(true);
    }
    @Test
    public void comprobarGetters(){
        assertTrue(alumno.getNome().equals("nome"));
        assertTrue(alumno.getApellido1().equals("ap1"));
        assertTrue(alumno.getApellido2().equals("ap2"));
        assertTrue(alumno.getCorreo().equals("correo"));
        assertTrue(alumno.getDni().equals("dni"));
        assertTrue(alumno.getFecNacimiento() instanceof LocalDate);
        assertEquals(alumno.getMovil(), 606604475);
        assertTrue(alumno.getCodigoXade().equals("cod"));
        assertTrue(alumno.isAutorizaTutores());
        System.out.println(alumno);
    }
    @Test
    public void comprobarConstructor() {
        assertTrue(alumnoconst.getNome().equals("Pepe"));
        assertTrue(alumnoconst.getApellido1().equals("José"));
        assertTrue(alumnoconst.getApellido2().equals("Alvarez"));
        assertTrue(alumnoconst.getCorreo().equals("test@gmail.com"));
        assertTrue(alumnoconst.getDni().equals("53797704a"));
        assertTrue(alumnoconst.getFecNacimiento() instanceof LocalDate);
        assertEquals(alumnoconst.getMovil(), 606604475);
        assertTrue(alumnoconst.getCodigoXade().equals("cod"));
        assertTrue(alumnoconst.isAutorizaTutores());
    }
}
