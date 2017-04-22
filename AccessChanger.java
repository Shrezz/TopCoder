package com.jasperwireless.globalsim.v2.rest;

/**
 * Created by IntelliJ IDEA.
 * User: shreyven
 * Date: 4/22/17
 * Time: 12:01 PM
 * To change this template, use File | Settings | File Templates.
 */
public class AccessChanger {

    public String[] convert(String[] program) {

        String[] convertedString = new String[program.length];

        for(int i=0; i<program.length; i++) {
            int commentStarts = program[i].indexOf("//");
            if (commentStarts > 0) {
                convertedString[i] = program[i].substring(0, commentStarts).replaceAll("->", ".") + program[i].substring(commentStarts);
            } else {
                convertedString[i] = program[i].replaceAll("->", ".");
            }
        }
        return convertedString;
    }

    public static void main(String args[]) {
        AccessChanger ac = new AccessChanger();
        String[] array = {"Test* t = new Test();", "t->a = 1;", "t->b = 2;", "t->go(); // a=1, b=2 --> a=2, b=3"};
        String[] newArray  = ac.convert(array);
        for(String str:newArray) {
            System.out.print(str + ";");
        }
    }
}
