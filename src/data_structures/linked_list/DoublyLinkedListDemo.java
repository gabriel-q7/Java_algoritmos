package data_structures.linked_list;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {

        DoublyLinkedList dList = new DoublyLinkedList();

        dList.insertAtTail(4);
        dList.insertAtTail(7);
        dList.insertAtTail(42);
        dList.insertAtHead(5);
        //5,4,7,42
        System.out.println(dList);
    }
}
