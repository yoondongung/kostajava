import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * ����Ʈ ��� ��½�Ʈ�� OutputStream
 * @author yoondongung
 *
 */
public class Z05_OutputStream {
	public static void main(String[] args) {
		try(OutputStream os = new FileOutputStream("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test2.txt",true)){ // ������ ������ �ʴ´�.
			
			byte[] data = new String("hello").getBytes();	// byte[] data = "hello".getBytes();
//			os.write(data);	//hello
			os.write(data, 1, 3);	//ell
			
			
//			os.write('q');	// 1����Ʈ ����
//			os.flush();		// ���ۿ� �ܷ��ϴ� �����͸� �����ڴ�.	cpu --- buffer --- �Է�(Ű����, ���� ���...) �����ϸ� �ӵ��� ������!!!
//			os.close();		// close �޼��� �ȿ� flush �޼��尡 ȣ��
			
			System.out.println("���� ���� �Ϸ�!");
		} catch (IOException e) {
			System.out.println("���� ����� ����");
		} 
			
		
	}	// end of main
}	// end of class
