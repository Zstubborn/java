package com.stack;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		TheStack ms = new TheStack();
		ms.push("Chenzq");
		ms.push("Liucy");
		ms.push("BaiLu");
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
	}

}

class TheStack {
	
	private LinkedList lt = new LinkedList();

	public void push(Object name) {
		lt.addFirst(name);
	}

	public Object pop() {
		return lt.removeFirst();
	}

}
