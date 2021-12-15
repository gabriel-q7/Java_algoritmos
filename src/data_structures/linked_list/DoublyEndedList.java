package data_structures.linked_list;

public class DoublyEndedList {
    private Node head;
    private Node tail;

    public void insertAtTail(int data){
        Node newNode = new Node(data);

        if(this.head == null){
            this.head = newNode;
        }

        if(this.tail != null){
            this.tail.setNextNode(newNode);
        }
        this.tail = newNode;
    }

    public int length(){
        Node current = this.head;
        int counter = 0;

        while(current != null){
            counter++;
            current = current.getNextNode();
        }
        return counter;
    }

    @Override
    public String toString(){
        String result = "{";
        Node current = this.head;

        while(current != null){
            result += current + ", ";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
