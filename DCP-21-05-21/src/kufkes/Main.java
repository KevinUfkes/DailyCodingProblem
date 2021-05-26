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
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(23);
        bst.insert(12);
        System.out.println(bst.search(23));
        System.out.println(bst.search(33));

        System.out.println(bst.output);

        bst.inOrderTrav();

        bst.preOrderTrav();

        bst.postOrderTrav();

        String string = bst.inOrderTravString();

        String [] newString = string.split(" ");
        for(int x=0; x<newString.length; x++){
            int temp = Integer.parseInt(newString[x]);
            bst.insert(temp);
        }
        bst.inOrderTrav();


    }
}
