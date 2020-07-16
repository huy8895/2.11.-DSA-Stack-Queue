package optionalPalindromeQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheck {
    private java.lang.String string;
    private String[] stringArrays;


    public PalindromeCheck() {
        setString();
        stringToArray();
    }

    private void setString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        string = scanner.nextLine().toLowerCase().trim();
    }

    private void stringToArray() {
        this.stringArrays = this.string.split("");
    }

    public Stack<String> pushStringToStack(String[] strings) {
        Stack<String> stack = new Stack<>();
        for (String element : strings)
            stack.push(element);
        return stack;
    }

    public Queue<String> pushStringToQueue(String[] strings) {
        Queue<String> queue = new LinkedList<>();
        for (String element : strings)
            queue.add(element);
        return queue;
    }

    public boolean isElementStackVsQueueEquals() {
        Queue<String> queue = this.pushStringToQueue((stringArrays));
        Stack<String> stack = this.pushStringToStack(stringArrays);

        boolean isEquals = true;
        String stackElementPop;
        String queueElementPool;
        for (int i = 0; i < this.stringArrays.length; i++) {
            stackElementPop = stack.pop();
            queueElementPool = queue.poll();
            if (!stackElementPop.equals(queueElementPool))
                isEquals = false;
        }
        return isEquals;
    }
}

