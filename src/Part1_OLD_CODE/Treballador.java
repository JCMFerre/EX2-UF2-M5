package Part1_OLD_CODE;

/**
 * Aquesta classe serveix per crear un objecte Treballador amb tipusTreballador,
 * nomina i horesExtres. També conté unes constants que poden ser útils.
 *
 * @author Joan Creus Martin.
 */
public class Treballador {

    public static final int DIRECTOR = 0;
    public static final int SUBDIRECTOR = 1;
    public static final int OPERARI = 2;
    public static final int PREU_HORA_EXTRA = 20;
    private int tipusTreballador;
    private float nomina;
    private float horesExtres;

    /**
     * Constructor amb paràmetres.
     *
     * @param tipusTreballador
     * @param nomina
     * @param horesExtres
     */
    public Treballador(int tipusTreballador, float nomina, float horesExtres) {
        this.tipusTreballador = tipusTreballador;
        this.nomina = nomina;
        this.horesExtres = horesExtres;
    }

    /**
     * Mètode get per obtenir un atribut privat (Tipus treballador).
     *
     * @return int
     */
    public int getTipusTreballador() {
        return tipusTreballador;
    }

    /**
     * Mètode get per obtenir un atribut privat (Nòmina).
     *
     * @return float
     */
    public float getNomina() {
        return nomina;
    }

    /**
     * Mètode get per obtenir un atribut privat (Hores extres).
     *
     * @return float
     */
    public float getHoresExtres() {
        return horesExtres;
    }

}
