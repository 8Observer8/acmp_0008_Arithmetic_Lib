/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.arithmeticlib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class ArithmeticTest {
    
    public ArithmeticTest() {
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

    /**
     * Test of arithmetic method, of class Arithmetic.
     */
    @Test
    public void testArithmetic_YES() {
        System.out.println("arithmetic: YES");
        int a = 5;
        int b = 6;
        int c = 30;
        String expResult = "YES";
        String result = Arithmetic.arithmetic(a, b, c);
        assertEquals(expResult, result);
    }

    /**
     * Test of arithmetic method, of class Arithmetic.
     */
    @Test
    public void testArithmetic_NO() {
        System.out.println("arithmetic: NO");
        int a = 5;
        int b = 6;
        int c = 31;
        String expResult = "NO";
        String result = Arithmetic.arithmetic(a, b, c);
        assertEquals(expResult, result);
    }

    /**
     * Test of arithmetic method, of class Arithmetic.
     */
    @Test
    public void testArithmetic_negative_All() {
        System.out.println("arithmetic: all is negative (YES)");
        int a = -5;
        int b = -6;
        int c = 30;
        String expResult = "YES";
        String result = Arithmetic.arithmetic(a, b, c);
        assertEquals(expResult, result);
    }

    /**
     * Test of arithmetic method, of class Arithmetic.
     */
    @Test
    public void testArithmetic_a_is_zero_YES() {
        System.out.println("arithmetic: a is zero (YES)");
        int a = 0;
        int b = 6;
        int c = 0;
        String expResult = "YES";
        String result = Arithmetic.arithmetic(a, b, c);
        assertEquals(expResult, result);
    }

    /**
     * Test of arithmetic method, of class Arithmetic.
     */
    @Test
    public void testArithmetic_a_is_negative_YES() {
        System.out.println("arithmetic: a is negative (YES)");
        int a = -5;
        int b = 6;
        int c = -30;
        String expResult = "YES";
        String result = Arithmetic.arithmetic(a, b, c);
        assertEquals(expResult, result);
    }

    /**
     * Test of arithmetic method, of class Arithmetic.
     */
    @Test
    public void testArithmetic_b_is_negative_YES() {
        System.out.println("arithmetic: b is negative (YES)");
        int a = 5;
        int b = -6;
        int c = -30;
        String expResult = "YES";
        String result = Arithmetic.arithmetic(a, b, c);
        assertEquals(expResult, result);
    }
}
