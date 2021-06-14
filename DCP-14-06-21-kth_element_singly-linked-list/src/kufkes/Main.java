// Author: Kevin Ufkes
// Date: June 14, 2021
// Project: Daily Coding Problem from June 14, 2021
// Description (MEDIUM):
//      This problem was asked by Google.
//          Given a singly linked list and an integer k, remove the kth last element from the list. k is guaranteed to be smaller than the length of the list.
//          The list is very long, so making more than one pass is prohibitively expensive.
//          Do this in constant space and in one pass.

package kufkes;

public class Main {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFront(7);
        ll.addFront(6);
        ll.addFront(5);
        ll.addFront(4);
        ll.addFront(3);
        ll.addFront(2);
        ll.addFront(1);

        System.out.println(ll.printList());

        ll.removeKthElement(3);

        System.out.println(ll.printList());

        ll.removeKthElement(5);

        System.out.println(ll.printList());

        ll.removeKthElement(1);

        System.out.println(ll.printList());

    }
}
