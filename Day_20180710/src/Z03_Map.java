import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 *  {키 : 값, 키 : 값} 쌍으로 이루어짐
 *					: 키를 기준으로 원소를 구분한다.
 *					: 키는 중복이 불가, 값은 중복이 가능, 순서가 x
 *					: Map 에서는 중복 데이터는 덮어쓰기 한다. hashSet은 저장 안함!
 * @author "YoonDongUng"
 *
 */
public class Z03_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("사과", 1000);
		hm.put("배", 2000);
		hm.put("수박", 15000);	
		System.out.println(hm);
		System.out.println("크기 : " + hm.size());
		System.out.println("포함여부 : " + hm.containsKey("배"));
		System.out.println("값 읽기 : " + hm.get("수박"));
		
//		HashMap 내부적으로 Hashing 기법으로 저장하기 때문에, 저장속도, 검색속도가 빠르다
		Set<String> s = hm.keySet();
		System.out.println(s);
		
		Iterator<String> iter = s.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + "가격 : " + hm.get(key));
		}
		
		Set<Entry<String, Integer>> se = hm.entrySet();	// keyset과 비교해서 보기!!
												// 키, 값 목록을 저장한 Entry의 set의 자료구조로 리턴
//		System.out.println(se);
		Iterator<Entry<String, Integer>> iter2 = se.iterator();
		while(iter2.hasNext()){
			Entry<String, Integer> entry = iter2.next();
			System.out.println(entry);
			System.out.println(entry.getKey() + entry.getValue());
		}
	}	// end of main
}	// end of class
