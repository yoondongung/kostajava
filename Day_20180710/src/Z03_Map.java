import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 *  {Ű : ��, Ű : ��} ������ �̷����
 *					: Ű�� �������� ���Ҹ� �����Ѵ�.
 *					: Ű�� �ߺ��� �Ұ�, ���� �ߺ��� ����, ������ x
 *					: Map ������ �ߺ� �����ʹ� ����� �Ѵ�. hashSet�� ���� ����!
 * @author "YoonDongUng"
 *
 */
public class Z03_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("���", 1000);
		hm.put("��", 2000);
		hm.put("����", 15000);	
		System.out.println(hm);
		System.out.println("ũ�� : " + hm.size());
		System.out.println("���Կ��� : " + hm.containsKey("��"));
		System.out.println("�� �б� : " + hm.get("����"));
		
//		HashMap ���������� Hashing ������� �����ϱ� ������, ����ӵ�, �˻��ӵ��� ������
		Set<String> s = hm.keySet();
		System.out.println(s);
		
		Iterator<String> iter = s.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + "���� : " + hm.get(key));
		}
		
		Set<Entry<String, Integer>> se = hm.entrySet();	// keyset�� ���ؼ� ����!!
												// Ű, �� ����� ������ Entry�� set�� �ڷᱸ���� ����
//		System.out.println(se);
		Iterator<Entry<String, Integer>> iter2 = se.iterator();
		while(iter2.hasNext()){
			Entry<String, Integer> entry = iter2.next();
			System.out.println(entry);
			System.out.println(entry.getKey() + entry.getValue());
		}
	}	// end of main
}	// end of class
