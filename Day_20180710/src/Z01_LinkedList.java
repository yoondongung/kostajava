import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * List �迭 : ���� ����, �ߺ�����
 * 	LinkedList�� ArrayList�� ������� ����/���� ����� ������ Ŭ����
 * 			���߿������Ḯ��Ʈ�� �����Ǿ��ִ�.
 * 			Queue �������̽��� �����ߴ�.
 * @author yoondongung
 *
 */
public class Z01_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("����");	// ����Ʈ�� ���
		ll.add("ȣ����");
		ll.add("����");
		ll.add("�⸰");
		ll.add("�䳢");		
		System.out.println(ll);
		
		ll.push("������");	// ť�� ����
		System.out.println(ll);
		
		ll.add(2, "�߿���");	// ������� ����
		System.out.println(ll);
		
		ll.remove(2);	// ������� ����
		System.out.println(ll);
		
		System.out.println("���� for��");
		for(String a : ll) {
			System.out.print(a);
		}
		
		System.out.println();
		System.out.println("�Ϲ� for��");
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i));
		}
		
		//iterator	: �ܹ��� ��ȸ�� �� �� �ִ� �������̽�
		Iterator<String> iter = ll.iterator();	// ��ȸ�� �߻���
		while(iter.hasNext()) {	// ���� ���Ұ� �ִ���?
			String s = iter.next();
			System.out.println(s+",");
		}
		System.out.println(": ���ͷ����� ���");
		
		
		//Iterator : ����� ��ȸ�� �� �� �ִ� �������̽�
		ListIterator<String> listiter = ll.listIterator();
		while(listiter.hasNext()) {
			String s = listiter.next();
			System.out.print(s);
		}
		System.out.println(": ����Ʈ ���ͷ����� ���");
		
		
		while(listiter.hasPrevious()) {
			String s = listiter.previous();
			System.out.print(s);
		}
		System.out.println(": ����Ʈ ���ͷ����� ���");
		
	}	// end of main
}	// end of class
