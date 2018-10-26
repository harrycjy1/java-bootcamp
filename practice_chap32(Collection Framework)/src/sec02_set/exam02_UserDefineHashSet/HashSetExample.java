package sec02_set.exam02_UserDefineHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		//new�� ����߱� ������ ���δٸ� ��ü������, �� �ʵ�� �ؽ��ڵ尡 ������
		//���ü�� �ν��Ͽ�, ���� ��ü�̹Ƿ� Set�� �ߺ������� ���� �ʴ´�.
		set.add(new Member("ȫ�浿",30));
		set.add(new Member("ȫ�浿",30));
		set.add(new Member("ȫ�浿",15));
		set.add(new Member("ȫ�浿",17));
		int size = set.size();
		
		System.out.println("�� ��ü�� : "+size);
		//�ݺ���
		Iterator<Member> it = set.iterator();
		while(it.hasNext()) {
			Member obj = it.next();
			System.out.println(obj.getName()+" : " + obj.getAge());
		}

	}

}
