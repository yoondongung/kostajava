import java.util.LinkedList;

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
		
	}	// end of main
}	// end of class
