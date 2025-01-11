package algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueAndStack {

    public static void printBinary(int n) {
        if(n <= 0) {
            System.out.println();
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for (int i = 0; i < n; i++) {
            int current = queue.remove();
            System.out.println(current);
            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }
        System.out.println();
    }

    public static void printNextGreater(int[] array) {
        if (array.length == 0) {
            System.out.println();
            return;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(array[0]);
        for (int i = 1; i < array.length; i++) {
            int next = array[i];
            if (!stack.isEmpty()) {
                int popped = stack.pop();
                while (popped < next) {
                    System.out.printf("%d ----> %d%n", popped, next);
                    if (stack.isEmpty()) {
                        break;
                    }
                    popped = stack.pop();
                }
                if (popped > next) {
                    stack.push(popped);
                }
            }
            stack.push(next);
        }

        while (!stack.isEmpty()) {
            System.out.printf("%d ----> -1%n", stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        Integer removed = queue.remove();
        System.out.println(removed);
        System.out.println(queue.remove());

        Integer peek = queue.peek();
        System.out.printf("Peek Queue %s",peek);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

        System.out.println("-------------------------");

        printBinary(5);

        /*--------------------------------------------*/

        Stack<String> stack = new Stack<>();

        System.out.println("START -> main");
        stack.push("main");
        System.out.println("START -> builder");
        stack.push("builder");
        System.out.println("START -> external-service");
        stack.push("external-service");
        System.out.println("END -> " + stack.pop());
        System.out.println("START -> parse-external-data");
        stack.push("parse-external-data");
        System.out.println("END -> " + stack.pop());
        System.out.println("END -> " + stack.pop());
        System.out.println("END -> " + stack.pop());
        System.out.println();

        printNextGreater(new int[]{16, 7, 2, 15});
    }
}
