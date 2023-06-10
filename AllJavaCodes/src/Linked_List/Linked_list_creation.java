package Linked_List;
class  Node{
    int value;
    Node next;
    public Node(int value )
    {
        this.value = value;
        next = null;
    }
}
public class Linked_list_creation {
    public static void main(String[] args) {
        Node head = new Node(5);
        Node elem = new Node(6);
        Node  elem2 = new Node(7);
        Node  elem3 = new Node(8);
        head.next = elem;
        elem.next = elem2;
        elem2.next = elem3;

        Node temp = head;
        while (temp != null){
            System.out.print(temp.value +" ");
            temp = temp.next;
        }
    }
}
