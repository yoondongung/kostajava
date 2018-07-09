import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Writer : 문자 기반 출력스트림
 * @author yoondongung
 *
 */
public class Z07_Writer {
	public static void main(String[] args) {
		try(Writer wr = new FileWriter("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test2.txt",true)) {
			wr.write("안녕하세요");	// 안녕하세요
			wr.write("안녕하세요", 1, 3);	// 녕하세				
/*			
  			char[] data = "대한민국".toCharArray();
			wr.write(data);
			System.out.println("파일 쓰기 성공");
*/
			
//				wr.write('뷁');
//				wr.flush();		// close 메서드 내에 flush 메서드를 호출
//				wr.close();		// auto close (자동으로 호출됨)
				
		} catch (IOException e) {
			System.out.println("파일 쓰기 에러");
		}

	}	// end of main
}	// end of class
