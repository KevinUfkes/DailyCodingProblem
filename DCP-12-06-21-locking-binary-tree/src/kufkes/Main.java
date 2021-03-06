// Author: Kevin Ufkes
// Date: June 14, 2021
// Project: Daily Coding Problem from June 12, 2021
// Description (MEDIUM):
//      This problem was asked by Google.
//          Implement locking in a binary tree. A binary tree node can be locked or unlocked only if all of its descendants or ancestors are not locked.
//          Design a binary tree node class with the following methods:
//              is_locked, which returns whether the node is locked
//              lock, which attempts to lock the node. If it cannot be locked, then it should return false.
//              Otherwise, it should lock it and return true.
//              unlock, which unlocks the node. If it cannot be unlocked, then it should return false.
//              Otherwise, it should unlock it and return true.
//              You may augment the node to add parent pointers or any other property you would like. '
//              You may assume the class is used in a single-threaded program, so there is no need for actual locks or mutexes.
//              Each method should run in O(h), where h is the height of the tree.

package kufkes;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        BSTree bst = new BSTree();
        bst.insert(4);
        bst.insert(3);
        bst.insert(7);
        bst.insert(8);
        bst.insert(2);
        bst.insert(1);
        bst.insert(6);

        bst.inOrderTraversal();
        System.out.println("");

        System.out.println(bst.lockNode(4));
        System.out.println("");

        System.out.println(bst.lockNode(1));
    }
}
