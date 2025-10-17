package util;

import java.util.*;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        // stack.add("0");
        stack.push("0");
        stack.push("1");
        stack.push("2");

        // queue.add("0");
        queue.offer("0");
        queue.offer("1");
        queue.offer("2");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
