package com.interview.algorithms.general;

/**
 * Created with IntelliJ IDEA.
 * User: zouzhile
 * Date: 7/6/13
 * Time: 10:57 AM
 * Write a function (with helper functions if needed) called to Excel that takes an excel column value
 * (A,B,C,D,..Z,AA,AB,AC,..,ZZ,AAA..) and returns a corresponding integer value (A=1,B=2,..,AA=26..).
 */
public class C1_4_ExcelColumnToInteger {

    public static int transform(String column) {
        column = column.toUpperCase();
        int asciiBase = (int) 'A';
        int length = column.length();
        int value = 0;
        for(int i = 0; i < length; i ++) {
            int current = column.charAt(i);
            if(i != 0 && i == length - 1) { // non single char column's ending char
                value += current - asciiBase;
            } else {
                value += (current + 1 - asciiBase) * Math.pow(26, length - 1 - i);
            }
        }
        return value;
    }

    static int getExcelValues(String column) {
        int value = 0;
        int n = column.length();
        for (int i = 0; i < n; i++) {
            int current = column.charAt(i) - 'A' + 1;
            // System.out.println(column.charAt(i) + " : " + current);
            value += current * Math.pow(26, n - i - 1);
            // System.out.println(value);
        }
        return value;
    }

    public static void main(String[] args) {

        // value is wrong by 1 by stefanie's method, gives same value for z and aa
        System.out.println(transform("BA"));
        System.out.println(transform("AA"));
        System.out.println(transform("Z"));

        System.out.println(getExcelValues("BA")); // 26
        System.out.println(getExcelValues("AA"));
        System.out.println(transform("Z"));
    }
}
