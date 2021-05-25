package kufkes;

public class LinkedList {

    private Node head;

    public LinkedList(){
        head = null;
    }

    public void addFirst(int data){
        Node n = new Node(data);
        if (head != null) {
            n.next = head;
        }
        head = n;
    }

    public void addLast(int data){
        Node n = new Node(data);
        Node temp = head;
        if(temp == null){
            head = n;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
    }

    public void addInOrder(int data){
        Node n = new Node(data);


        if(head == null || data < head.data){
            n.next = head;
            head = n;
            return;
        }
        Node prev = head;
        Node curr = head;

        while(curr != null && curr.data < data){
            prev = curr;
            curr = curr.next;
        }
        n.next = curr;
        prev.next = n;
    }

    public boolean delete(int data){
        Node curr, prev;
        curr = prev = head;

        if(head == null || head.data == data){
            head = head.next;
        }

        while(curr != null && curr.data != data){
            prev = curr;
            curr = curr.next;

        }
        if(curr == null) {
            return false;
        }
        prev.next = curr.next;
        return true;
    }

    public String print(){
        Node temp = head;
        String s = "";

        while(temp != null){
            s += temp.data + ", ";
            temp = temp.next;
        }
        return s;
    }

}
