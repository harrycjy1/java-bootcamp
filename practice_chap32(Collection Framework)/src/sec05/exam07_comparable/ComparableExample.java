package sec05.exam07_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		//Person�̶�� ��������� Ŭ������ �����ϴ� treeSet�� ����
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("������",9));
		treeSet.add(new Person("ȫ�浿",35));
		treeSet.add(new Person("�տ���",19));
		treeSet.add(new Person("����",19));
		treeSet.add(new Person("�ڿ���",25));
		treeSet.add(new Person("������",21));
		treeSet.add(new Person("�չμ�",29));
		treeSet.add(new Person("������",51));
		treeSet.add(new Person("�ڱ���",61));
		
		
		//�������� �����̵Ȱ��� �Ʒ��� ���� Ȯ���� �� �ִ�.
		System.out.println("�� ��ü�� : "+treeSet.size());
		
		/*for(Person person: treeSet) {
			String str = person.getName();
			int age = person.getAge();
			System.out.println("�̸� : "+str+", ���� : "+age);
		}*/
		
		Iterator<Person> iter = treeSet.iterator();
		while(iter.hasNext()) {
			Person person = iter.next();
			int age=person.getAge();
			String str = person.getName();
			
			System.out.println("�̸� : "+str+", ���� : "+age);
		}

	}

}
