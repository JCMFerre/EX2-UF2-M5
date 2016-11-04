package Part1_OLD_CODE;

public class CostPersonal {

    public static float costDelPersonal(Treballador treballadors[]) {
        float costFinal = 0;
        for (int i = 0; i < treballadors.length; i++) {
            costFinal += esDirectiu(treballadors[i]) ? treballadors[i].getNomina()
                    : treballadors[i].getNomina() + (treballadors[i].getHoresExtres()
                    * Treballador.PREU_HORA_EXTRA);
        }
        return costFinal;
    }

    public static boolean esDirectiu(Treballador treballador) {
        return (treballador.getTipusTreballador() == Treballador.DIRECTOR
                || treballador.getTipusTreballador() == Treballador.SUBDIRECTOR);
    }
}
