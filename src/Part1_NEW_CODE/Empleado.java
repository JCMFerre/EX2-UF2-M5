package Part1_NEW_CODE;

/**
 *
 * @author Joan Creus Martin.
 */
public class Empleado {

    private String nom;
    private float nomina;

    public Empleado(String nom, float nomina) {
        this.nom = nom;
        this.nomina = nomina;
    }

    public String getNom() {
        return nom;
    }

    public float getNomina() {
        return nomina;
    }

    public void setNomina(float nomina) {
        this.nomina = nomina;
    }

}
