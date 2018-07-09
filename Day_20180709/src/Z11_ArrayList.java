import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collection Framework
 * 	1. List	: ���� ����, �������� �ߺ��� ����
 * 	2. Set 	: ���� ����, �������� �ߺ��� �Ұ���
 * 	3. Map	: Ű - ���� ������ �̷����, Ű�� ������ �������� ��´�, Ű�� �ߺ� �Ұ�, ���� �ߺ� ����
 * @author yoondongung
 *
 */
public class Z11_ArrayList {
	public static void main(String[] args) {
		// ArrayList : List�� ������ Ŭ���� 
		// ���������� �迭�� ����
		
		ArrayList<Object> al = new ArrayList<Object>();	// �������� �ʱⰪ���� ũ�⸦ ���� �� �� ����
		al.add("�ȳ�");	// ���� �߰�
		al.add(3);
		al.add(3.14);
		
		System.out.println("arrayList 0��° �ε����� �� : " + al.get(0));	// �迭�� �ε���
		System.out.println("������ ������ :" + al.size());	// ������ ����
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println();
		
		for(Object o : al) {	// ���� for�� ���
			System.out.print(o + ",");
		}
		
		/**
		 * ���� Ÿ���� �����͸� ���� ��� - ���ʸ��� ǥ���� jdk 1.5���� �߰���
		 */
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("�ٳ���");
		al2.add("������");
		al2.add("����ǥ");
		al2.add("������");
		al2.add("�ڼҿ�");
		al2.add("����");
		
		System.out.println("------------");
		
		// 44, 45���� ���� �����̴�!
		System.out.println(al2);// ���������� ���ڿ� ó�� �� ���, toString() �������ش�.
		System.out.println(al2.toString());
		
		// �ε���, ������ remove�� �����ϴ�!!!
		al2.remove(0);
		al2.remove("������");
//		al2.clear();	// arrayList ��� �� ����!

		for(String o : al2) {	// ���� for�� ���
			System.out.print(o + ",");
		}
		
		System.out.println();
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("�ٳ���");
		al3.add("����");
		
		al2.removeAll(al3);
		System.out.println(al2);
		
		Collections.sort(al2);// �������� ����, ���� �������� ������ ����ȴ�
		System.out.println(al2);
		
		Collections.sort(al2, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.charAt(1) - o2.charAt(1);
			}
		});
		System.out.println("���غ���:" + al2);
		
		
	}	// end of main
}	// end of class
