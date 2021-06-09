// Author: Kevin Ufkes
// Date: June 9, 2021
// Project: Daily Coding Problem from June 9, 2021
// Description (EASY):
//      This problem was asked by Snapchat.
//          Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.
//          For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

package kufkes;

public class Main {

    public static String print2DArray(int [][] arr){
        String s = "";
        for(int x=0; x<arr.length; x++){
            for(int y=0; y<arr[0].length; y++){
                s += arr[x][y] + ", ";
            }
            s += "\n";
        }
        return s;
    }

    public static int roomCounter(int [][] arr){
        int count = 0;
        if(arr.length>1){count++;}

        for(int x=0; x<arr.length; x++){
            for(int y=x+1; y<arr.length-1;y++){
                if((arr[x][0]<arr[y][1] && arr[x][0]>arr[y][0]) || (arr[x][1]>arr[y][0] && arr[x][1]<arr[y][1])){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int [][] intervals = new int [3][2];

        intervals[0][0] = 30;
        intervals[0][1] = 75;
        intervals[1][0] = 0;
        intervals[1][1] = 50;
        intervals[2][0] = 60;
        intervals[2][1] = 150;
//        intervals[3][0] = 70;
//        intervals[3][1] = 85;
//        intervals[4][0] = 100;
//        intervals[4][1] = 200;

        System.out.println(print2DArray(intervals));
        System.out.println("");

        System.out.println(roomCounter(intervals));
    }
}
