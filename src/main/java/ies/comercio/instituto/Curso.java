package ies.comercio.instituto;

import java.util.TreeSet;

/**
 * La clase Curso representa un curso académico en el instituto. Contiene
 * información sobre el nombre del curso y la lista de alumnos matriculados. Los
 * alumnos se almacenan en un TreeSet para mantener un orden natural basado en
 * la clase Persona.
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @since 09-04-2024
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /**
     * Devuelve el nombre del curso.
     *
     * @return El nombre del curso.
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Construye un nuevo objeto Curso con el nombre especificado. Inicializa la
     * lista de alumnos como un TreeSet vacío.
     *
     * @param nombre El nombre del curso.
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Devuelve una representación en forma de cadena del curso, que incluye el
     * nombre y una lista de alumnos matriculados.
     *
     * @return Una cadena que representa el curso y sus alumnos.
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Añade un alumno a la lista de alumnos matriculados en el curso.
     *
     * @param p El objeto Persona que representa al alumno a añadir.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
