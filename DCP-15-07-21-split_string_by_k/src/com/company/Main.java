// Author: Kevin Ufkes
// Date: July 15, 2021
// Project: Daily Coding Problem from July 15, 2021
// Description (MEDIUM):
//      This problem was asked by Amazon.
//          Given a string s and an integer k, break up the string into multiple lines such that each line has a length of k or less.
//          You must break it up so that words don't break across lines. Each line has to have the maximum possible amount of words.
//          If there's no way to break the text up, then return null.
//
//          You can assume that there are no spaces at the ends of the string and that there is exactly one space between each word.
//
//          For example, given the string "the quick brown fox jumps over the lazy dog" and k = 10, you should return:
//          ["the quick", "brown fox", "jumps over", "the lazy", "dog"]. No string in the list has a length of more than 10.

package com.company;

import java.util.Arrays;

public class Main {

    public static String[] splitStringByK(String s, int k){
        char[] sArray = s.toCharArray();
        int arrMax = (s.length()/k)*2;
        int numInArr = 0;
        char [] kStorage = new char [k];
        int lastSpaceChar;
        String [] returnString = new String [arrMax];

        for(int x=0; x<s.length(); x++){
            if(sArray[x]==' '){
                lastSpaceChar = x;
                System.out.println(lastSpaceChar);
            }
//            kStorage[x-(numInArr*k)] = sArray[x];
            if(x%10==0){
                if(kStorage[x-(numInArr*k)] == ' '){
                    String temp = s.valueOf(kStorage);
                    System.out.println(temp);
                    returnString[numInArr] = temp;
                    numInArr++;
                }

            }

//            kStorage = null;
            kStorage = new char [k];
        }
        return returnString;
    }

    public static String [] splitStringByK2(String s, int k){
        int maxReturnStrings = (s.length()/k)*2;
        String [] returnString;
        returnString = new String [maxReturnStrings];
        int locLastSpace;
        int numReturnStrings = 0;

        for(int x=0; x<s.length(); x++){
            if(s.charAt(x)==' '){
                locLastSpace = x;
            }
            if(x>1 && x%10==0){
                System.out.println(s.charAt(x));
                if(s.charAt(x)==' '){
                    returnString[numReturnStrings] = ;

                }
            }
        }

        return returnString;
    }

    public static void main(String[] args) {
	    String testString01 = "the quick brown fox jumps over the lazy dog";
	    int k01 = 20;

	    // must loop through string
        // must store k characters
        // must store location of last space character
        // at 10th char, if space, add previous 10 chars to a line
        // at 10th char, if not space, add previous chars to line until reaching the last remembered space char

        System.out.println(splitStringByK2(testString01, k01));

    }
}
