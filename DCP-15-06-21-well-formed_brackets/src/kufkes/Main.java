// Author: Kevin Ufkes
// Date: June 15, 2021
// Project: Daily Coding Problem from June 15, 2021
// Description (EASY):
//      This problem was asked by Facebook.
//          Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).
//          For example, given the string "([])[]({})", you should return true.
//          Given the string "([)]" or "((()", you should return false.

package kufkes;

public class Main {

    public static boolean isBalancedBrackets(String s){
        if(s.length()%2==0){
            for(int x=0; x<s.length(); x++){
                if(s.charAt(x)==')'){
                    for(int y=x-1; y>0; y--){

                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String test01 = "([])[]({})"; // true
        String test02 = "([)]"; // false
        String test03 = "((()"; // false
    }
}
