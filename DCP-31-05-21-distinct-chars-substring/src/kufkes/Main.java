// Author: Kevin Ufkes
// Date: June 7, 2021
// Project: Daily Coding Problem from May 31, 2021
// Description (HARD):
//      This problem was asked by Amazon.
//          Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.
//          For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".

package kufkes;

public class Main {

    public static boolean charInString(String s, Character c){
        for(int x=0; x<s.length(); x++){
            if(s.charAt(x)==c){
                return true;
            }
        }
        return false;
    }
    public static int locLastChar(String s, Character c){
        int loc = -1;
        for(int x=0; x<s.length(); x++){
            if(s.charAt(x)==c){
                loc = x;
            }
        }
        return loc;
    }

    public static int longestSubstring(String s0, int k){

        int countDistinct = 0;
        int longestS1Length = 0;
        String s1 = "";

        System.out.println("From Original String: ");
        for(int x=0; x<s0.length(); x++){
            System.out.print(s0.charAt(x) + ", ");
            if(!charInString(s1, s0.charAt(x)) && countDistinct>=k){
                int locLastChar = locLastChar(s1, s1.charAt(0));
                countDistinct++;
                s1 = s1.substring(locLastChar+1, s1.length());
                s1 += s0.charAt(x);
                if(s1.length()>longestS1Length){
                    longestS1Length = s1.length();
                }
            }
            else if(!charInString(s1, s0.charAt(x))){
                countDistinct++;
                s1 += s0.charAt(x);
                if(s1.length()>longestS1Length){
                    longestS1Length = s1.length();
                }
            }
            else if(charInString(s1, s0.charAt(x))){
                s1 += s0.charAt(x);
                if(s1.length()>longestS1Length){
                    longestS1Length = s1.length();
                }
            }
            System.out.println(s1);
        }

        System.out.println("\n");
        System.out.println("Solve String: ");
        System.out.println(s1);
        System.out.println("");
        return longestS1Length;
    }

    public static void main(String[] args) {

        Character c0 = 'a';
        Character c1 = 'x';
        String s0 = "abababcbcbcbxyxyxyxyxyxy";

        System.out.println(longestSubstring(s0, 2));
        System.out.println("");



    }
}
