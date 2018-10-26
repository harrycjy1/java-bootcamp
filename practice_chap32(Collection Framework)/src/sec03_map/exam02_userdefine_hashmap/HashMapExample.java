package sec03_map.exam02_userdefine_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Ű��  Student(����� ���� ��ü), ������ Integer�� ���
		Map<Student, Integer> map = new HashMap<>();
		/*�Ʒ� �ΰ��� Map.entry�� ���ü�� �ȴ�. Ű�λ��� Student��ü�� sno��, name�� ���� ����.
		 * �Ͽ� �������� ����� ������ ��ü �ȴ�.
		 * ������ hashcode()�� equals�� ������ ���� �ʾҴٸ�,
		 * �ٸ���ü�� �ν��Ͽ� ����ȴ�.
		 */
		map.put(new Student(1, "ȫ�浿"), 90);
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(2, "������"), 100);
		map.put(new Student(3, "���ּ�"), 58);
		
		System.out.println("�� Entry �� : "+ map.size());
		System.out.println("ȫ�浿  : "+ map.get(new Student(1, "ȫ�浿")));
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			Student key = iter.next();
			System.out.println("Student(sno) : "+key.getSno()+", "+"Student(name) : "+key.getName()+", "+
			"Integer : "+map.get(new Student(key.getSno(), key.getName())));
		}
		
		
		//Map.Entry�� ���� �ڵ��غ���(���� ����)
		

	}

}
