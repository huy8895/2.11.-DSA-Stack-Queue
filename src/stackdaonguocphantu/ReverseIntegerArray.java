package stackdaonguocphantu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int [] arrInt = new int[]{1,3,4,12,5};

        Stack<Integer> stack = new Stack<>();
        for (Integer integer : arrInt)
            stack.push(integer);

        for (int i = 0; i < arrInt.length;i ++){
            arrInt[i] = stack.pop();
        }

        System.out.println(Arrays.toString(arrInt));

    }
}
