package data_structures.linked_list;
//linha teste

public class DoublyLinkedList {
    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;

    private int length(){
        if(head == null) return 0;

        int length = 0;
        DoublyLinkedNode current = this.head;
        while(current != null){
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    public boolean isEmpty(){
        return this.length() == 0;
    }

    public void insertAtHead(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);

        if (isEmpty()) {
            tail = newNode;
        } else {
            head.setPrevNode(newNode);
            newNode.setNextNode(head);
        }
        head = newNode;
    }

    public void insertAtTail(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);

        if(isEmpty()){
            head = newNode;
        } else {
            tail.setNextNode(newNode);
            newNode.setPrevNode(tail);
        }
        tail = newNode;
    }

    public void insert(int data){

    }

    @Override
    public String toString(){
        String result = "{";
        DoublyLinkedNode current = this.head;

        while(current != null){
            result += current + ", ";
            current = current.getNextNode();
        }
        //Remove ultima virgula
        result = result.substring(0, result.length()-2);
        result += "}";
        return result;
    }
}
