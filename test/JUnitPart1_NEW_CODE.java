/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Part1_NEW_CODE.Directiu;
import Part1_NEW_CODE.Operari;
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
public class JUnitPart1_NEW_CODE {

    public JUnitPart1_NEW_CODE() {
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
    public void calcularNominaOperari() {
        Operari o = new Operari("N", 2000F, 2F);
        assertEquals(2040F, o.getNomina(), 0);
        assertTrue(o.getNomina() == 2040F);
    }

    @Test
    public void calcularNominaDirectiu() {
        Directiu d = new Directiu("N", 2000F);
        assertEquals(2000F, d.getNomina(), 0);
        assertTrue(d.getNomina() == 2000F);
    }
}
