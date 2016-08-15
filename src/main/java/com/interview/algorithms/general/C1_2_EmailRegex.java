package com.interview.algorithms.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: zouzhile
 * Date: 7/4/13
 * Time: 8:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class C1_2_EmailRegex {

    public static void match(String str) {
        // Note 1: inside square bracket small s should be used, outside S
        String pattern_str = "(([^\\s])+@(\\S+)\\.(\\S{3,}))";
        Pattern pattern = Pattern.compile(pattern_str);
        Matcher matcher = pattern.matcher(str);
        int groups = matcher.groupCount();
        System.out.println("Matching Groups: " + groups);
        while(matcher.find())
            System.out.println("Found : " + matcher.group());

    }

    public static void main(String[] args) {
        match("test zouzhile@gmail.com zouzhile@ymail.com prakhar@gmail.cog");
    }
}
