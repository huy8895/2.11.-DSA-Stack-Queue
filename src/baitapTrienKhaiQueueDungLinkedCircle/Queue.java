package baitapTrienKhaiQueueDungLinkedCircle;

public class Queue {
    Node front;
    Node rear;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;

        }


    }


    void enQueue(int data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            this.front = temp;
            this.rear = temp;
        } else {
            temp.link = this.front;
            this.rear.link = temp;
            this.rear = temp;

        }

    }

    void deQueue() {
        if (isEmpty()){
            System.out.println("null");
            return;
        }
        if (this.front == this.rear){
            this.front = this.rear = null;
        } else {
            this.front = this.front.link;
            this.rear.link = this.front;
        }

    }

    void displayQueue() {
        Node temp = this.front;
        if (isEmpty()){
            System.out.println("null");
            return;
        }

        StringBuilder result = new StringBuilder();
        result.append("[" + front.data);
        while (temp.link!= this.front){
            result.append(" , ").append(temp.link.data);
            temp = temp.link;
        }
        result.append("]");
        System.out.println(result.toString());

    }

    boolean isEmpty() {
        return (this.front == null);
    }
}
