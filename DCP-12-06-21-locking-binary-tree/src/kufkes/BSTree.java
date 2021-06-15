package kufkes;

public class BSTree {
    private BSTNode root;

    public BSTree(){
        this.root = null;
    }

    public void insert(int data){
        BSTNode n = new BSTNode(data);

        if(root==null){
            root = n;
            return;
        }
        BSTNode curr = root;
        BSTNode parent = root;
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
        } else {
            parent.right = n;
        }
    }

    public boolean lockNode(int data){
        if(root==null){
            return false;
        }
        BSTNode curr = root;
        while(curr!=null && curr.data !=data){
            if(curr.data>data){
                curr = curr.left;
            } else{
                curr = curr.right;
            }
        }
        if(curr==null){ return false; }
        else{ return curr.lock(); }
    }

    public void inOrderTraversal(){
        System.out.print("In Order Traversal: ");
        recInOrder(root);
        System.out.println("");
    }

    private void recInOrder(BSTNode curr){
        if(curr!=null) {
            recInOrder(curr.left);
            System.out.print(curr.data + ", ");
            recInOrder(curr.right);
        }
    }
}
