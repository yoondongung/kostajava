import java.util.LinkedList;

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
		
	}	// end of main
}	// end of class
