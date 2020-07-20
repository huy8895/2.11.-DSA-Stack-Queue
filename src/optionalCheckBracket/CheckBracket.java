package optionalCheckBracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    Stack<String> bStack = new Stack<>();
    private String string;
    private String[] stringArrays;

    public CheckBracket(String string) {
        this.string = string;
        stringToArray();
    }

    public CheckBracket() {
        setString();
        stringToArray();
    }

    public void setString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        this.string = scanner.nextLine();
    }

    private void stringToArray() {
        this.stringArrays = this.string.split("");
    }

    public boolean isOK() {
        String[] strings = this.stringArrays;
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        Stack<String> stack = new Stack<>();

        for (String element : strings) {
            if (element.equals("(")) {
                stack.push(element);
                left.append(element);
            } else if (element.equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    right.append(element);
                }
            }
        }
        boolean isEquals = (left.length()) == (right.length());
        return isEquals;

    }


}
