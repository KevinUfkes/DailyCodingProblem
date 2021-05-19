package kufkes;



public class Main {

    public static int numSteps(int n){
        int total;
        int xSteps;
        int ySteps;

        xSteps = n / 2 + 1;

        if(n % 2 == 0){
            ySteps = n / 2;
        } else {
            ySteps = n / 2 + 1;
        }

        total = xSteps + ySteps;
        return total;
    }

    public static int numSteps2(int n){

        return 1 + ((n/2)*(n/2)) + ((n%2)*(n/2));
    }


    public static void main(String[] args) {

//        System.out.println(numSteps(3));
        System.out.println(numSteps2(5));

    }
}
