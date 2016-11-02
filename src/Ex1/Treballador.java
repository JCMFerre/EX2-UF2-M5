package Ex1;

public class Treballador {

    public static final int DIRECTOR = 0;
    public static final int SUBDIRECTOR = 1;
    private int tipusTreballador;
    private float nomina;
    private float horesExtres;

    public Treballador(int tipusTreballador, float nomina, float horesExtres) {
        this.tipusTreballador = tipusTreballador;
        this.nomina = nomina;
        this.horesExtres = horesExtres;
    }

    public int getTipusTreballador() {
        return tipusTreballador;
    }

    public float getNomina() {
        return nomina;
    }

    public float getHoresExtres() {
        return horesExtres;
    }

}
