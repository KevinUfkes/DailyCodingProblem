// Author: Kevin Ufkes
// Date: June 8, 20201
// Project: Daily Coding Problem from June 8, 2021
// Description (EASY):
//      This problem was asked by Google.
//          Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.
//          For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.
//          In this example, assume nodes with the same value are the exact same node objects.
//          Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.

package kufkes;

public class Main {

    public static int findIntersection(Node head1, Node head2){
        Node curr1 = head1;
        Node curr2 = head2;

        while(curr1.data != curr2.data){
            if(curr1.next != null){
                curr1 = curr1.next;
            } else{
                curr1 = head2;
            }
            if(curr2.next != null){
                curr2 = curr2.next;
            } else{
                curr2 = head1;
            }
        }

        return curr1.data;
    }

    public static void main(String[] args) {

        LinkedList ll01 = new LinkedList();
        LinkedList ll02 = new LinkedList();

//        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n10 = new Node(10);
        Node n11 = new Node(11);
        Node n99 = new Node(99);


        ll01.addNode(n10);
        ll01.addNode(n8);
//        ll01.addNode(n1);
        ll01.addNode(n2);
        ll01.addNode(n5);
        ll01.addNode(n7);
        ll01.addNode(n3);
        ll01.addNode(n4);


        ll02.addNode(n11);
        ll02.addNode(n8);
//        ll02.addNode(n1);
        ll02.addNode(n99);

        System.out.println(ll01.printList());
        System.out.println(ll02.printList());

        System.out.println(findIntersection(ll01.getHead(), ll02.getHead()));
    }
}
