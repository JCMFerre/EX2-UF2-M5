/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Part1_OLD_CODE.CostPersonal;
import Part1_OLD_CODE.Treballador;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reskitow
 */
public class JUnitPart1_OLD_CODE {

    public JUnitPart1_OLD_CODE() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // Tests realitzats.
    @Test
    public void calcularCostTotal() {
        Treballador[] treballadors = new Treballador[4];
        for (int i = 0; i < treballadors.length; i++) {
            treballadors[i] = new Treballador(new Random().nextInt(2),
                    2000, 60);
        }
        assertEquals(8000F, CostPersonal.costDelPersonal(treballadors), 0);
    }

    @Test
    public void testEsDirectiu() {
        assertTrue(CostPersonal.esDirectiu(new Treballador(0, 200F, 0F)));
        assertFalse(CostPersonal.esDirectiu(new Treballador(2, 2000F, 10F)));
    }
}
