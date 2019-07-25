package top.xiaolikey.util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
    /**
     * Initialize your data structure here.
     */
    private Queue<Integer> queue1;
    private Integer top;
    public QueueStack() {
        queue1 = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue1.add(x);
        top = x;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int loop = queue1.size() - 1;
        while(loop-- > 0){
            top = queue1.remove();
            queue1.add(top);
        }
        return queue1.remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return top;
    }


    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue1.isEmpty();
    }
}
