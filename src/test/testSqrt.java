/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author NgT
 */
public class testSqrt {

    private static final int SCALE = 2;

    public static BigDecimal sqrt(BigDecimal x, int scale) {
        // Check that x >= 0.
        if (x.signum() < 0) {
            throw new IllegalArgumentException("x < 0");
        }
        // n = x*(10^(2*scale))
        BigInteger n = x.movePointRight(scale << 1).toBigInteger();

        // The first approximation is the upper half of n.
        int bits = (n.bitLength() + 1) >> 1;
        BigInteger ix = n.shiftRight(bits);
        BigInteger ixPrev;
        // Loop until the approximations converge
        // (two successive approximations are equal after rounding).
        do {
            ixPrev = ix;
            // x = (x + n/x)/2
            ix = ix.add(n.divide(ix)).shiftRight(1);
        } while (ix.compareTo(ixPrev) != 0);
        return new BigDecimal(ix, scale);
    }

    private static void testSqrtDecimal() {
        System.out.println("sqrt(2) = " + Math.sqrt(2));
        System.out.println("       = " + sqrt(BigDecimal.valueOf(2), SCALE));
        System.out.println("sqrt(26) = " + Math.sqrt(26));
        System.out.println("       = " + sqrt(BigDecimal.valueOf(26), SCALE));
    }

    public static void main(String args[]) {
        try {
            testSqrtDecimal();
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}
