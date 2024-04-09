package ies.comercio.instituto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Persona. Autor: Sergio Quiñones Majuelo
 * Versión: 0.1 Fecha: 09-04-2024
 */
public class PersonaTest {

    /**
     * Prueba el método equals() de la clase Persona. Verifica la igualdad entre
     * instancias con el mismo NIF, y la desigualdad en otros casos.
     */
    @Test
    public void testEquals() {
        Persona persona1 = new Persona(123456789, "Sergio Quinones", 'M', 28, 2, 1998);
        Persona persona2 = new Persona(123456789, "Sergio Quinones", 'M', 28, 2, 1998);
        Persona persona3 = new Persona(987654321, "Pepe Quinones", 'M', 21, 11, 1980);

        assertTrue(persona1.equals(persona2));
        assertFalse(persona1.equals(persona3));
    }

    /**
     * Prueba el método getEdad() de la clase Persona. Verifica si la edad
     * calculada es correcta.
     */
    @Test
    public void testGetEdad() {
        Persona persona = new Persona(123456789, "Sergio Quiñones", 'M', 28, 2, 1998);
        assertEquals(26, persona.getEdad());
    }
}
