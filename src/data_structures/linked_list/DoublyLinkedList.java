package data_structures.linked_list;

public class DoublyLinkedList {
    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;

    public boolean isEmpty(){
        return this.head == null;
    }

    public void insertAtHead(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);

        if (isEmpty()) {
            tail = newNode;
        } else {
            this.head.setPrevNode(newNode);
        }
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void insertAtTail(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);

        newNode.setPrevNode(this.tail);

        if(this.tail != null)
            this.tail.setNextNode(newNode);

        this.tail = newNode;
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
