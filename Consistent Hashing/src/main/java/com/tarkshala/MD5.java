package com.tarkshala;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    public static int digest(String toEncode, String salt) {

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        assert md != null;
        if (salt != null) {
            md.update(salt.getBytes());
        }
        md.update(toEncode.getBytes());

        byte[] hashBytes = md.digest();
        BigInteger hashNumber = new BigInteger(hashBytes).mod(BigInteger.valueOf(Integer.MAX_VALUE));
        return Integer.parseInt(String.valueOf(hashNumber));
    }

    public static int digest(String toEncode) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        assert md != null;
        md.update(toEncode.getBytes());

        byte[] hashBytes = md.digest();
        BigInteger hashNumber = new BigInteger(hashBytes).mod(BigInteger.valueOf(Integer.MAX_VALUE));
        return Integer.parseInt(String.valueOf(hashNumber));
    }
}
