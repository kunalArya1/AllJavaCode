package Linked_List;

public class Linkedlist_travesal {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node elem1 = new Node(20);
        Node elem2 = new Node(30);
        Node elem3 = new Node(40);
        Node elem4 = new Node(50);

        head.next = elem1;
        elem1.next = elem2;
        elem2.next = elem3;
        elem3.next = elem4;

        Node temp = head;
        while (temp != null){
            System.out.print(temp.value +" ");
            temp = temp.next;
        }
    }
}
