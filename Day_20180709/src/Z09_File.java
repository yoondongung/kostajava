import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * File	: ����, ������ ������ ���� ��ü
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
			dir.mkdir();	// ����� ������ ������ ������ ����
//			dir.mkdirs();	// ����߿� ������ ���� ��θ� ����
		}
		
		System.out.println(dir1.exists());
		
		System.out.println(file.exists());
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("���� �����߿� �����߻�!");
			}
		}
		File[] fList = dir.listFiles();
		for(File f : fList) {
			System.out.println("������:"+f.isDirectory());
			System.out.println("���ϸ�:"+f.getName());
			System.out.println("����ũ��:"+f.length());
		}
		
		System.out.println(Arrays.toString(dir.listFiles()));	// �����ȿ� ���Ե� ��� ����, ���� ��� ��������
		
	}	// end of main
}	// end of class
