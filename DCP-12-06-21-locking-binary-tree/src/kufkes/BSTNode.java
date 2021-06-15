package kufkes;

public class BSTNode {
    public int data;
    public BSTNode right;
    public BSTNode left;
    private boolean locked;

    public BSTNode(int data){
        this.data = data;
        this.right = null;
        this.left = null;
        this.locked = false;
    }

    public boolean getLocked(){ return locked; }
    public void setLocked(boolean locked){ this.locked = locked; }

    public boolean lock(){
        if(allDescendantsLocked(this)){
            this.setLocked(true);
            return true;
        }
        return false;
    }

    private boolean allDescendantsLocked(BSTNode curr){
        return recInOrder(curr);
    }

    private boolean recInOrder(BSTNode curr){
        if(curr!=null && !curr.getLocked()) {
            recInOrder(curr.left);
            recInOrder(curr.right);
        }
        if(curr==null){return true;}
        return true;
    }
}
