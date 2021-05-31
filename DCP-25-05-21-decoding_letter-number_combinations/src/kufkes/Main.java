// Author: Kevin Ufkes
// Date: May 27, 2021
// Project: Daily Coding Problem from May 25, 2021
// Description (MEDIUM):
//      This problem was asked by Facebook.
//          Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
//          For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
//          You can assume that the messages are decodable. For example, '001' is not allowed.


package kufkes;

public class Main {

    public static int [] stringToIntArray(String str){
        int [] arr = new int[str.length()];
        for(int x=0; x<arr.length; x++){
            arr[x] = Character.getNumericValue(str.charAt(x));
        }
        return arr;
    }

    public static String printArray(int [] arr){
        String s = "";
        for(int x=0; x<arr.length; x++){
            s += arr[x] + ", ";
        }
        return s;
    }

    public static int countConsecutive(int [] arr){
        int count = 0;
        boolean lastIsOne = false;
        for(int x=0; x<arr.length; x++){
            if(arr[x]==1){
                count++;
                lastIsOne = true;
            }
            else if(arr[x]==1 && lastIsOne){
                count++;
            }
            else {
                lastIsOne=false;
                return count;
            }
        }
        return count;
    }

    public static int numVariations(int num){
        int first=1;
        int second=0;
        int res = 0;

        for(int x=0; x<num; x++){
           res = first + second;
           second = first;
           first = res;
        }
        return res;
    }

    public static int calcNumDecode(String msg){
        int count = 1;
        int [] arr = stringToIntArray(msg);
        for(int x=0; x<arr.length; x++){
            if(arr[x]==1){
                int [] tempArr = new int[arr.length-x];
                int y = 0;
                while(arr[y]==1 && y<tempArr.length){
                    tempArr[y] = arr[x];
                    y++;
                }
                System.out.println(printArray(tempArr));
                System.out.println(countConsecutive(tempArr));
                int numConsecutive = countConsecutive(tempArr);
                int numVariations = numVariations(numConsecutive);
                x += numConsecutive-1;
                System.out.println(numVariations);
                count += numVariations;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String msg01 = "111";
        String msg02 = "269";
        String msg03 = "19827";

        int [] testArr = new int [10];

        testArr[0] = 0;
        testArr[1] = 1;
        testArr[2] = 2;
        testArr[3] = 3;
        testArr[4] = 4;
        testArr[5] = 5;
        testArr[6] = 6;
        testArr[7] = 7;
        testArr[8] = 8;
        testArr[9] = 9;

        System.out.println(printArray(stringToIntArray(msg01)));
        System.out.println(printArray(stringToIntArray(msg02)));
        System.out.println(printArray(stringToIntArray(msg03)));
        System.out.println("");

//        System.out.println(countConsecutive(stringToIntArray(msg01)));
//        System.out.println("");

//        System.out.println(numVariations(7));
//        System.out.println("");

//        calcNumDecode(msg01);

        System.out.println("Count: " + calcNumDecode(msg01));

    }
}
