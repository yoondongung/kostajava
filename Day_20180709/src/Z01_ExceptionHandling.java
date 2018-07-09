/**
 * �����ּ� : Ŭ����, �޼���, ���� ����� �տ� �ۼ��ϴ� �ּ�
 * 	�ۼ���, �ۼ���, ���, �����
 * @author yoondongung
 * Exception Handling : ����ó��, ������ ���Ḧ ����, ���α׷� ������ ������ �����ϱ����� ���
 *
 */
public class Z01_ExceptionHandling {
	
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int a = 3/1;	// ArithmeticException
			System.out.println(3);
		} catch (ArithmeticException | NullPointerException e) {	// �������� exception �����ϴ� ���	
			System.out.println(4);
			System.out.println(e.getMessage());
			e.printStackTrace();	//���������� �ݽ��� ���� ���
		} finally {	// ���� �߻����ο� ������� �ݵ�� �����, return���� �־ �ݵ�� �����
			
		}
		
		
		System.out.println("���α׷� ����");
	}	// end of main
}	// end of class
