package ies.comercio.instituto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Nif.
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @since 09-04-2024
 */
public class NifTest {

    /**
     * Prueba el método toString() de la clase Nif. Verifica si el formato de la
     * cadena generada es correcto.
     */
    @Test
    public void testToString() {
        Nif nif = new Nif(65004204);
        assertEquals("65004204-V", nif.toString());
    }

    /**
     * Prueba el método equals() de la clase Nif. Verifica la igualdad entre
     * instancias con el mismo número y letra, y la desigualdad en otros casos.
     */
    @Test
    public void testEquals() {
        Nif nif1 = new Nif(12345678);
        Nif nif2 = new Nif(12345678);
        Nif nif3 = new Nif(87654321);

        assertTrue(nif1.equals(nif2));
        assertFalse(nif1.equals(nif3));
        assertFalse(nif2.equals(nif3));
    }
}
