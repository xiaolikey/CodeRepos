package top.xiaolikey.util;

public class MyStack {
    public static int DEFAULT_SIZE = 10;
    public static int MIN_SIZE = 16;
    private int[] elements;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        elements = new int[DEFAULT_SIZE];
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        group();
        elements[size++] = x;
    }

    private void group() {
        if (size >= elements.length) {
            int newSize = elements.length * 2 < 0 ? Integer.MAX_VALUE : elements.length * 2;
            int[] newElements = new int[newSize];
            System.arraycopy(elements, 0, newElements, 0, size);
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int val = elements[--size];
        shrink();
        return val;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return elements[size - 1];
    }

    private void shrink() {
        if (size <= elements.length / 2) {
            int newSize = Math.max(MIN_SIZE, elements.length / 2);
            int[] newElements = new int[newSize];
            System.arraycopy(elements, 0, newElements, 0, size);
        }
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(12);
        obj.push(24);
        obj.push(56);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.empty());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}
