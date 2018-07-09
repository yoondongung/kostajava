import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * File	: 폴더, 파일의 정보를 지닌 객체
 * @author yoondongung
 *
 */
public class Z09_File {
	public static void main(String[] args) {
		File dir = new File("C:/Dev/temp/a/b");
		File dir1 = new File("C:/Dev/temp/a");
		File file = new File("C:/Dev/temp/a/b/c.txt");
		
		System.out.println(dir.exists());
		if(!dir.exists()) {
			dir.mkdir();	// 경로중 마지막 폴더가 없으면 생성
//			dir.mkdirs();	// 경로중에 부족한 폴더 모두를 생성
		}
		
		System.out.println(dir1.exists());
		
		System.out.println(file.exists());
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("파일 생성중에 오류발생!");
			}
		}
		File[] fList = dir.listFiles();
		for(File f : fList) {
			System.out.println("폴더냐:"+f.isDirectory());
			System.out.println("파일명:"+f.getName());
			System.out.println("파일크기:"+f.length());
		}
		
		System.out.println(Arrays.toString(dir.listFiles()));	// 폴더안에 포함된 모든 폴더, 파일 목록 가져오기
		
	}	// end of main
}	// end of class
