package data_structures.linked_list;

public class DoublyEndedListDemo {

    public static void main(String[] args) {

        DoublyEndedList dList = new DoublyEndedList();
        dList.insertAtTail(17);
        dList.insertAtTail(24);
        dList.insertAtTail(51);

        System.out.println(dList);
        System.out.println(dList.length());
    }
}
