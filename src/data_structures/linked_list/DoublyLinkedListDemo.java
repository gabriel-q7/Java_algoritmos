package data_structures.linked_list;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {

        DoublyLinkedList dList = new DoublyLinkedList();

        dList.insertAtHead(4);
        dList.insertAtHead(7);
        dList.insertAtHead(42);

        System.out.println(dList);
    }
}
