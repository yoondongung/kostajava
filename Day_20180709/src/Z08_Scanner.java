import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * java���� ����� �Է¹ޱ�
 * 	1. BufferReader
 *  2. Scanner
 *  3. JOptionPane
 * @author yoondongung
 *
 */
public class Z08_Scanner {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:/Users/qwe76/git/KostaJava/Day_20180709/src/test3.txt"); 
			Scanner scan = new Scanner(fis)){
			// �������� ����� ���! ������ �߻��� �� �ִ�!!
			System.out.println(scan.nextInt());
			scan.nextLine();	// enter �Һ�!
			System.out.println(scan.nextLine());
			System.out.println(scan.nextInt());
/*			
  			System.out.println(scan.nextInt()); // ����
			System.out.println(scan.nextFloat()); // �Ǽ�
			System.out.println(scan.nextBoolean()); // ����
			System.out.println(scan.next()); // ���ڿ�
*/
/**			
			whiteSpace : ����, �ٹٲ�, ��
			�⺻�� Ÿ���� ��ȯ�ϴ� �޼��� ����, ������ ������ whiteSpace�� �����ϰ� �����͸� ������
			nextLine() : ���� �Է� �������� �����͸� �������� ���͸� �Һ���!
*/			
		} catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		
		
/*  		
  		Scanner scan = new Scanner(System.in);
  		while(true) {
			try{
				System.out.println("���ڸ� �Է��ϼ���!");
				int num = scan.nextInt();
				System.out.println(num);
				break;
			} catch(Exception e) {
				scan.nextLine(); // ���� �Һ� , buffer�� �ܷ��Ȱ� �Һ�!
			}
  		}*/
		
	}	// end of main
}	// end of class
