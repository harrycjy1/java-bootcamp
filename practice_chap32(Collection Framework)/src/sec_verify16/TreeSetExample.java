package sec_verify16;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Student> treeSet = new TreeSet<>();
		
		treeSet.add(new Student("������", 96));
		treeSet.add(new Student("���ּ�", 86));
		treeSet.add(new Student("�赿��", 68));
		treeSet.add(new Student("�̴�ȣ", 100));
		treeSet.add(new Student("��ȣ��", 59));
		treeSet.add(new Student("������", 77));
		
		for(Student stu : treeSet) {
			System.out.println("�л� �̸� : "+stu.getName()+", ���� : "+stu.getScore());
		}
		
		System.out.println();
		System.out.println("�ְ� ���� : "+treeSet.last().getScore()+", �л� �̸� : "+treeSet.last().getName());

	}

}
