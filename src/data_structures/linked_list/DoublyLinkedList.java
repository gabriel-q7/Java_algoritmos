package data_structures.linked_list;

public class DoublyLinkedList {
    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;

    public void insertAtHead(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);

        if (this.head != null)
            this.head.setPrevNode(newNode);

        this.head = newNode;
    }

    private int length(){
        if(head == null) return 0;

        int length = 0;
        DoublyLinkedNode current = this.head;
        while(current != null){
            length++;
            current.getNextNode();
        }

        return length;
    }

    @Override
    public String toString(){
        String result = "{";
        DoublyLinkedNode current = this.head;

        while(current != null){
            result += current + ", ";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
