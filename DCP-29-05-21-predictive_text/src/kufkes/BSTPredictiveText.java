package kufkes;

public class BSTPredictiveText {
    private BSTNode root;

    public BSTPredictiveText(){
        this.root = null;
    }

    public void insert(String data){
        BSTNode n = new BSTNode(data);
        if(root==null){
            root = n;
            return;
        }

        BSTNode curr, parent;
        curr = parent = root;
        while(curr!=null){
            parent = curr;
            if(curr.data.compareTo(data)<0){
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        if(parent.data.compareTo(data)<0){
            parent.right = n;
        } else {
            parent.left = n;
        }
    }

    public void printInOrder(){
        System.out.print("In Order Traversal: ");
        recInOrder(root);
    }

    private void recInOrder(BSTNode curr){
        if(curr!=null){
            recInOrder(curr.left);
            System.out.print(curr.data + ", ");
            recInOrder(curr.right);
        }
    }

    public boolean searchPredictive(String text){
        System.out.print("Predictions: ");
        BSTNode curr = root;
        if(root==null){
            return false;
        }
        while(curr!= null){
            if(curr.data.substring(0, text.length()).equals(text)){
                recPredictions(curr, text);
                return true;
            }
            if(curr.data.compareTo(text)<0){
                curr = curr.right;
            } else{
                curr = curr.left;
            }
        }
        return false;
    }

    public void predictiveText(String text){
        System.out.print("Predictions: ");
        recPredictions(root, text);
    }

    private void recPredictions(BSTNode curr, String text){
        if(curr!=null){
            if(curr.data.substring(0, text.length()).equals(text)){
                System.out.print(curr.data + ", ");
            }
            recPredictions(curr.left, text);
            recPredictions(curr.right, text);
        }
    }
}
