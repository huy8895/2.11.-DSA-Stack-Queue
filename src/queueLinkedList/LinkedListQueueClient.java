package queueLinkedList;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(1);
        System.out.println("queue = " + queue);

        queue.enqueue(2);
        System.out.println("queue = " + queue);;

        queue.dequeue();
        System.out.println("queue = " + queue);

        queue.enqueue(3);
        System.out.println("queue = " + queue);

        queue.dequeue();
        System.out.println("queue = " + queue);

        queue.dequeue();
        System.out.println("queue = " + queue);
    }
}
