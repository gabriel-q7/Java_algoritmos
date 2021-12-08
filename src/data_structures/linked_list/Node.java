package data_structures.linked_list;

public class Node {
    private int data;
    private Node nextNode;

    public Node(int data){
        this.data = data;
    }

    public Node(){}

    public int getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString(){
        return "Data: " + this.data;
    }
}
