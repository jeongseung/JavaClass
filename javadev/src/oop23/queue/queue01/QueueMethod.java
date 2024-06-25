package oop23.queue.queue01;

import java.util.LinkedList;
import java.util.Queue;

import javax.lang.model.element.Element;

public class QueueMethod {
	public static void main(String[] args) {
		//1. 예외 처리 기능 미포함 메서드
		Queue<Integer> queue1 = new LinkedList<Integer>();
//		System.out.println(queue1.element()); //noSuchElementException
		//add()
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
		//element()
		System.out.println(queue1.element());
		//remove()
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		System.out.println();
		//2. 예외 처리 기능 포함 메서드
		Queue<Integer> queue2 = new LinkedList<Integer>();
		System.out.println(queue1.peek());
		//offer()
		queue2.offer(3);
		queue2.offer(4);
		queue2.offer(5);
		//peek()
		System.out.println(queue2.peek());
		//poll()
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
	}
}
