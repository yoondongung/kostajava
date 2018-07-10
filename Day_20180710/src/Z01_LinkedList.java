import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * List 계열 : 순서 있음, 중복허용됨
 * 	LinkedList는 ArrayList의 비순차적 삽입/삭제 기능을 개선한 클래스
 * 			이중원형연결리스트로 구현되어있다.
 * 			Queue 인터페이스를 구현했다.
 * @author yoondongung
 *
 */
public class Z01_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("사자");	// 리스트의 방식
		ll.add("호랑이");
		ll.add("오리");
		ll.add("기린");
		ll.add("토끼");		
		System.out.println(ll);
		
		ll.push("강아지");	// 큐를 구현
		System.out.println(ll);
		
		ll.add(2, "야옹이");	// 비순차적 삽입
		System.out.println(ll);
		
		ll.remove(2);	// 비순차적 삭제
		System.out.println(ll);
		
		System.out.println("향상된 for문");
		for(String a : ll) {
			System.out.print(a);
		}
		
		System.out.println();
		System.out.println("일반 for문");
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i));
		}
		
		//iterator	: 단방향 순회를 할 수 있는 인터페이스
		Iterator<String> iter = ll.iterator();	// 일회용 발생기
		while(iter.hasNext()) {	// 다음 원소가 있느냐?
			String s = iter.next();
			System.out.println(s+",");
		}
		System.out.println(": 이터레이터 사용");
		
		
		//Iterator : 양방향 순회를 할 수 있는 인터페이스
		ListIterator<String> listiter = ll.listIterator();
		while(listiter.hasNext()) {
			String s = listiter.next();
			System.out.print(s);
		}
		System.out.println(": 리스트 이터레이터 사용");
		
		
		while(listiter.hasPrevious()) {
			String s = listiter.previous();
			System.out.print(s);
		}
		System.out.println(": 리스트 이터레이터 사용");
		
	}	// end of main
}	// end of class
