package ies.comercio.instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * La clase Persona representa a una persona en el contexto del instituto.
 * Contiene información como el NIF, nombre, género y fecha de nacimiento.
 * Implementa la interfaz Comparable para permitir la comparación entre personas
 * basada en su NIF.
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @since 09-04-2024
 */
public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor por defecto de la clase Persona. Inicializa el NIF a un valor
     * predeterminado, el nombre a una cadena vacía, el género a un espacio en
     * blanco y la fecha de nacimiento al 1 de enero de 1990.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor de la clase Persona que recibe el número de NIF. Inicializa
     * el NIF con el número especificado y utiliza los valores predeterminados
     * para el nombre, género y fecha de nacimiento.
     *
     * @param nif El número de NIF de la persona.
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor de la clase Persona que recibe todos los detalles.
     *
     * @param nif El número de NIF de la persona.
     * @param nombre El nombre de la persona.
     * @param genero El género de la persona ('M' para masculino, 'F' para
     * femenino, etc.).
     * @param dia El día de nacimiento de la persona.
     * @param mes El mes de nacimiento de la persona.
     * @param ano El año de nacimiento de la persona.
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    /**
     * Devuelve el NIF de la persona.
     *
     * @return El NIF de la persona.
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Establece el NIF de la persona.
     *
     * @param nif El NIF a establecer.
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el género de la persona.
     *
     * @return El género de la persona.
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Establece el género de la persona.
     *
     * @param genero El género a establecer ('M' para masculino, 'F' para
     * femenino, etc.).
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Devuelve la fecha de nacimiento de la persona.
     *
     * @return La fecha de nacimiento de la persona.
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     *
     * @param nacimiento La fecha de nacimiento a establecer.
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Calcula y devuelve la edad de la persona en años.
     *
     * @return La edad de la persona en años.
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Devuelve una representación en forma de cadena de la persona. La
     * representación incluye el NIF, nombre, apellidos (si están presentes) y
     * edad.
     *
     * @return La representación en cadena de la persona.
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Compara si esta persona es igual a otra persona basándose en sus NIF.
     *
     * @param a La otra persona con la que comparar.
     * @return true si los NIF son iguales, false en caso contrario.
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Compara si esta persona es igual a otro objeto. La comparación se basa en
     * el NIF de la persona.
     *
     * @param obj El objeto con el que comparar.
     * @return true si el objeto es una persona con el mismo NIF, false en caso
     * contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Compara esta persona con otra persona basándose en sus NIF.
     *
     * @param o La otra persona con la que comparar.
     * @return Un valor negativo si el NIF de esta persona es menor que el de la
     * otra, cero si son iguales, o un valor positivo si es mayor.
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
