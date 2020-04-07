package com.dsalgorithms.stacks.main;

import com.dsalgorithms.exceptions.StackEmptyException;
import com.dsalgorithms.exceptions.StackFullException;
import com.dsalgorithms.stacks.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack stack = new Stack(6);

		try {
			stack.push(3);
			stack.push(true);
			stack.push(1);
			stack.push("harish");
			System.out.println("After popping :: " + stack.pop() + " ---size of the stack is " + stack.size());
			System.out.println("Is stack empty ? " + stack.isEmpty() + " ---- stack is is full ? :: " + stack.isFull());
			System.out.println("After popping :: " + stack.pop() + " --- size of the stack is " + stack.size());
			System.out.println("After popping :: " + stack.pop() + " ---- size of the stack is " + stack.size());
			System.out.println("After popping :: " + stack.pop() + " --- size of the stack is " + stack.size());
		} catch (StackEmptyException |StackFullException e) {
			e.printStackTrace();
		} 
	}

}
