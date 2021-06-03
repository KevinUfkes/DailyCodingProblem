// Author: Kevin Ufkes
// Date: June 3, 2021
// Project: Daily Coding Problem for May 28, 2021
// Description (MEDIUM):
//      This problem was asked by Apple.
//          Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.

package kufkes;

import java.util.concurrent.TimeUnit;

public class Main {

    public static String sampleJob(){
        return "Job Complete!";
    }

    public static void jobScheduler(int n) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(n);
        System.out.println(sampleJob());
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        jobScheduler(2000);
        System.out.println("End");
    }
}
