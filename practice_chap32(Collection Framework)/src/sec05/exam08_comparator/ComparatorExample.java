package sec05.exam08_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		
		TreeSet<Fruit> treeSet = new TreeSet<>(new AscendingComparator());
		//treeSet�� Fruit��ü�� �߰��Ѵ�.
		//���⼭ FruitŬ������ Comparable<>�������̽��� �������� �ʰų�, Comparator<>��
		//�������� ������ ClassCastException�� �߻��Ѵ�.
		
		try {
		treeSet.add(new Fruit("����",6500));
		treeSet.add(new Fruit("����",4200));
		treeSet.add(new Fruit("������",3500));
		treeSet.add(new Fruit("�ٳ���",3400));
		treeSet.add(new Fruit("�ڵ�",2000));
		treeSet.add(new Fruit("ȣ��",1001));
		}
		
		catch(Exception e){
			System.out.println("���� ������ ����");
		}
		System.out.println("�� ��ü �� : "+treeSet.size());
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.getName()+" : "+fruit.getPrice());
		}
		

	}

}
