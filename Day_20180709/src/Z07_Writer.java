import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Writer : ���� ��� ��½�Ʈ��
 * @author yoondongung
 *
 */
public class Z07_Writer {
	public static void main(String[] args) {
		try(Writer wr = new FileWriter("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test2.txt",true)) {
			wr.write("�ȳ��ϼ���");	// �ȳ��ϼ���
			wr.write("�ȳ��ϼ���", 1, 3);	// ���ϼ�				
/*			
  			char[] data = "���ѹα�".toCharArray();
			wr.write(data);
			System.out.println("���� ���� ����");
*/
			
//				wr.write('��');
//				wr.flush();		// close �޼��� ���� flush �޼��带 ȣ��
//				wr.close();		// auto close (�ڵ����� ȣ���)
				
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}

	}	// end of main
}	// end of class
