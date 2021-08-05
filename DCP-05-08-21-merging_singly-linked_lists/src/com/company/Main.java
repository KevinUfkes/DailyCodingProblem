// Author: Kevin Ufkes
// Date: August 5, 2021
// Project: Daily Coding Problem from August 5, 2021
// Description (MEDIUM):
//      This problem was asked by Google.
//          Given k sorted singly linked lists, write a function to merge all the lists into one sorted singly linked list.
package com.company;

public class Main {

    public static void main(String[] args) {
	    LinkedList ll01 = new LinkedList();

	    ll01.addInOrder(11);
        ll01.addInOrder(12);
        ll01.addInOrder(13);
        ll01.addInOrder(14);
        ll01.addInOrder(15);

        System.out.println(ll01.printList());


    }
}
