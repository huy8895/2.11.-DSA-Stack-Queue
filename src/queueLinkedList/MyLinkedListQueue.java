package queueLinkedList;

class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue (){
        this.head = null;
        this.tail = null;

    }

    public class Node {
        int key;
        Node next;

        public Node(int key){
            this.key = key;
            this.next = null;
        }

    }

    public void enqueue(int key){
        Node temp = new Node(key);
        if (this.tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue(){
        Node temp = this.head;

        if (this.head == null)
            return null;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }

    public String toString() {
        Node temp = head;
        if (head == null)
            return null;
        StringBuilder result = new StringBuilder("[" + head.key);

        int i = 0;
        while (temp.next != null) {
            result.append(", ");
            temp = temp.next;
            result.append(temp.key);
            i++;
        }

        return result.toString() + "]";
    }
}

