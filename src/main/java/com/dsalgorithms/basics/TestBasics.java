package com.dsalgorithms.basics;

import java.util.LinkedList;
import java.util.Queue;

class TestBasics {
	public static void main(String[] args) {
		Basics basics = new Basics();
		Queue<Integer> queue = new LinkedList<>();
		queue.add(2);
		queue.add(35);
		queue.add(74);
		queue.remove();
		System.out.println(queue.peek());
		System.out.println(basics.checkGivenName("harish"));

	}
}
