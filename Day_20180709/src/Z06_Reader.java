import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Reader : 문자 기반 입력 스트림의 추상클래스
 * @author yoondongung
 *
 */
public class Z06_Reader {
	public static void main(String[] args) {
		try(Reader r = new FileReader("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test.txt")){
			// 가장 많이 사용하는 방법	
			char data[] = new char[5];	// 배열의 크기가 너무 크면 메모리 낭비가 심함.		10
										// Io에 접근 횟수를 줄여서, 속도를 높이는 방법	1024
			int num; // 읽은 개수
			while((num = r.read(data)) != -1) {
//				System.out.println(num + "," + Arrays.toString(data));
				String s = new String(data, 0, num);
				System.out.println(s);
			}
			
/*			int data = r.read();	// 하나의 문자를 읽기
			System.out.println((char)data);*/
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
	}	// end of main
}	//end of class
