package Linked_List;

public class InsertAtStart {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node elem1 = new Node(20);
        Node elem2 = new Node(30);


        head.next = elem1;
        elem1.next = elem2;

        // Traversing the Linked List

        Node temp = head;
        System.out.print("Before Inserting :-  ");
        while (temp != null){
            System.out.print(temp.value +" ");
            temp = temp.next;
        }
        System.out.println();

        // Inserting at Start

        Node newElem = new Node(5);
        newElem.next = head;
        head = newElem;

        // Traversing the Linked List

        Node temp2 = head;
        System.out.print("After Inserting :-  ");
        while (temp2 != null){
            System.out.print(temp2.value +" ");
            temp2 = temp2.next;
        }
    }
}
