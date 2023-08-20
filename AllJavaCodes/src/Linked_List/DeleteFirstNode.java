package AllJavaCodes.src.Linked_List;

public class DeleteFirstNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);

        head.next = n1;
        n1.next= n2;
        n2.next = n3;


        // Traversing before deleting

        Node temp = head;
        while (temp != null){
            System.out.print(temp.value +" ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Deleted First Node");

        // Deleting from start of Linked List

        head = head.next;

        // Traversing the Linked List after Deleting the First Node

        Node temp2 = head;
        while (temp2 != null){
            System.out.print(temp2.value +" ");
            temp2 = temp2.next;
        }
    }
}
