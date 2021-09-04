// Author: Kevin Ufkes
// Date: September 4, 2021
// Project: Daily Coding Problem from September 4, 2021
// Description (EASY):
//      This problem was asked by Google.
//          Given two strings A and B, return whether or not A can be shifted some number of times to get B.
//          For example, if A is abcde and B is cdeab, return true. If A is abc and B is acb, return false.

package com.company;

public class Main {

    // Check if 2 char arrays have same chars at every index
    // Should check if arrays are same length first
    public static boolean arraysSame(char [] arr1, char [] arr2){
        for(int x=0; x<arr1.length; x++){
            if(arr1[x] != arr2[x]){
                return false;
            }
        }
        return true;
    }


    public static boolean checkShift(String a, String b){
        // count to prevent endless shifting if no match
        int count = 0;
        char [] arrA = a.toCharArray();
        char [] arrB = b.toCharArray();
        char temp;

        // shift first element of 'a' to end of array and shift all other chars up one index
        // check if arrays are the same
        // repeat until count equals length of array
        // check if arrays are equal after last shift
        // return boolean value based on result
        while(count<a.length() && !arraysSame(arrA, arrB)) {
            temp = arrA[0];
            for(int x=0; x< arrA.length-1; x++){
                arrA[x] = arrA[x+1];
            }
            arrA[arrA.length-1] = temp;
            count++;
        }

        if(arraysSame(arrA, arrB)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    // Test Strings
        String a = "abfcde";
        String b = "cdeabf";

        String x = "abc";
        String y = "acb";

        System.out.println(checkShift(a, b));
        System.out.println(checkShift(x, y));
    }
}
