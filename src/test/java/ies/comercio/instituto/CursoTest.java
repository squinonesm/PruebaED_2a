package ies.comercio.instituto;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Curso.
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @since 09-04-2024
 */
public class CursoTest {

    private Curso curso;
    private Persona alumno1;
    private Persona alumno2;

    /**
     * Configuración inicial para cada prueba. Crea una instancia de Curso y dos
     * instancias de Persona para utilizar en las pruebas.
     */
    @BeforeEach
    public void setUp() {
        curso = new Curso("1º DAM");
        alumno1 = new Persona(123456789, "Sergio", 'M', 28, 2, 1998);
        alumno2 = new Persona(987654321, "Pepe", 'M', 21, 11, 1965);
    }

    /**
     * Prueba para comprobar el método aniadirAlumno() de la clase Curso. Se
     * añaden dos alumnos al curso y se verifica si están presentes en la
     * descripción del curso.
     */
    @Test
    public void testAniadirAlumno() {
        curso.aniadirAlumno(alumno1);
        curso.aniadirAlumno(alumno2);

        // Verificar que los datos de los alumnos están presentes en la descripción del curso
        assertTrue(curso.toString().contains(alumno1.toString()));
        assertTrue(curso.toString().contains(alumno2.toString()));
    }
}
