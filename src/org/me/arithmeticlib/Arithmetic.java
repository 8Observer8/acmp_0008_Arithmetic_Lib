/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.arithmeticlib;

/**
 * Implementation of a class Arithmetic
 *
 * @author Ivan
 */
public class Arithmetic {
    /**
     * Is c a product of a and b
     * 
     * @param a The first multiplier
     * @param b The second multiplier
     * @param c The product
     * @return YES - if c is a product of a and b; NO - it isn't
     */
    public static String arithmetic(int a, int b, int c) {
        String result = "ERROR";
        
        if (c == a * b) {
            result = "YES";
        }
        else {
            result = "NO";
        }
        
        return result;
    }
}
