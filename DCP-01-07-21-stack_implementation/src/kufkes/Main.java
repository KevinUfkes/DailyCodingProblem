// Author: Kevin Ufkes
// Date: July 1, 2021
// Project: Daily Coding Problem from July 1, 2021
// Description (EASY):
//      Implement a stack that has the following methods:
//
//          push(val), which pushes an element onto the stack
//          pop(), which pops off and returns the topmost element of the stack. If there are no elements in the stack, then it should throw an error or return null.
//          max(), which returns the maximum value in the stack currently. If there are no elements in the stack, then it should throw an error or return null.
//          Each method should run in constant time

package kufkes;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack01 = new ArrayStack(10);

        stack01.push(10);
        stack01.push(9);
        stack01.push(8);
        stack01.push(7);
        stack01.push(3);
        stack01.push(2);
        stack01.push(1);

        System.out.println(stack01.pop());

        System.out.println(stack01.push(111));

        System.out.println(stack01.max());



    }
}
