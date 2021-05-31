// Author: Kevin Ufkes
// Date: May 31, 2021
// Project: Daily Coding Problem for May 26, 2021
// Description (EASY):
//      This problem was asked by Google.
//          A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
//          Given the root to a binary tree, count the number of unival subtrees.
//          For example, the following tree has 5 unival subtrees:

package kufkes;

public class BinaryTree {
    BTNode root;



    public BinaryTree(){
        this.root = null;
    }

    public void insert(int data){
        BTNode n = new BTNode(data);
        if(root == null){
            root = n;
            return;
        }
        BTNode curr = root;
        BTNode parent = root;
        while(curr !=null){
            parent = curr;
            if(curr.data>=n.data){
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        if(parent.data>=n.data){
            parent.left = n;
        } else{
            parent.right = n;
        }
    }

    public void inOrderTrav(){
        System.out.print("In Order Traversal:");
        recInOrder(root);
        System.out.println("");
    }

    public void recInOrder(BTNode curr){
        if (curr!=null){
            recInOrder(curr.left);
            System.out.print(" "+curr.data);
            recInOrder(curr.right);
        }
    }

    public void preOrderTrav(){
        System.out.print("Pre Order Traversal:");
        recPreOrder(root);
        System.out.println("");
    }

    public void recPreOrder(BTNode curr){
        if (curr!=null){
            System.out.print(" "+curr.data);
            recPreOrder(curr.left);
            recPreOrder(curr.right);
        }
    }

    public boolean isUnival(BTNode root){
        return univalHelper(root, root.data);
    }

    public boolean univalHelper(BTNode root, int data){
        if(root==null){
            return true;
        }
        if(root.data==data){
            return univalHelper(root.left, data) && univalHelper(root.right, data);
        }
        return false;
    }

    public int countUnivalSubtrees(BTNode root){
        if(root==null){
            return 0;
        }
        int left = countUnivalSubtrees(root.left);
        int right = countUnivalSubtrees(root.right);
        return isUnival(root) ?(1 + left + right) : left + right;
    }

    public void postOrderTrav(){
        System.out.print("Post Order Traversal:");
        recPostOrder(root);
        System.out.println("");
    }

    public void recPostOrder(BTNode curr){
        if(curr!=null){
            recPostOrder(curr.left);
            recPostOrder(curr.right);
            System.out.print(" " + curr.data);
        }

    }

}
