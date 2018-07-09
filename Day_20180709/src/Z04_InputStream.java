import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * ����Ʈ ��� �Է� ��Ʈ���� �߻� Ŭ����
 * �̹���, ����, ������ ����
 * @author yoondongung
 *
 */
public class Z04_InputStream {

	public static void main(String[] args) {
		// �ڵ����� �ڿ��� �ݳ����ִ� ���!! 
		// close()�� �ڿ��� �ݳ��Ҽ� �ִ� �͵鸸 try()�ȿ� ���� �� �ִ�.
		try(InputStream is = new FileInputStream("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test.txt")) {
			
			byte[] data = new byte[5];	// �ѹ��� ���� �迭 ����
			int num; // ���� ����
			while( (num = is.read(data)) != -1) {
				String s = new String(data, 0, num);	// �迭, ����index, ����
				System.out.print(s);
			}
			
/*			while(true) {
				byte[] data = new byte[5];	// �ѹ��� ���� �迭 ����
				int num = is.read(data);
				if(num == -1) {
					break;
				}
				System.out.println("���� ���� :" + num);
				System.out.println(Arrays.toString(data));	// �迭�� ������ ������ ����ϱ�
			}
*/
			
			
/*			int data;
			while((data = is.read()) != -1) {
				System.out.print((char)data);
			}*/
			
/*			�� �ּ����� ���� ����!!
 * 			while(true) {
				int data = is.read();	// 1byte �� �о����
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
*/
			
/*			try() �ȿ� ���ٷ� ����!!
 * 			if(is == null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
		} catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
	}	// end of main
}	// end of class
