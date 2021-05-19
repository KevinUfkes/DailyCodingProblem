//This problem was recently asked by Google.
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//Bonus: Can you do this in one pass?

package kufkes;

public class Main {

    public static boolean sum17(int [] arr) {

        for(int x=0; x<arr.length; x++){
            for(int y=x+1; y<arr.length; y++){
                if(arr[x]+arr[y]==17){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr1  = new int [4];
        arr1[0] = 10;
        arr1[1] = 15;
        arr1[2] = 3;
        arr1[3] = 6;

        System.out.println(sum17(arr1));
    }
}
