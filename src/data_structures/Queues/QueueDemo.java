package data_structures.Queues;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(5);
        queue.enqueue(22);
        queue.enqueue(11);

        System.out.println(queue);
        System.out.println("Dequeue: " + queue.dequeue().getData());
        System.out.println("Enqueue: " + queue.enqueue(7).getData());
        System.out.println(queue);
    }
}
