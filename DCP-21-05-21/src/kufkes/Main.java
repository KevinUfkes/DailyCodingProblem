//  Author: Kevin Ufkes
//  Date: May 21, 2021
//  Project: Daily Coding Problem
//  Description:
//      This problem was asked by Google.
//      Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.
//      For example, given the following Node class
//
//          class Node:
//              def __init__(self, val, left=None, right=None):
//              self.val = val
//              self.left = left
//              self.right = right

//          The following test should pass:
//              node = Node('root', Node('left', Node('left.left')), Node('right'))
//              assert deserialize(serialize(node)).left.left.val == 'left.left'

package kufkes;

public class Main {

    public static void main(String[] args) {

	    LinkedList ll = new LinkedList();

        ll.addFirst(3);
        ll.addLast(7);
        ll.addInOrder(5);
        ll.addInOrder(6);
        ll.addInOrder(9);

        System.out.println(ll.print());

        System.out.println(ll.delete(6));

        System.out.println(ll.print());
    }
}
