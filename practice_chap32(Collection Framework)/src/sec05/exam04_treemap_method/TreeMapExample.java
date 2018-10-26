package sec05.exam04_treemap_method;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		//Ű��  Integer ������ String
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		//map��ü 5���� �������� ����������, treemap�� ����Ʈ���� ���ؼ�
		//�ڵ������� �ȴ�.
		scores.put(87, "ȫ�浿");
		scores.put(98, "������");
		scores.put(75, "�迬��");
		scores.put(95, "�տ���");
		scores.put(80, "����");
		
		Map.Entry<Integer, String> entry = null;
		
		//���峷������
		entry = scores.firstEntry();
		System.out.println("���� ���� ���� : "+ entry.getKey()+ " - "+entry.getValue());
		System.out.println();
		
		//���� ���� ����
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : "+entry.getKey()+" - "+entry.getValue());
		System.out.println();
		
		//����Ʈ�� �� �־��� ��ü ��, 95������ ���� Entry�� �����Ѵ�. (95���� �������� �ʴ´�.)
		entry = scores.lowerEntry(95);
		System.out.println("95�� �ٷ� �Ʒ����� (������) : "+entry.getKey() +" - "+ entry.getValue());
		System.out.println();
		
		entry=scores.higherEntry(95);
		System.out.println("95�� �ٷ� �� ����(������) :"+entry.getKey() +" - "+ entry.getValue());
		System.out.println();
		
		entry = scores.floorEntry(95);
		System.out.println("95�� �ٷ� �Ʒ����� (����) : "+entry.getKey() +" - "+ entry.getValue());
		System.out.println();
		
		entry=scores.ceilingEntry(95);
		System.out.println("95�� �ٷ� �� ����(����) :"+entry.getKey() +" - "+ entry.getValue());
		System.out.println();
		
		/*while(!scores.isEmpty()) {
			//���� treeset�� �����ϰ� pollFirstEntry()�� treemap����
			//���� ���� ���� entry�� �������� map���� �����Ѵ�. �ø�����
			entry = scores.pollFirstEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("Ű : "+value+" - "+"�� : "+str+"(�����ִ� ��ü�� : "+ scores.size()+")");
		}*/
		
		/*while(!scores.isEmpty()) {
			//���� treeset�� �����ϰ� pollLastEntry()�� treemap����
			//���� ���� ���� entry�� �������� map���� �����Ѵ�. ��������
			entry = scores.pollLastEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("Ű : "+value+" - "+"�� : "+str+"(�����ִ� ��ü�� : "+ scores.size()+")");
		}*/
		
		//treeMap������ keySet�� ���, �ݺ��ڸ� ���� �� ��ü ��ü�� ����غ�
		//���� ���̰� �ִ°��� ��ü ���Ű� �Ͼ�� ����
		
		/*Set<Integer> keySet = scores.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);
			//��������� ȣ�������ν�  treemap���� ���Ÿ� �� ���� �ִ�.
			//iterator.remove();
			System.out.println("Ű : "+value+" - "+"�� : "+str+"(�����ִ� ��ü�� : "+ scores.size()+")");
		}
		*/
		
		Set<Map.Entry<Integer, String>> entrySet = scores.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> mapentry = iterator.next();
			int value = mapentry.getKey();
			String str = mapentry.getValue();
			//iterator.remove();
			System.out.println("Ű : "+value+" - "+"�� : "+str+"(�����ִ� ��ü�� : "+ scores.size()+")");
		}
		
		
		
		

	}

}
