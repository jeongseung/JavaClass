package oop23.stackstack01;

import java.util.Stack;

public class StackMethod {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		//1. push()
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		//2. peek()
		stack.peek();
		stack.size();
		//3. search()
		System.out.println(stack.search(7));
		System.out.println(stack.search(3));
		System.out.println(stack.search(5));
		System.out.println(stack.search(2));
		System.out.println(stack.search(9));
		System.out.println();
		//4. pop()
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		//5. empty()
		System.out.println(stack.empty());
		
	}

}
