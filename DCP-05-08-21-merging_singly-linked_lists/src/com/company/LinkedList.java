package com.company;

public class LinkedList {

    public Node head;

    public LinkedList(){
        this.head = null;
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

    public void addInOrder(int data){
        Node n = new Node(data);
        if(head == null || head.data > data){
            n.next = head;
            head = n;
            return;
        }
        Node curr, prev;
        curr = prev = head;

        while(curr != null && curr.data < data){
            prev = curr;
            curr = curr.next;
        }
        if(curr == null){
            prev.next = n;
            return;
        }
        prev.next = n;
        n.next = curr;

    }

    public String printList(){
        String s = "";
        Node curr = head;
        while(curr != null){
            s += curr.data + ", ";
            curr = curr.next;
        }

        return s;
    }
}
