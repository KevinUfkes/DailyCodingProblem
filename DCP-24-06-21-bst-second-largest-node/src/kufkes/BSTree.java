package kufkes;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BSTree {
    public BSTNode root;

    public BSTree(){
        this.root = null;
    }

    public void insert(int data){
        BSTNode n = new BSTNode(data);
        if(root==null){
            root = n;
            return;
        }
        BSTNode curr, parent;
        curr = parent = root;
        while(curr!=null){
            parent = curr;
            if(curr.data>data){
                curr = curr.left;
            } else{
                curr = curr.right;
            }
        }
        if(parent.data>data){
            parent.left = n;
        } else{
            parent.right = n;
        }
    }

    public void inOrderTraversal(){
        System.out.println("In Order Traversal: ");
        recInOrder(root);
    }

    private void recInOrder(BSTNode curr){
        if(curr!=null){
            recInOrder(curr.left);
            System.out.print(curr.data + ", ");
            recInOrder(curr.right);
        }
    }

    public void getSecondLargest(){

        if(root==null || (root.right==null && root.left==null)){
            System.out.println("Not enough data!");
        }


        BSTNode curr, parent;
        curr = parent = root;
        if(root.right!=null){
            while(curr.right!=null){
                parent = curr;
                curr = curr.right;
            }
            System.out.println("");
            System.out.println(parent.data);
            return;
        }
        if(root.right==null){
            curr = root.left;
            parent = curr;
            while(curr.right!=null){
                parent = curr;
                curr = curr.right;
            }
            System.out.println("");
            System.out.println(parent.data);
        }

    }

    public void findSecondLargest(){
        if(root==null || (root.right==null && root.left==null)){
            System.out.println("Not enough data!");
        }

        BSTNode curr, parent, largest;
        curr = parent = largest = root;

        while(curr!=null){
            parent = largest;
            largest = curr;
            curr = curr.right;
        }

        if(largest!=null && largest.left==null){
            System.out.println("");
            System.out.println(parent.data);
            return;
        }
        curr = largest.left;

        while(curr!=null){
            parent=curr;
            curr = curr.right;
        }
        System.out.println("");
        System.out.println(parent.data);
        return;

    }



}
