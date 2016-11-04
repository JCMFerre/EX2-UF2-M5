package Part1_OLD_CODE;

/**
 * Aquesta classe serveix per retornar el costTotal d'uns treballadors a partir
 * d'un array de treballadors.
 *
 * @author Joan Creus Martin.
 */
public class CostPersonal {

    /**
     * Retorna el cost total del array de treballadors que rep, si no són
     * directius al costTotal se suma, nomina més horesExtres *
     * Treballador.PREU_HORA_EXTRA, si és directiu, només nomina.
     *
     * @param treballadors
     * @return float
     */
    public static float costDelPersonal(Treballador treballadors[]) {
        float costFinal = 0;
        for (int i = 0; i < treballadors.length; i++) {
            costFinal += esDirectiu(treballadors[i]) ? treballadors[i].getNomina()
                    : treballadors[i].getNomina() + (treballadors[i].getHoresExtres()
                    * Treballador.PREU_HORA_EXTRA);
        }
        return costFinal;
    }

    /**
     * Comprova si el tipus de treballador coincideix amb algun tipus de
     * directiu, amb qualsevol de les constants definides.
     *
     * @param treballador
     * @return boolean
     */
    public static boolean esDirectiu(Treballador treballador) {
        return (treballador.getTipusTreballador() == Treballador.DIRECTOR
                || treballador.getTipusTreballador() == Treballador.SUBDIRECTOR);
    }
}
