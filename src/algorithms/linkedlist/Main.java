package algorithms.linkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Bryan");
        linkedList.add("Alexander");
        linkedList.forEach(System.out::println);

        // Custom Linked List
        CustomLinkedList customLinkedList = new CustomLinkedList();

        Node first  = new Node(3);
        Node second = new Node(6);
        Node third = new Node(9);
        Node fourth = new Node(12);

        customLinkedList.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        customLinkedList.content();
        customLinkedList.deleteBackHalf();
        customLinkedList.content();
    }
}
