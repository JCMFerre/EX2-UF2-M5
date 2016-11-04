package Part1_NEW_CODE;

/**
 *
 * @author Joan Creus Martin.
 */
public class MainP1NC {

    public static void main(String[] args) {
        Empleado[] emps = new Empleado[2];
        emps[0] = new Directiu("Directiu 1", 2000F);
        emps[1] = new Operari("Operari 1", 1920F, 20F);
        for (int i = 0; i < emps.length; i++) {
            System.out.println("Salari " + emps[i].getNom() + ": " + emps[i].getNomina());
        }
    }
}
