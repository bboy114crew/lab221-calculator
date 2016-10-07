package com.fpt.lab221.bo;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NgT
 */
public  class Caculator {

    private static final int SCALE = 16;

    public static BigDecimal sqrt(BigDecimal x) {
        if (x.signum() < 0) {
            return null;
        }
        BigInteger n = x.movePointRight(SCALE << 1).toBigInteger();
        int bits = (n.bitLength() + 1) >> 1;
        BigInteger ix = n.shiftRight(bits);
        BigInteger ixPrev;
        do {
            ixPrev = ix;
            ix = ix.add(n.divide(ix)).shiftRight(1);
        } while (ix.compareTo(ixPrev) != 0);
        return new BigDecimal(ix, SCALE);
    }
}
