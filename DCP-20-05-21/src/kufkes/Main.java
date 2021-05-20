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
        int res = arr[0];
        for(int x=1; x<arr.length; x++){
            res *= arr[x];
        }
        for(int y=0; y<arr.length; y++){
            arr[y] = res/arr[y];
        }
    }

    public static void main(String[] args) {

        int [] array = new int [5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        System.out.println(printArray(array));

        productArrayDivision(array);

        System.out.println(printArray(array));

    }
}
