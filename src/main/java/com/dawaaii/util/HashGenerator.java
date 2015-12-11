package com.dawaaii.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by rohit on 28/4/15.
 */
public class HashGenerator {
    /**
     *
     * @param input
     * @return
     */
    public static String getHash(String input) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(input.getBytes());
        byte byteData[] = md.digest();
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1)
                hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
