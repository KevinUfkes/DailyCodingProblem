// Author: Kevin Ufkes
// Date: June 14, 2021
// Project: Daily Coding Problem from June 13, 2021
// Description (HARD):
//      This problem was asked by Facebook.
//          Implement regular expression matching with the following special characters:
//          . (period) which matches any single character
//          * (asterisk) which matches zero or more of the preceding element
//          That is, implement a function that takes in a string and a valid regular expression and returns whether or not the string matches the regular expression.
//
//          For example, given the regular expression "ra." and the string "ray", your function should return true. The same regular expression on the string "raymond" should return false.
//          Given the regular expression ".*at" and the string "chat", your function should return true. The same regular expression on the string "chats" should return false.

package kufkes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean regexTest(String regex, String test){
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(test);
        if(matcher.find()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String regex01 = "w3schools";
	    String test01 = "Visit W3Schools!";

        System.out.println(regexTest(regex01, test01));
        System.out.println("--------------");
        System.out.println("");

        String regex02 = "ra.";
        String test02_01 = "ray";
        String test02_02 = "Raymond";
        System.out.println("True: " + regexTest(regex02, test02_01));
        System.out.println("False: " + regexTest(regex02, test02_02));
        System.out.println("--------------");
        System.out.println("");

        String regex03 = ".*at";
        String test03_01 = "chat";
        String test03_02 = "chats";
        System.out.println("True: " + regexTest(regex03, test03_01));
        System.out.println("False: " + regexTest(regex03, test03_02));
        System.out.println("--------------");
    }
}
