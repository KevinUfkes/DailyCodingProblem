// Author: Kevin Ufkes
// Date: June 9, 2021
// Project: Daily Coding Problem from June 5, 2021
// Description (HARD):
//      This problem was asked by Google.
//          Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.
//          For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:
//              10 = max(10, 5, 2)
//              7 = max(5, 2, 7)
//              8 = max(2, 7, 8)
//              8 = max(7, 8, 7)
//          Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.

package kufkes;

public class Main {

    public static void maxOfSubArray(int [] arr, int k){

        for(int x=0; x<arr.length-k+1; x++){
            int max = arr[x];
            for(int y=x; y<x+k; y++){
                if(arr[y]>max){
                    max = arr[y];
                }
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args) {

        //test arrays
        int [] arr01 = new int [6];

        arr01[0] = 10;
        arr01[1] = 5;
        arr01[2] = 2;
        arr01[3] = 7;
        arr01[4] = 8;
        arr01[5] = 7;

        //test k values
        int k = 3;

        maxOfSubArray(arr01, k);

    }
}
