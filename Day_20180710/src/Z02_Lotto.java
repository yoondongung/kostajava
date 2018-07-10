import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

/**
 * ����Ʈ �迭 �ζ� ��ȣ 1 - 45 ���� 6��
 * @author yoondongung
 *
 */
public class Z02_Lotto {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);	// �⺻�� => ��ü
		al.add(new Integer(3));
		
		ArrayList<Integer> lotto = new ArrayList<>();
		Random ran = new Random();
		
		while(lotto.size() < 6) {
			int num = ran.nextInt(45)+1;	
			if(!lotto.contains(num)) {	// lotto�� num �ܾ ������ �ȵǾ� �ִ� ��츸 �߰����ֱ�
				lotto.add(num);	// arraylist�� �߰�				
			}
		}
		
		System.out.println(lotto);
		
		Collections.sort(lotto);	// ����
		System.out.println(lotto);
		
		
/*
		�⺻�� Ÿ�� 8������ ¦�� Ŭ���� : wrapper class
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
		TreeSet<Integer> ts = new TreeSet<>();	// �ڵ����� ��������
		while(ts.size() < 6) {
			int num = ran.nextInt(45)+1;
			ts.add(num);	// set �߰�(�����) �������� ���Կ��θ� �Ǵ��ؼ� �����ϴ� ��� �������� ����
		}
		
		System.out.println(ts);
		
	}	// end of main
}	// end of class
