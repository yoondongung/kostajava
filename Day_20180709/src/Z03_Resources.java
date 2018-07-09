import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Z03_Resources {
	public static void main(String[] args) {
//	try 블럭 () 안에 반환할 자원을 선언한다.		여러개의 경우 ; 으로 구분한다.	최신버전에 추가된 편리한 기능
		try(	FileInputStream fis = new FileInputStream("파일의 경로");
				FileOutputStream fos = new FileOutputStream("파일의 경로")) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
/*	기존의 방식!!!!
  	FileInputStream fis = null; 
		try {
			fis = new FileInputStream("파일의 경로");
//			fis. 정상적인 경우
		} catch (FileNotFoundException e) {
//			fis. 비정상적인 경우
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
*/
		
		
	}
}
