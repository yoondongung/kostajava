import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 바이트 기반 출력스트림 OutputStream
 * @author yoondongung
 *
 */
public class Z05_OutputStream {
	public static void main(String[] args) {
		try(OutputStream os = new FileOutputStream("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test2.txt",true)){ // 기존꺼 지우지 않는다.
			
			byte[] data = new String("hello").getBytes();	// byte[] data = "hello".getBytes();
//			os.write(data);	//hello
			os.write(data, 1, 3);	//ell
			
			
//			os.write('q');	// 1바이트 전송
//			os.flush();		// 버퍼에 잔류하는 데이터를 보내겠다.	cpu --- buffer --- 입력(키보드, 파일 등등...) 많이하면 속도가 느려짐!!!
//			os.close();		// close 메서드 안에 flush 메서드가 호출
			
			System.out.println("파일 저장 완료!");
		} catch (IOException e) {
			System.out.println("파일 저장시 에러");
		} 
			
		
	}	// end of main
}	// end of class
