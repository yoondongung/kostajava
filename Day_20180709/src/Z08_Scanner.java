import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * java에서 사용자 입력받기
 * 	1. BufferReader
 *  2. Scanner
 *  3. JOptionPane
 * @author yoondongung
 *
 */
public class Z08_Scanner {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test3.txt"); 
			Scanner scan = new Scanner(fis)){
			// 복합으로 사용할 경우! 문제가 발생할 수 있다!!
			System.out.println(scan.nextInt());
			scan.nextLine();	// enter 소비!
			System.out.println(scan.nextLine());
			System.out.println(scan.nextInt());
/*			
  			System.out.println(scan.nextInt()); // 정수
			System.out.println(scan.nextFloat()); // 실수
			System.out.println(scan.nextBoolean()); // 논리값
			System.out.println(scan.next()); // 문자열
*/
/**			
			whiteSpace : 공백, 줄바꿈, 탭
			기본형 타입을 반환하는 메서드 들은, 데이터 이전의 whiteSpace는 제거하고 데이터를 가져감
			nextLine() : 엔터 입력 전까지의 데이터를 가져오고 엔터를 소비함!
*/			
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
		
/*  		
  		Scanner scan = new Scanner(System.in);
  		while(true) {
			try{
				System.out.println("숫자를 입력하세요!");
				int num = scan.nextInt();
				System.out.println(num);
				break;
			} catch(Exception e) {
				scan.nextLine(); // 한줄 소비 , buffer에 잔류된것 소비!
			}
  		}*/
		
	}	// end of main
}	// end of class
