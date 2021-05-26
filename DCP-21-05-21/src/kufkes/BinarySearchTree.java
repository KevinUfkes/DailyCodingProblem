package kufkes;

public class BinarySearchTree {

    public BSTNode root;
    public String output;

    public BinarySearchTree(){
        this.root = null;
    }

    public boolean search(int data){
        if(root == null){
            return false;
        }

        BSTNode current = root;
        while(current != null && current.data != data){
            if(current.data > data){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if(current == null){
            return false;
        }
        return true;
    }

    public void insert(int data){
        BSTNode n = new BSTNode(data);

        if(root == null){
            root = n;
            return;
        }

        BSTNode current, parent;
        current = parent = root;
        while(current != null){
            parent = current;
            if(current.data > data){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if(parent.data > data){
            parent.left = n;
        } else {
            parent.right = n;
        }
    }

    public String inOrderTravString(){
        this.output = "";
        recInOrderString(root);
        output += "";
        this.root = null;
        return output;
    }

    public String recInOrderString(BSTNode curr){
        if (curr!=null){
            recInOrderString(curr.left);
            this.output += curr.data + " ";
            recInOrderString(curr.right);
        }
        return output;
    }

    public void inOrderTrav(){
        System.out.print("In Order Traversal:");
        recInOrder(root);
        System.out.println("");
    }

    public void recInOrder(BSTNode curr){
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

    public void recPreOrder(BSTNode curr){
        if (curr!=null){
            System.out.print(" "+curr.data);
            recPreOrder(curr.left);
            recPreOrder(curr.right);
        }
    }

    public void postOrderTrav(){
        System.out.print("Post Order Traversal:");
        recPostOrder(root);
        System.out.println("");
    }

    public void recPostOrder(BSTNode curr){
        if (curr!=null){
            recPostOrder(curr.left);
            recPostOrder(curr.right);
            System.out.print(" "+curr.data);
        }
    }

}
