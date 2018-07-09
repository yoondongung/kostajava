
public class Z01_ExceptionHandling {
	
	public static void main(String[] args) {
		try {
			int a = 3/0;	
		} catch (ArithmeticException e) {

		}
		
		System.out.println("프로그램 종료");
	}	// end of main
}	// end of class
