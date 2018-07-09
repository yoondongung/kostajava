import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Reader : ���� ��� �Է� ��Ʈ���� �߻�Ŭ����
 * @author yoondongung
 *
 */
public class Z06_Reader {
	public static void main(String[] args) {
		try(Reader r = new FileReader("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test.txt")){
			// ���� ���� ����ϴ� ���	
			char data[] = new char[5];	// �迭�� ũ�Ⱑ �ʹ� ũ�� �޸� ���� ����.		10
										// Io�� ���� Ƚ���� �ٿ���, �ӵ��� ���̴� ���	1024
			int num; // ���� ����
			while((num = r.read(data)) != -1) {
//				System.out.println(num + "," + Arrays.toString(data));
				String s = new String(data, 0, num);
				System.out.println(s);
			}
			
/*			int data = r.read();	// �ϳ��� ���ڸ� �б�
			System.out.println((char)data);*/
		} catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		
	}	// end of main
}	//end of class
