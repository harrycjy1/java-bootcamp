package sec_verify11;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1,"������"));
		set.add(new Student(2,"�迬��"));
		set.add(new Student(1,"�տ���"));
		set.add(new Student(2,"�迬��"));
		set.add(new Student(5,"�赿��"));
		set.add(new Student(4,"Ȳ����"));
		set.add(new Student(1,"������"));
		set.add(new Student(3,"�ڱٿ�"));
		
		System.out.println("�� ��ü�� :"+set.size());
		for(Student stu : set) {
			System.out.println("�й� : "+stu.getStudentNum()+", �̸� : "+stu.getName());
		}
	}

}
