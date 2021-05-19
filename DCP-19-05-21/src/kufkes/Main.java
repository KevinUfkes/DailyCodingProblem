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
