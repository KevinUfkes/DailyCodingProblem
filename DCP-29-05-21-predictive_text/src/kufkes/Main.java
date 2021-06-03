// Author: Kevin Ufkes
// Date: June 3, 2021
// Project: Daily Coding Problem from May 29, 2021
// Description (MEDIUM):
//      This problem was asked by Twitter.
//          Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.
//          For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
//          Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

package kufkes;

public class Main {

    public static void main(String[] args) {
        String testString01 = "datigus";
        String testString02 = "apples";
        System.out.println(testString01.compareTo(testString02));
        System.out.println(testString02.compareTo(testString01));
        System.out.println(testString01.compareTo(testString01));

        BSTPredictiveText bst = new BSTPredictiveText();

        bst.insert("dog");
        bst.insert("deer");
        bst.insert("deal");
        bst.insert("data");
        bst.insert("zebra");
        bst.insert("doorway");
        bst.insert("derpadoo");
        bst.insert("apples");
        bst.insert("apes");
        bst.insert("datigus");

        bst.printInOrder();
        System.out.println("");

        bst.searchPredictive("d");
    }
}
