package kufkes;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public Node getHead(){
        return head;
    }

    public void addFront(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public void addNode(Node n){
        if(head == null){
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public String printList(){
        String s = "";
        Node curr = head;
            while(curr!=null){
                s += curr.data + ", ";
                curr = curr.next;
            }
        return s;
    }
}
