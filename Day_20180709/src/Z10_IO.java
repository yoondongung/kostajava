import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� ��Ʈ��
 * �� ��/��� ��Ʈ�� + ������Ʈ��1 + ������Ʈ��2
 * 
 * 	- ��� ����
 * 	1. ����Ʈ/���� ����� �ٲٱ� ���ؼ�
 *  2. �����Ǵ� �޼��带 ����ϱ� ���ؼ�
 *  3. ������ �����ֱ� ���ؼ�
 *  
 * @author yoondongung
 *
 */
public class Z10_IO {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test.txt")) {
			// ����Ʈ ���(fis) => ���ڱ�� (isr)
			InputStreamReader isr = new InputStreamReader(fis);
			
			// fis�� ������ �����ϱ����� ���۸� ����� ������Ʈ�� �̿�
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			
		} catch (IOException e) {

		}
		
	} // end of main
} // end of class
