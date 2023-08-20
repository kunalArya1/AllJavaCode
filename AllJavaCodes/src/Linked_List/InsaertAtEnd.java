package AllJavaCodes.src.Linked_List;

public class InsaertAtEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node elem1 = new Node(20);
        Node elem2 = new Node(30);

        head.next = elem1;
        elem1.next = elem2;

        // Traversing the Linked List before Inserting

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value +" " );
            temp = temp.next;
        }

        System.out.println();

        // Inserting at the end of linked list
        Node temp2 = head;
        Node newNode = new Node(40);
        while (temp2.next != null){
            temp2 = temp2.next;

        }
        temp2.next = newNode;
        System.out.println(temp2.next.value);


        Node temp3 = head;
        while (temp3 != null){
            System.out.print(temp3.value + " ");
            temp3 = temp3.next;
        }

    }
//    public  static Node insertAtEnd(Node head, Node newVal){
//        Node temp = head;
//        if(head == null){
//            return temp;
//        }
//
//    }
}
