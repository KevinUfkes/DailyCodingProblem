// Author: Kevin Ufkes
// Date: July 5, 2021
// Project: Daily Coding Problem from July 5, 2021
// Description (EASY):
//      This problem was asked by Facebook.
//          Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit
//          you could have made from buying and selling that stock once. You must buy before you can sell it.
//          For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.

package kufkes;

public class Main {

    public static String printArray(int [] arr){
        String s = "";
        for(int x=0; x<arr.length; x++){
            s += arr[x] + ", ";
        }
        return s;
    }

    public static int largestProfit(int [] stockArr){
        int largestDiff = stockArr[1] - stockArr[0];
        int buyPrice = stockArr[0];
        for(int x=0; x<stockArr.length; x++){
            for(int y=x+1; y<stockArr.length; y++){
                if(stockArr[y]-stockArr[x]>largestDiff){
                    largestDiff = stockArr[y]-stockArr[x];
                    buyPrice = stockArr[x];
                }
            }
        }
        return buyPrice;
    }

    public static void main(String[] args) {
	    int [] stock01 = new int [6];

	    stock01[0] = 9;
        stock01[1] = 11;
        stock01[2] = 8;
        stock01[3] = 5;
        stock01[4] = 7;
        stock01[5] = 10;

        int [] stock02 = new int [6];

        stock02[0] = 9;
        stock02[1] = 11;
        stock02[2] = 8;
        stock02[3] = 1;
        stock02[4] = 2;
        stock02[5] = 2;

        System.out.println(printArray(stock01));

        System.out.println(largestProfit(stock01));
        System.out.println(largestProfit(stock02));

    }
}
