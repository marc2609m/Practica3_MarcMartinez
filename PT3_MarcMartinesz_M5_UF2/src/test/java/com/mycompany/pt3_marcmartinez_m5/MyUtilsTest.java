/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pt3_marcmartinez_m5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author marcm
 */
public class MyUtilsTest {
    
    public MyUtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of inverteix method, of class MyUtils.
     */
    @Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = "Hola Mundo";
        String expResult = "odnuM aloH";
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of edat method, of class MyUtils.
     */
    @Test
    public void testEdat() {
        System.out.println("edat");
        int day = 26;
        int month = 9;
        int year = 2004;
        int expResult = 18;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of factorial method, of class MyUtils.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero = 3.0;
        double expResult = 6.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
