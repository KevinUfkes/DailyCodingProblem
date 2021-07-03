// Author: Kevin Ufkes
// Date: July 3, 2021
// Project: Daily Coding Problem from July 3, 2021
// Description (EASY):
//      This problem was asked by Two Sigma.
//          Using a function rand5() that returns an integer from 1 to 5 (inclusive) with uniform probability,
//          implement a function rand7() that returns an integer from 1 to 7 (inclusive).

package kufkes;

import java.util.Date;
import java.util.Calendar;

public class Main {

    public static int rand5(){
        Date date = new Date();
        long millis = date.getTime();
        return (int) millis%6;
    }

    public static int rand7(){
        Date date = new Date();
        long millis = date.getTime();
        return (int) millis%8;
    }

    public static void main(String[] args) {
	    Date date = new Date();
	    long millis = date.getTime();
        System.out.println("Date: " + date);
        System.out.println("Time: " + millis);

        System.out.println(rand5());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());


    }
}
