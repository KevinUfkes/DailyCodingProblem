//This problem was recently asked by Google.
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//Bonus: Can you do this in one pass?

package kufkes;

import javax.crypto.spec.PSource;

public class Main {

    public static void printArr(int [] arr){
        String s = "";
        for(int x=0; x<arr.length; x++){
            s += arr[x] + ", ";
        }
        System.out.println(s);
    }

    public static int [] selectionSort(int [] arr){

       for(int x=0; x<arr.length; x++){
           int loc = x;
           for(int y=x+1; y<arr.length; y++){
               if(arr[y] < arr[loc]){
                   loc = y;
               }
           }
           int temp = arr[x];
           arr[x] = arr[loc];
           arr[loc] = temp;
       }
       return arr;
    }

    public static boolean sum17Brute(int [] arr) {

        for (int x = 0; x < arr.length; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] + arr[y] == 17) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean sum17SortWalkInward(int [] arr){
        int front = 0;
        int back = arr.length-1;
        System.out.println(front + " " + back);

        while(front < back){
            if(arr[front] + arr[back] == 17) {
                return true;
            } else if(arr[front] + arr[back] > 17) {
                back--;
            } else if (arr[front] + arr[back] < 17){
                front++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [] arr1  = new int [10];
        arr1[0] = 10;
        arr1[1] = 13;
        arr1[2] = 2;
        arr1[3] = 6;
        arr1[4] = 13;
        arr1[5] = 8;
        arr1[6] = 5;
        arr1[7] = 18;
        arr1[8] = 3;
        arr1[9] = 16;

        printArr(arr1);
        selectionSort(arr1);
        printArr(arr1);

        System.out.println(sum17Brute(arr1));
        System.out.println(sum17SortWalkInward(arr1));
    }
}
