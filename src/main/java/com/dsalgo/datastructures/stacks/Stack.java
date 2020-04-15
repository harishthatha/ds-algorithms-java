package com.dsalgo.datastructures.stacks;

import com.dsalgo.exceptions.StackEmptyException;
import com.dsalgo.exceptions.StackFullException;

/**
 * @author haris
 */
public class Stack {

    private Object[] stack;
    private int size;
    private int top;

    public Stack() {
        setSizeAndTop(50);
    }

    public Stack(int size) {
        setSizeAndTop(size);
    }

    private void setSizeAndTop(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new Object[this.size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    /**
     * @param object
     * @return
     * @throws StackFullException
     */
    public boolean push(Object object) throws StackFullException {
        if (isFull()) {
            throw new StackFullException("Stack is full");
        }
        stack[++top] = object;
        return true;
    }

    public Object pop() throws StackEmptyException {
        for (int i = 0; i < 10; i++) {
            if (i == 2) System.out.print("done");
        }
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        return stack[top--];

    }

    public int size() {
        return stack.length;
    }

}
