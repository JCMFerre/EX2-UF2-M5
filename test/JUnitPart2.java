/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Part2.DNI;
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
public class JUnitPart2 {

    public JUnitPart2() {
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
    public void comprobarDNI() {
        DNI dni = new DNI();
        assertTrue(dni.esValid("77125997M"));
        assertFalse(dni.esValid("77125f97M"));
    }

    @Test
    public void comprobarLlargada() {
        DNI dni = new DNI();
        assertEquals(true, dni.validarLongitud("77125597m"));
        assertEquals(false, dni.validarLongitud("771257m"));
    }
}
