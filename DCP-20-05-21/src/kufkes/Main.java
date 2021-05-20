// Author: Kevin Ufkes
// Date: May 20, 2021
// Project: Daily Coding Problem
// Problem Description:
//      This problem was asked by Uber.
//      Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
//      For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
//      Follow-up: what if you can't use division?

package kufkes;

public class Main {
// Print array
    public static String printArray(int [] arr){
        String s = "";
        for(int x=0; x<arr.length; x++){
            s += arr[x] + ", ";
        }
        return s;
    }

// Part 1 - Multiplying whole array and dividing by i
    public static void productArrayDivision(int [] arr) {
        int prod = arr[0];
        for(int x=1; x<arr.length; x++){
            prod *= arr[x];
        }
        for(int y=0; y<arr.length; y++){
            arr[y] = prod/arr[y];
        }
    }

// Part 2 - Without using division

    public static void productArrayNoDivision(int [] arr){

        for(int x=0; x<arr.length; x++){
            int prod = 1;
            for(int y=0; y<arr.length; y++){
                if(y != x){
                    prod *= arr[x];
                }
            }
            arr[x] = prod;
        }
    }

    public static void main(String[] args) {

        int [] array1 = new int [5];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;

        int [] array2 = new int [5];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[4] = 5;

        System.out.println(printArray(array1));
        productArrayDivision(array1);
        System.out.println(printArray(array1));

        System.out.println("-----------------");

        System.out.println(printArray(array2));
        productArrayDivision(array2);
        System.out.println(printArray(array2));

    }
}
