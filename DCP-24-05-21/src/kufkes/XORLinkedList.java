package kufkes;

public class XORLinkedList {
    private XORNode head;
    private int nodePointerSeed;
    private int nodeCount;

    public XORLinkedList(){
        this.head = null;
        this.nodePointerSeed = 100;
        this.nodeCount = 0;
    }

    public void addLast(int data){
        XORNode n = new XORNode(data, nodePointerSeed + nodeCount);
        nodeCount++;
        if(head == null){
            head = n;
            return;
        }

    }
}
