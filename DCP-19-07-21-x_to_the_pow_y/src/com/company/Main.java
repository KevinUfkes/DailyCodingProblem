// Author: Kevin Ufkes
// Date: July 19, 2021
// Project: Daily Coding Problem from July 19, 2021
// Description (MEDIUM):
//      This problem was asked by Google.
//          Implement integer exponentiation. That is, implement the pow(x, y) function, where x and y are integers and returns x^y.
//          Do this faster than the naive method of repeated multiplication.
//          For example, pow(2, 10) should return 1024

package com.company;

public class Main {

    public static int pow(int x, int y){
        int result = x;
        for(int i=1; i<y; i++){
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
	    int x = 2;
	    int y = 10;

        System.out.println(pow(x, y));
    }
}
