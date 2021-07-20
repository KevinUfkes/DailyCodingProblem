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

    public void addInOrder(Node n){
        if(head==null || head.data>n.data){
            n.next = head;
            head = n;
        } else{
            Node curr, prev;
            curr = prev = head;
            while(curr!=null && curr.data<n.data){
                prev = curr;
                curr = curr.next;
            }
                prev.next = n;
                n.next = curr;

        }
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
