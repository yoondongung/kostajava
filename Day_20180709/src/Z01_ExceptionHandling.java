/**
 * 문서주석 : 클래스, 메서드, 변수 선언부 앞에 작성하는 주석
 * 	작성자, 작성일, 기능, 사용방법
 * @author yoondongung
 * Exception Handling : 예외처리, 비정상 종료를 막고, 프로그램 끝까지 진행을 유도하기위한 기법
 *
 */
public class Z01_ExceptionHandling {
	
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int a = 3/1;	// ArithmeticException
			System.out.println(3);
		} catch (ArithmeticException | NullPointerException e) {	// 여러개의 exception 설정하는 방법	
			System.out.println(4);
			System.out.println(e.getMessage());
			e.printStackTrace();	//에러시점의 콜스텍 정보 출력
		} finally {	// 예외 발생여부와 상관없이 반드시 실행됨, return문이 있어도 반드시 실행됨
			
		}
		
		
		System.out.println("프로그램 종료");
	}	// end of main
}	// end of class
