import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Z03_Resources {
	public static void main(String[] args) {
//	try �� () �ȿ� ��ȯ�� �ڿ��� �����Ѵ�.		�������� ��� ; ���� �����Ѵ�.	�ֽŹ����� �߰��� ���� ���
		try(	FileInputStream fis = new FileInputStream("������ ���");
				FileOutputStream fos = new FileOutputStream("������ ���")) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
/*	������ ���!!!!
  	FileInputStream fis = null; 
		try {
			fis = new FileInputStream("������ ���");
//			fis. �������� ���
		} catch (FileNotFoundException e) {
//			fis. ���������� ���
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
