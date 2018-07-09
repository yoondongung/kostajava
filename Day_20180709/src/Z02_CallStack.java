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
/*		
  		System.out.println("������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
*/
		try {
			b();
		} catch (MyException e) {
			System.out.println(e.getMessage());
			System.out.println("�̸� : " + e.name);
			System.out.println(e.age + "��");
		}
		System.out.println("a ��");
	}
	
	public static void b()	throws ArithmeticException, MyException { // , ������ ���� ����
		System.out.println("b ����");
		MyException x = new MyException("���� ���� ������.", 26, "ȫ�浿");	// �ͼ��� ��ü ����
		throw x;
		/*
		try {
			throw x; // ���ܹ߻�
		}catch (Exception e) {
			System.out.println("���ܸ� ó����");
		}
		*/
		// System.out.println("b ��");
	}
	
}	// end of class

class MyException extends Exception{	// ������ ���� Ŭ���� �����
	int age;
	String name;
	MyException(String msg, int age, String name) {	// ������
		super(msg);
		this.age = age;
		this.name = name;
	}
}

/**
	callstack : ȣ�� ����, ��������, error message ����
		
		b()	Line ���� 
		a() 
		main
	

	heap : ��ü ������ �ڿ�, ��������

	method : static ����
*/