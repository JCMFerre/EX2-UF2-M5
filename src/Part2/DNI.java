package Part2;

/**
 * Aquesta classe serveix per poder validar un DNI, comprovar la seva llargada i
 * si la lletra és correcte.
 *
 * @author Joan Creus Martin
 */
public class DNI {

    private String nif;
    private int numNif;
    private char charNif;
    private final char[] llista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
        'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    private final int LONGITUD_AMB_LLETRA = 9;

    /**
     * Constructor amb paràmetre.
     *
     * @param nif
     */
    public DNI(String nif) {
        this.nif = nif;
    }

    /**
     * Constructor buit.
     */
    public DNI() {
    }

    /**
     * Comprovem si un DNI és vàlid utilitzant un bloc try-catch i els mètodes
     * de la mateixa classe.
     *
     * @param dni
     * @return boolean
     */
    public boolean esValid(String dni) {
        boolean correcte = false;
        if (validarLongitud(dni)) {
            try {
                numNif = Integer.parseInt(dni.substring(0, dni.length() - 1));
                charNif = dni.charAt(dni.length() - 1);
                if (comprovarLletra()) {
                    correcte = true;
                }
            } catch (Exception ex) {
                // Es poden afegit missatges pero amb un true/false seria suficient.
            }
        }
        return correcte;
    }

    /**
     * Comprovem si la llargada del DNI amb lletra és igual a la constant que
     * tenim definida.
     *
     * @param dni
     * @return boolean
     */
    public boolean validarLongitud(String dni) {
        return (dni.length() == LONGITUD_AMB_LLETRA);
    }

    /**
     * Aquest mètode comprova que la lletra del DNI és correcta.
     *
     * @return boolean
     */
    private boolean comprovarLletra() {
        return llista[numNif % llista.length] == charNif;
    }

}
