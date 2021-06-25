// Author: Kevin Ufkes
// Date: June 24, 2021
// Project: Daily Coding Problem from June 24, 2021
// Description (MEDIUM):
//      This problem was asked by Dropbox.
//          Given the root to a binary search tree, find the second largest node in the tree.

package kufkes;

public class Main {

    public static void main(String[] args) {
	    BSTree bst = new BSTree();


	    bst.insert(4);

	    bst.insert(5);

        bst.insert(7);

        bst.insert(2);

        bst.insert(3);

        bst.insert(6);

        bst.inOrderTraversal();
        bst.findSecondLargest();
    }
}
