// Author: Kevin Ufkes
// Date: May 26, 2021
// Project: Daily Coding Problem May 24, 2021
// Description (HARD):
//      This problem was asked by Google.
//          An XOR linked list is a more memory efficient doubly linked list.
//          Instead of each node holding next and prev fields, it holds a field named both,
//          which is an XOR of the next node and the previous node.
//
//          Implement an XOR linked list; it has an add(element) which adds the element to the end,
//          and a get(index) which returns the node at index.
//          If using a language that has no pointers (such as Python),
//          you can assume you have access to get_pointer and dereference_pointer functions that converts
//          between nodes and memory addresses.

package kufkes;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addInOrder(7);
        dll.addInOrder(6);
        dll.addInOrder(3);
        dll.addInOrder(8);
        dll.addInOrder(5);
        dll.addInOrder(-4);

        System.out.println(dll.printList());
        System.out.println("");

        System.out.println(dll.search(3));
        System.out.println(dll.search(4));
        System.out.println(dll.search(5));
        System.out.println("");

        System.out.println(dll.delete(6));
        System.out.println(dll.delete(2));
        System.out.println(dll.printList());
        System.out.println("");

        System.out.println(0^200);
        System.out.println(4^3);

    }
}
