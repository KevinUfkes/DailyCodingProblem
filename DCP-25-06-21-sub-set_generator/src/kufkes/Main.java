// Author: Kevin Ufkes
// Date: June 28, 2021
// Project: Daily Coding Problem from June 25, 2021
// Description (EASY\):
//      This problem was asked by Google.
//          The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.
//          For example, given the set {1, 2, 3}, it should return {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}.
//          You may also use a list or array to represent a set.

package kufkes;

public class Main {

    public static void getPowerSet(int [] arr){
        System.out.println("{}");
        for(int x=0; x<arr.length; x++){
            System.out.println("{" + arr[x] + "}");;
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(i!=j){
                    System.out.println("{" + arr[i] + ", " + arr[j] + ", }");
                }
            }
        }

        System.out.print("{");
        for(int y=0; y<arr.length; y++){
            System.out.print(arr[y] + ", ");
        }

        System.out.println("}");
    }

    public static void printArray(int [] arr){
        for(int x=0; x<arr.length; x++){
            System.out.print(arr[x] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int [] testArr01 = new int [3];
        int [] testArr02 = new int [5];

        testArr01[0] = 1;
        testArr01[1] = 2;
        testArr01[2] = 3;

        testArr02[0] = 1;
        testArr02[1] = 2;
        testArr02[2] = 3;
        testArr02[3] = 4;
        testArr02[4] = 5;

        getPowerSet(testArr01);

    }
}
