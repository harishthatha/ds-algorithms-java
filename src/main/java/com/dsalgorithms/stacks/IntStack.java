package com.dsalgorithms.stacks;

import com.dsalgorithms.exceptions.StackEmptyException;

public class IntStack {

	private int[] stack;
	private int size;
	private int top;

	// Takes the default size as 50
	 public IntStack() {
		this.size = 50;
		setSizeAndTop();
	}

	// We can create stack with custom size
	public IntStack(final int size) {
		this.size = size;
		setSizeAndTop();
	}

	private void setSizeAndTop() {
		this.top = -1;
		this.stack = new int[this.size];
	}

	public boolean isFull() {
		return this.top == this.stack.length - 1;
	}

	public boolean isEmpty() {
		return this.top == -1;
	}

	public boolean push(int num) {
		if (!isFull()) {
			stack[++top] = num;
			return true;
		}
		return false;
	}

	public int pop() throws StackEmptyException {
		if(isEmpty()) {
			throw new StackEmptyException("Stack is empty");
		}
		return stack[top--];
	}
	
	public int size() {
		return stack.length;
	}

}
