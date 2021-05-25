package kufkes;

public class LinkedList {

    private LLNode head;

    public LinkedList(){
        head = null;
    }

    public void addFirst(int data){
        LLNode n = new LLNode(data);
        if (head != null) {
            n.next = head;
        }
        head = n;
    }

    public void addLast(int data){
        LLNode n = new LLNode(data);
        LLNode temp = head;
        if(temp == null){
            head = n;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
    }

    public void addInOrder(int data){
        LLNode n = new LLNode(data);


        if(head == null || data < head.data){
            n.next = head;
            head = n;
            return;
        }
        LLNode prev = head;
        LLNode curr = head;

        while(curr != null && curr.data < data){
            prev = curr;
            curr = curr.next;
        }
        n.next = curr;
        prev.next = n;
    }

    public boolean delete(int data){
        LLNode curr, prev;
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
        LLNode temp = head;
        String s = "";

        while(temp != null){
            s += temp.data + ", ";
            temp = temp.next;
        }
        return s;
    }

}
