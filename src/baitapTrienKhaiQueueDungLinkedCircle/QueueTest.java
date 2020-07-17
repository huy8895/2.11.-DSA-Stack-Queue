package baitapTrienKhaiQueueDungLinkedCircle;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.displayQueue();

        queue.enQueue(10);
        queue.enQueue(11);
        //queue.displayQueue();
        queue.enQueue(12);
        queue.displayQueue();
        queue.deQueue();
        queue.displayQueue();
        queue.deQueue();
        queue.displayQueue();
        System.out.println(queue.getFront().data);
        System.out.println(queue.getRear().data);
    }

}

