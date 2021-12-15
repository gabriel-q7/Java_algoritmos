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

    public int length(){
        Node current = this.head;
        int counter = 0;

        while(current != null){
            counter++;
            current = current.getNextNode();
        }
        return counter;
    }

    public void deleteFromHead(){
        this.head = this.head.getNextNode();
    }

    public Node find(int data){
        Node current = this.head;

        while(current != null){
            if(data == current.getData()){
                return current;
            }
            current = current.getNextNode();
        }
        //nada foi encontrado
        return null;
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
