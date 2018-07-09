import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 보조 스트림
 * 주 입/출력 스트림 + 보조스트림1 + 보조스트림2
 * 
 * 	- 사용 이유
 * 	1. 바이트/문자 기반을 바꾸기 위해서
 *  2. 제공되는 메서드를 사용하기 위해서
 *  3. 성능을 높여주기 위해서
 *  
 * @author yoondongung
 *
 */
public class Z10_IO {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test.txt")) {
			// 바이트 기반(fis) => 문자기반 (isr)
			InputStreamReader isr = new InputStreamReader(fis);
			
			// fis의 성능을 개선하기위해 버퍼를 사용한 보조스트림 이용
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			
		} catch (IOException e) {

		}
		
	} // end of main
} // end of class
