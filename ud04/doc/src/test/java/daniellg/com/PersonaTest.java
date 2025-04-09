package test.java.daniellg.com;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Persona.
 */
class PersonaTest {
    private static int ed25;
    private static int ed30;
    private Persona persona;

    @BeforeEach
    void setUp() {
        persona = new Persona("Juan", ed25);
    }

    @Test
    void testConstructor() {
        assertEquals("Juan", persona.getNombre());
        assertEquals(ed25, persona.getEdad());
    }

    @Test
    void testSetYGetNombre() {
        persona.setNombre("Maria");
        assertEquals("Maria", persona.getNombre());
    }

    @Test
    void testSetYGetEdad() {
        persona.setEdad(ed30);
        assertEquals(ed30, persona.getEdad());
    }

    @Test
    void testImprimirDetalles() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        persona.imprimirDetalles();
        System.setOut(System.out);
        String expectedOutput = "Nombre: Juan\nEdad: 25\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }
}
