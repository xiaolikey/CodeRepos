package top.xiaolikey.util;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<>();
    private Integer first;

    /**
     * Initialize your data structure here.
     */
    public StackQueue() {
    }

    /**
     * Push element x to the back of queue.
     */
    /*public void push(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        while(!stack2.isEmpty()){

        }
    }*/
    public void push(int x) {
        if (stack1.isEmpty())
            first = x;
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    /*public int pop() {
        return stack1.pop();
    }*/
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
        }
//        first = stack2.peek();
        return stack2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        return first;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
    }
}
