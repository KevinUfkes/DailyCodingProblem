// Author: Kevin Ufkes
// Date: May 26, 2021
// Project: Daily Coding Problem from May 22, 2021
// Description (HARD):
//      This problem was asked by Stripe.
//          Given an array of integers, find the first missing positive integer in linear time and constant space.
//          In other words, find the lowest positive integer that does not exist in the array.
//          The array can contain duplicates and negative numbers as well.
//
//          For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
//
//          You can modify the input array in-place.

package kufkes;

public class Main {

    public static String printArray(int [] arr){
        String s = "";
        for(int x=0; x<arr.length; x++){
            s += arr[x] + ", ";
        }
        return s;
    }

    public static void selectionSort(int [] arr){
        int temp;
        for(int x=0; x<arr.length; x++){
            int loc = x;
            for(int y=x+1; y<arr.length; y++){
                if (arr[y] < arr[loc]) {
                    loc = y;
                }
            }
            temp = arr[loc];
            arr[loc] = arr[x];
            arr[x] = temp;
        }
    }

    public static int problemSolver(int [] arr){
        if(arr[arr.length-1] < 1){
            return 1;
        }
        for(int x=0; x<arr.length-1; x++){
            if(arr[x] > 0) {
                if(arr[x] != 1){
                    return 4;
                }
            }
        }
        return 100;
    }

    public static void main(String[] args) {
	    int [] arr1 = new int [4];
	    int [] arr2 = new int [4];
	    int [] arr3 = new int [4];
	    int [] arr4 = new int [4];
	    int [] arr5 = new int [4];

	    arr1[0] = -3;
        arr1[1] = -4;
        arr1[2] = -1;
        arr1[3] = -9;

        arr2[0] = 4;
        arr2[1] = 1;
        arr2[2] = 3;
        arr2[3] = 2;

        arr3[0] = -3;
        arr3[1] = -4;
        arr3[2] = -1;
        arr3[3] = 10;

        arr4[0] = -1;
        arr4[1] = -2;
        arr4[2] = 0;
        arr4[3] = 1;

        arr5[0] = 6;
        arr5[1] = 1;
        arr5[2] = 2;
        arr5[3] = 5;

        System.out.println(printArray(arr1));
        System.out.println(printArray(arr2));
        System.out.println(printArray(arr3));
        System.out.println(printArray(arr4));
        System.out.println(printArray(arr5));
        System.out.println("");

        selectionSort(arr1);
        selectionSort(arr2);
        selectionSort(arr3);
        selectionSort(arr4);
        selectionSort(arr5);

        System.out.println(printArray(arr1));
        System.out.println(printArray(arr2));
        System.out.println(printArray(arr3));
        System.out.println(printArray(arr4));
        System.out.println(printArray(arr5));
        System.out.println("");

        System.out.println(problemSolver(arr1));
        System.out.println(problemSolver(arr2));
        System.out.println(problemSolver(arr3));
        System.out.println(problemSolver(arr4));
        System.out.println(problemSolver(arr5));

    }
}
