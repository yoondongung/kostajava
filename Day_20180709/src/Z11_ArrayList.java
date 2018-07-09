import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collection Framework
 * 	1. List	: 순서 있음, 데이터의 중복이 가능
 * 	2. Set 	: 순서 없음, 데이터의 중복이 불가능
 * 	3. Map	: 키 - 값의 쌍으로 이루어짐, 키를 구분의 기준으로 삼는다, 키는 중복 불가, 값은 중복 가능
 * @author yoondongung
 *
 */
public class Z11_ArrayList {
	public static void main(String[] args) {
		// ArrayList : List를 구현한 클래스 
		// 내부적으로 배열로 저장
		
		ArrayList<Object> al = new ArrayList<Object>();	// 생성자의 초기값으로 크기를 지정 할 수 있음
		al.add("안녕");	// 값을 추가
		al.add(3);
		al.add(3.14);
		
		System.out.println("arrayList 0번째 인덱스의 값 : " + al.get(0));	// 배열의 인덱스
		System.out.println("원소의 개수는 :" + al.size());	// 원소의 개수
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println();
		
		for(Object o : al) {	// 향상된 for문 사용
			System.out.print(o + ",");
		}
		
		/**
		 * 같은 타입의 데이터만 넣을 경우 - 제너릭스 표현법 jdk 1.5에서 추가됨
		 */
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("바나나");
		al2.add("강명준");
		al2.add("정진표");
		al2.add("윤동웅");
		al2.add("박소영");
		al2.add("딸기");
		
		System.out.println("------------");
		
		// 44, 45번은 같은 내용이다!
		System.out.println(al2);// 참조변수가 문자열 처리 될 경우, toString() 삽입해준다.
		System.out.println(al2.toString());
		
		// 인덱스, 값으로 remove가 가능하다!!!
		al2.remove(0);
		al2.remove("강명준");
//		al2.clear();	// arrayList 모든 값 삭제!

		for(String o : al2) {	// 향상된 for문 사용
			System.out.print(o + ",");
		}
		
		System.out.println();
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("바나나");
		al3.add("딸기");
		
		al2.removeAll(al3);
		System.out.println(al2);
		
		Collections.sort(al2);// 오름차순 정렬, 원본 데이터의 순서가 변경된다
		System.out.println(al2);
		
		Collections.sort(al2, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.charAt(1) - o2.charAt(1);
			}
		});
		System.out.println("기준변경:" + al2);
		
		
	}	// end of main
}	// end of class
