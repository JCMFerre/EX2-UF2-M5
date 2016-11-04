package Part1_OLD_CODE;

import java.text.DecimalFormat;
import java.util.Random;

public class MainTest {

    public static void main(String[] args) {
        Treballador[] treballadors = new Treballador[4];
        for (int i = 0; i < treballadors.length; i++) {
            treballadors[i] = new Treballador(new Random().nextInt(2),
                    2000, 60);
        }
        System.out.println("Cost total del personal: "
                + new DecimalFormat("#.##").format(CostPersonal.CostDelPersonal(treballadors)));
    }

}
