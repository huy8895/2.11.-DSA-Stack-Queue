package optionalqueueArrayList;

import java.util.Arrays;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];

    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity)
            status = true;
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0)
            status = true;
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity ) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
        }

    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");


        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }



    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "capacity=" + capacity +
                ", queueArr=" + Arrays.toString(queueArr) +
                ", head=" + head +
                ", tail=" + tail +
                ", currentSize=" + currentSize +
                '}';
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(1);
        System.out.println(queue);

        queue.enqueue(2);
        System.out.println(queue);
        queue.enqueue(3);
        System.out.println(queue);

        queue.enqueue(4);
        System.out.println(queue);

        queue.enqueue(5);
        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);


    }


}
