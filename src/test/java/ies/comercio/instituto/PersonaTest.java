package ies.comercio.instituto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * <p>
 * Autor: SergioQuiñonesMajuelo Version: 0.1 Fecha: 09-04-2024
 * </p>
 */
public class PersonaTest {

    @Test
    public void testEquals() {
        // Prueba para el método equals() de la clase Persona
        Persona persona1 = new Persona(123456789, "Sergio Quinones", 'M', 28, 2, 1998);
        Persona persona2 = new Persona(123456789, "Sergio Quinones", 'M', 28, 2, 1998);
        Persona persona3 = new Persona(987654321, "Pepe Quinones", 'M', 21, 11, 1980);

        // Verificar igualdad entre dos instancias con el mismo NIF
        assertTrue(persona1.equals(persona2));

        // Verificar desigualdad entre dos instancias con diferentes NIF
        assertFalse(persona1.equals(persona3));
    }

    @Test
    public void testGetEdad() {
        // Prueba para el método getEdad() de la clase Persona
        Persona persona = new Persona(123456789, "Sergio Quiñones", 'M', 28, 2, 1998);
        assertEquals(26, persona.getEdad());
    }
}
