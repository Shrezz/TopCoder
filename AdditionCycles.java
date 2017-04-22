package com.jasperwireless.globalsim.v2.rest;

/**
 * Created by IntelliJ IDEA.
 * User: shreyven
 * Date: 4/22/17
 * Time: 11:15 AM
 * To change this template, use File | Settings | File Templates.
 */
public class AdditionCycles {


    public int cycleLength(int n){

        int  initialNum = n;
        int count = 0;
        int finalNum = 0;
        int sum =0;
        do {
            sum = (initialNum/10 + initialNum%10);
            int rightMostDigit = sum%10;
            finalNum = ((initialNum%10)*10) + rightMostDigit;
            initialNum = finalNum;
            count++;
        } while(n!= finalNum);
        return  count;
    }

    public static void main(String args[]){
        AdditionCycles ac = new AdditionCycles();
        System.out.println(ac.cycleLength(26));
    }
}
