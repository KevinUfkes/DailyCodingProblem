package kufkes;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public void addFront(int data){
        Node n = new Node(data);

        if(head==null){
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public void removeKthElement(int k){
        Node curr = head;
        Node toRemove = head;
        Node toRemovePrev = head;
        int count = 0;
        while(curr!=null){
            curr = curr.next;
            if(count>=k){
                toRemovePrev = toRemove;
                toRemove = toRemove.next;
            }
            count++;
        }
        System.out.println(toRemovePrev.data);
        System.out.println(toRemove.data);
        toRemovePrev.next = toRemove.next;
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
