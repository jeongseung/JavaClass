package oop21.collection3;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethod_1 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet.toString());
		//1.first() - 맨앞 출력
		System.out.println(treeSet.first());
		//2. last() -맨뒤 출력
		System.out.println(treeSet.last());
		//3. lower(E element) - E보다는 작은 값중 가장 큰 값
		System.out.println(treeSet.lower(26));
		//4. higher(E element) - E보다 큰 값중 가장 작은 값
		System.out.println(treeSet.higher(26));
		//5. floor(E element) - E보다 같거나 작은 가장 큰 수
		System.out.println(treeSet.floor(25));
		System.out.println(treeSet.floor(26));
		//6. ceiling(E element) - E와 같거나 큰 가장 작은 수
		System.out.println(treeSet.ceiling(25));
		System.out.println(treeSet.ceiling(26));
		System.out.println();
		//7. pollFirst() - 맨앞 출력하고 값을 뺴온다
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		for(int i=0; i<treeSetSize; i++) {
			System.out.print(treeSet.pollFirst() + " ");
		}
		System.out.println();
		System.out.println(treeSet);
		//8.pollLast() - 맨뒤 출력하고 값을 빼온다
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		treeSetSize = treeSet.size();
		for(int i=0; i<treeSetSize; i++) {
			System.out.print(treeSet.pollLast() + " ");
		}
		System.out.println();
		System.out.println(treeSet);
		//9. SortedSet<E> headeSet(E element) - E미만인 모든 원소로 구성된 Set을 리턴 E는 미포함
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		SortedSet<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet);
		
		//10. NavigableSet<E> headSet(E elemenet, boolean inclusive) - E미만/이하인 모든 원소로 구성된 Set을 리턴(inclusive=true면 E포함, false면  미포함)
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);
		System.out.println(nSet.toString());
		
		//11. SortedSet<E> tailSet(E element) - E이상인 모든 원소로 구성된 Set을 리턴 E포함
		sSet = treeSet.tailSet(20);
		System.out.println(sSet);
		
		//12. navigableSet<E> tailSet(E element, boolean inclusive) - E초과/이상인 모든 원소로 구성된 Set을 리턴(inclusive=true이면 E포함, false는 미포함)
		nSet = treeSet.tailSet(20,  true);
		System.out.println(nSet);
		nSet = treeSet.tailSet(20, false);
		System.out.println(nSet);
		//13. SortedSet<E> subSet(E eFromlement, E toelement) -from이상 to 미만인 원소들로 이뤄진 Set을 리턴(fromElement포함, toElement미포함) 
		sSet = treeSet.subSet(10, 20);
		System.out.println(sSet.toString());
		//14 NavigableSet<E> subSet(E fromelement, boolean frominclusive, E toelement, boolean toinclusive) - fromele 초과/이상 toele미만/이하인 원소들로 이뤄진 Set리턴(fromclusive가 true/false면 fromelement 포함/미포함, toinclusive true/false면 toelement포함/미포함
		nSet = treeSet.subSet(10, true, 20, false);
		System.out.println(nSet);
		nSet = treeSet.subSet(10, false, 20, true);
		System.out.println(nSet);
		//15. NavigableSet<E> descendingSet() - 내림차순의 의미가 아니라 현재 정렬 기준을 반대로 변환
		System.out.println(treeSet);
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);
		descendingSet = descendingSet.descendingSet();
		System.out.println(descendingSet);
	}
}
