import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

/**
 * 리스트 계열 로또 번호 1 - 45 숫자 6개
 * @author yoondongung
 *
 */
public class Z02_Lotto {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);	// 기본형 => 객체
		al.add(new Integer(3));
		
		ArrayList<Integer> lotto = new ArrayList<>();
		Random ran = new Random();
		
		while(lotto.size() < 6) {
			int num = ran.nextInt(45)+1;	
			if(!lotto.contains(num)) {	// lotto에 num 단어가 포함이 안되어 있는 경우만 추가해주기
				lotto.add(num);	// arraylist에 추가				
			}
		}
		
		System.out.println(lotto);
		
		Collections.sort(lotto);	// 정렬
		System.out.println(lotto);
		
		
/*
		기본형 타입 8가지의 짝궁 클래스 : wrapper class
		int -> Integer
		char -> Character
		byte -> Byte
		short -> Short
		long -> Long
		float -> Float
		double -> Double
		boolean -> Boolean
*/
		
		System.out.println("set!!!!!!");
		TreeSet<Integer> ts = new TreeSet<>();	// 자동으로 정렬해줌
		while(ts.size() < 6) {
			int num = ran.nextInt(45)+1;
			ts.add(num);	// set 추가(저장시) 데이터의 포함여부를 판단해서 존재하는 경우 저장하지 않음
		}
		
		System.out.println(ts);
		
	}	// end of main
}	// end of class
