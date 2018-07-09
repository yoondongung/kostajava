
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
		b();
		System.out.println("a 끝");
	}
	
	public static void b()	{
		System.out.println("b 시작");
		Exception x = new Exception();	// 익셉션 객체 생성
		try {
			throw x; // 예외발생
		}catch (Exception e) {
			System.out.println("예외를 처리함");
		}
		System.out.println("b 끝");
	}
	
}	// end of class


/**
	callstack : 호출 정보, 지역변수, error message 정보
		
		b()	Line 정보 
		a() 
		main
	

	heap : 객체 생성시 자원, 전역변수

	method : static 변수
*/