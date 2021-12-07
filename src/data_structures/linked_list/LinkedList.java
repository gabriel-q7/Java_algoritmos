package data_structures.linked_list;

public class LinkedList {
    private Node head;

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public LinkedList(int data){
        this.setHead(new Node(data));
    }
}
