import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 바이트 기반 입력 스트림의 추상 클래스
 * 이미지, 사진, 동영상 적합
 * @author yoondongung
 *
 */
public class Z04_InputStream {

	public static void main(String[] args) {
		// 자동으로 자원을 반납해주는 방법!! 
		// close()로 자원을 반납할수 있는 것들만 try()안에 넣을 수 있다.
		try(InputStream is = new FileInputStream("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test.txt")) {
			
			byte[] data = new byte[5];	// 한번에 읽을 배열 생성
			int num; // 읽을 개수
			while( (num = is.read(data)) != -1) {
				String s = new String(data, 0, num);	// 배열, 시작index, 개수
				System.out.print(s);
			}
			
/*			while(true) {
				byte[] data = new byte[5];	// 한번에 읽을 배열 생성
				int num = is.read(data);
				if(num == -1) {
					break;
				}
				System.out.println("읽은 개수 :" + num);
				System.out.println(Arrays.toString(data));	// 배열의 내용을 간단히 출력하기
			}
*/
			
			
/*			int data;
			while((data = is.read()) != -1) {
				System.out.print((char)data);
			}*/
			
/*			위 주석으로 변경 가능!!
 * 			while(true) {
				int data = is.read();	// 1byte 를 읽어오기
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
*/
			
/*			try() 안에 한줄로 변경!!
 * 			if(is == null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}	// end of main
}	// end of class
