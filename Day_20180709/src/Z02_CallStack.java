
public class Z02_CallStack {

	public static void main(String[] args) {	// static���� non static�� �θ�������.
	/*	
  		Z02_CallStack x = new Z02_CallStack();
		x.a();
 	*/
		System.out.println("main ����");
		a();
		System.out.println("main ����");
	}	// end of main
	
	public static void a() {	// static�� ���̸� main���� ��ü �������� ����� �� �ִ�.
								// static�� �ѹ� �޸𸮿� �ö󰡸� ���α׷��� ����ɶ����� �޸𸮸� ����
								// �ǵ��� ���� ���� �ʴ� ���� ����.
		System.out.println("a ����");
		b();
		System.out.println("a ��");
	}
	
	public static void b()	{
		System.out.println("b ����");
		Exception x = new Exception();	// �ͼ��� ��ü ����
		try {
			throw x; // ���ܹ߻�
		}catch (Exception e) {
			System.out.println("���ܸ� ó����");
		}
		System.out.println("b ��");
	}
	
}	// end of class


/**
	callstack : ȣ�� ����, ��������, error message ����
		
		b()	Line ���� 
		a() 
		main
	

	heap : ��ü ������ �ڿ�, ��������

	method : static ����
*/