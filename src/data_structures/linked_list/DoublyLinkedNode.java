package data_structures.linked_list;

public class DoublyLinkedNode {
    private DoublyLinkedNode prevNode;
    private DoublyLinkedNode nextNode;
    private int data;

    public DoublyLinkedNode(int data){
        this.data = data;
    }

    public void setNextNode(DoublyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    public void setPrevNode(DoublyLinkedNode prevNode) {
        this.prevNode = prevNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyLinkedNode getNextNode() {
        return nextNode;
    }

    public DoublyLinkedNode getPrevNode() {
        return prevNode;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString(){
        return "Data: " + this.data;
    }
}
