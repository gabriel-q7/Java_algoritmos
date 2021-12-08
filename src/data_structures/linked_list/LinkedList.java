package data_structures.linked_list;

public class LinkedList {
    private Node head;

    public LinkedList(int data){
        this.head = new Node(data);
    }

    public LinkedList(){}

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    @Override
    public String toString(){
        String result = "{";
        Node current = this.head;

        while(current != null){
            result += current + ",";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
