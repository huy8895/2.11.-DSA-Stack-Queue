package stackSuDungLinkedListJava;

public class GenericStackClient {
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("1.1 Size of Stack Integer after push operations: " + stack.size() );
        System.out.println("1.2 Pop elements from stack: ");
        while (!stack.isEmpty())
            System.out.printf(" %d", stack.pop());
        System.out.println("\n1.3 Size of stack after pop operations: " + stack.size());
    }
    private static void stackOfIString(){
        MyGenericStack<String> stack =  new MyGenericStack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        stack.push("six");
        System.out.println("2.1 Size of Stack string after push operations: " + stack.size());
        System.out.println("2.2 Pop elements from stack: ");
        while (!stack.isEmpty())
            System.out.printf(" %s",stack.pop());
        System.out.println("\n2.3 Size of stack adter pop operations: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of Integers");
        stackOfIntegers();
        System.out.println("2. Stack of Strings");
        stackOfIString();
    }
}
