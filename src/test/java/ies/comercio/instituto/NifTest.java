package ies.comercio.instituto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NifTest {

    @Test
    public void testToString() {
        // Prueba para el método toString() de la clase Nif
        Nif nif = new Nif(65004204);
        assertEquals("65004204-V", nif.toString());
    }

    @Test
    public void testEquals() {
        // Prueba para el método equals() de la clase Nif
        Nif nif1 = new Nif(12345678);
        Nif nif2 = new Nif(12345678);
        Nif nif3 = new Nif(87654321);

        // Verificar igualdad entre dos instancias con el mismo número y letra
        assertTrue(nif1.equals(nif2));

        // Verificar desigualdad entre dos instancias con números diferentes
        assertFalse(nif1.equals(nif3));

        // Verificar desigualdad entre dos instancias con la misma letra pero números diferentes
        assertFalse(nif2.equals(nif3));
    }
}
