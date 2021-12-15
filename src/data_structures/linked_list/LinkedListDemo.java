package data_structures.linked_list;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtHead(12);
        list.insertAtHead(15);
        list.insertAtHead(2);

        System.out.println(list);
        System.out.println(list.length());
    }
}
