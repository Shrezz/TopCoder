package com.jasperwireless.globalsim.v2.rest;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: shreyven
 * Date: 4/23/17
 * Time: 5:13 PM
 * To change this template, use File | Settings | File Templates.
 */
public class VerySecureEncryption {
    public String encrypt(String str, int[] key, int k) {
        int numOfTimes = k;
        char[] stringToCharArray = str.toCharArray();
        do {
            char[] temp = new char[stringToCharArray.length];
            for (int i= 0; i <key.length ; i++) {
                temp[key[i]] = stringToCharArray[i];
            }
            stringToCharArray = Arrays.copyOf(temp, temp.length);
            numOfTimes--;
        } while ( numOfTimes > 0);
        return new String(stringToCharArray);
    }

    public static void main(String args[]) {
        VerySecureEncryption vse = new VerySecureEncryption();
        int[] arr = {4, 3, 2, 1, 0};
        System.out.println(vse.encrypt("abcde",arr, 2));

    }
}
