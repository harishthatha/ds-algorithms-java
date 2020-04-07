package com.dsalgorithms.basics;

import java.util.LinkedList;
import java.util.Queue;

class TestBasics {
	public static void main(String[] args) {
		Basics basics = new Basics();
		Basics b2 = basics;
		b2.setNum(25);
		//System.out.println(basics.getNum() + " " + b2.getNum());
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(2);
		queue.add(35);
		queue.add(74);
		queue.remove();
		System.out.println(queue.peek());
		System.out.println(basics.checkGivenName("harisha"));

	}
}
