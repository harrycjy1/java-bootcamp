package sec01_exam_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		//�ν��Ͻ� 3�� ����
		Student s1 = new Student(1,"�ϱ��");
		Student s2 = new Student(1,"������");
		Student s3 = new Student(3,"������");
		
		//Comparator�������̽��� ������ ��ü ����
		StudentComparator sc = new StudentComparator();
		
		//Objects�� compare�����޼���� ���� ��ü 2���� ���ڸ� �����ؾ��Ѵ�.
		int result = Objects.compare(s1, s2, sc);
		System.out.println(result);
		
		if(result ==1) 
			System.out.println("s1�ν��Ͻ��� s2�ν��Ͻ����� �ڿ� �ִ�.");
		
		//�͸��� ��ü
		/*int result = Objects.compare(s1, s2, new Comparator<Student>() {
			@Override
			public int compare(Student a, Student b) {
				return Integer.compare(a.sno, b.sno);
			}
			
		});
		System.out.println(result);*/
		
	}
	
		//��ø ���� Ŭ����
		static class Student{
			int sno;
			String name;
			
			public Student(int sno, String name) {
				this.sno = sno;
				this.name=name;
			}
		}
	
		static class StudentComparator implements Comparator<Student>{
			//���� ��
			@Override
			public int compare(Student a, Student b) {
				if(a.sno < b.sno) return -1;
				else if(a.sno==b.sno) return 0;
				else return 1;
				//return Integer.compare(a.sno,b.sno);
			}
			
			/*
			@Override
			public int compare(Student a, Student b) {
				//return a.name.compareTo(b.name)
				if((a.name.compareTo(b.name))<0)
					return -1;
				else if((a.name.compareTo(b.name))==0)
					return 0;
				else
					return 1;
			}*/
			
		}
		

}
