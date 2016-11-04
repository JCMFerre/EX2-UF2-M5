package Part1_NEW_CODE;

public class Operari extends Empleado {

    private float horesExtres;
    private final int PREU_HORES_EXTRES = 20;

    public Operari(String nom, float nomina, float horesExtres) {
        super(nom, nomina);
        this.horesExtres = horesExtres;
        super.setNomina(nomina + (horesExtres * PREU_HORES_EXTRES));
    }

    public float getHoresExtres() {
        return horesExtres;
    }

    public void setHoresExtres(float horesExtres) {
        this.horesExtres = horesExtres;
    }

}
