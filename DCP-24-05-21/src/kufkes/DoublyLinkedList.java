package kufkes;

public class DoublyLinkedList {
    public Node head;

    public DoublyLinkedList(){
        this.head = null;
    }

    public void addFirst(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            return;
        }
        head.prev = n;
        n.next = head;
        head = n;
    }

    public void addLast(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = n;
        n.prev = curr;
    }

    public void addInOrder(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }
        if(data < head.data){
            n.next = head;
            head.prev = n;
            head = n;
        }
        Node curr = head;
        Node prev = head;
        while(curr.next != null && curr.data<data){
            prev = curr;
            curr = curr.next;
        }
        if(curr.next == null){
            n.prev = curr;
            curr.next = n;
        }
        if(curr.data>data){
            n.next = curr;
            curr.prev = n;
            n.prev = prev;
            prev.next = n;
        }
    }

    public boolean search(int data){
        Node curr = head;
        while(curr.next!=null && curr.data!=data){
            curr = curr.next;
        }
        if(curr.data==data){
            return true;
        }
        return false;
    }

    public boolean delete(int data){
        Node curr, prev, next;
        curr = prev = next = head;
        while(next!=null && curr.data != data){
            prev = curr;
            curr = curr.next;
            next = curr.next;
        }
        if(curr.data==data){
            prev.next = next;
            next.prev = prev;
            return true;
        }
        return false;
    }

    public String printList(){
        Node curr = head;
        String s = "";
        while(curr != null){
            s += curr.data + ", ";
            curr = curr.next;
        }
        return s;
    }
}

