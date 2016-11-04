package Part2;

public class DNI {

    private String nif;
    private int numNif;
    private char charNif;
    private final char[] llista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
        'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    private final int LONGITUD_AMB_LLETRA = 9;
    private final int LONGITUD_SENSE_LLETRA = 8;

    public DNI(String nif) {
        this.nif = nif;
    }

    public boolean esValid(String dni) {
        boolean correcte = false;
        if (validarLongitud(dni)) {
            try {
                numNif = Integer.parseInt(dni.substring(0, dni.length()));
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

    public boolean validarLongitud(String dni) {
        return (dni.length() == LONGITUD_AMB_LLETRA
                && dni.length() == LONGITUD_SENSE_LLETRA);
    }

    private boolean comprovarLletra() {
        return llista[numNif % llista.length] == charNif;
    }

}
