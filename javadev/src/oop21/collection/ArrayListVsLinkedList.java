package oop21.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<Integer>();
		long startTime = 0, endTime=0;
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList데이터 추가시간 = " +(endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			linkedList.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList데이터 추가시간 = " +(endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList데이터 검색시간 = " +(endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList데이터 검색시간 = " +(endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList데이터 제거시간 = " +(endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			linkedList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList데이터 제거시간 = " +(endTime-startTime)+"ns");
		
		
		
		
	}

}
