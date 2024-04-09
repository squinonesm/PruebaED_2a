package ies.comercio.instituto;

/**
 *
 * La clase Persona representa a una persona en el contexto del instituto.
 * Contiene información como el NIF, nombre, género y fecha de nacimiento.
 * Implementa la interfaz Comparable para permitir la comparación entre personas
 * basada en su NIF.
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @since 09-04-2024
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

    /**
     * Método que calcula la letra asociada al número de identificación.
     *
     * @param numero El número de identificación.
     * @return La letra asociada al número.
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Constructor por defecto de la clase Nif.
     *
     * <p>
     * Inicializa el número a 0 y la letra a un espacio en blanco.
     * </p>
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor de la clase Nif.
     *
     * @param numero El número de identificación.
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Devuelve una representación en forma de cadena del NIF, que incluye el
     * número y la letra.
     *
     * @return La representación en cadena del NIF.
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Compara este NIF con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto a comparar con este NIF.
     * @return true si el objeto es un NIF y tiene el mismo número y letra,
     * false en caso contrario.
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
