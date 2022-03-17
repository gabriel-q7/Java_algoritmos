package data_structures.Queues;

public class Queue {
    private QueueNode head;
    private QueueNode tail;

    public QueueNode getHead() {
        return head;
    }

    public void setHead(QueueNode head) {
        this.head = head;
    }

    public QueueNode getTail() {
        return tail;
    }

    public void setTail(QueueNode tail) {
        this.tail = tail;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public int length(){
        QueueNode current = this.head;
        int counter = 0;

        while (current != null){
            counter++;
            current = current.getNextNode();
        }
        return counter;
    }

    public QueueNode enqueue(int data){
        //insert to the end
        QueueNode newNode = new QueueNode(data);

        if(isEmpty()) {
            this.head = newNode;
        } else {
            tail.setNextNode(newNode);
        }
        this.tail = newNode;
        return newNode;
    }

    public QueueNode dequeue(){
        //remove from the head
        QueueNode current = this.head;
        this.head = this.head.getNextNode();
        return current;
    }

    public QueueNode peek(){
        if(!isEmpty()) {
            return this.head;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        if(isEmpty()) return "Empty queue";

        String result = "Queue{";
        QueueNode current = this.head;
        while(current != null){
            result += "Data: " + current.getData() + ", ";
            current = current.getNextNode();
        }
        result = result.substring(0, result.length() - 2);
        result += "}";
        return result;
    }
}
