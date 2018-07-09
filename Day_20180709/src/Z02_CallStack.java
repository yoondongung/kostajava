public class Z02_CallStack {

	public static void main(String[] args) {	// static에서 non static을 부를수없다.
	/*	
  		Z02_CallStack x = new Z02_CallStack();
		x.a();
 	*/
		System.out.println("main 시작");
		a();
		System.out.println("main 종료");
	}	// end of main
	
	public static void a() {	// static을 붙이면 main에서 객체 생성없이 사용할 수 있다.
								// static은 한번 메모리에 올라가면 프로그램이 종료될때까지 메모리를 점유
								// 되도록 많이 쓰지 않는 것이 좋다.
		System.out.println("a 시작");
/*		
  		System.out.println("정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
*/
		try {
			b();
		} catch (MyException e) {
			System.out.println(e.getMessage());
			System.out.println("이름 : " + e.name);
			System.out.println(e.age + "살");
		}
		System.out.println("a 끝");
	}
	
	public static void b()	throws ArithmeticException, MyException { // , 여러개 나열 가능
		System.out.println("b 시작");
		MyException x = new MyException("내가 만든 예외임.", 26, "홍길동");	// 익셉션 객체 생성
		throw x;
		/*
		try {
			throw x; // 예외발생
		}catch (Exception e) {
			System.out.println("예외를 처리함");
		}
		*/
		// System.out.println("b 끝");
	}
	
}	// end of class

class MyException extends Exception{	// 나만의 예외 클래스 만들기
	int age;
	String name;
	MyException(String msg, int age, String name) {	// 생성자
		super(msg);
		this.age = age;
		this.name = name;
	}
}

/**
	callstack : 호출 정보, 지역변수, error message 정보
		
		b()	Line 정보 
		a() 
		main
	

	heap : 객체 생성시 자원, 전역변수

	method : static 변수
*/