package sec01_exam_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		//인스턴스 3개 생성
		Student s1 = new Student(1,"하기수");
		Student s2 = new Student(1,"도기좡");
		Student s3 = new Student(3,"이지수");
		
		//Comparator인터페이스를 구현한 객체 생성
		StudentComparator sc = new StudentComparator();
		
		//Objects의 compare정적메서드는 비교할 객체 2개와 비교자를 제공해야한다.
		int result = Objects.compare(s1, s2, sc);
		System.out.println(result);
		
		if(result ==1) 
			System.out.println("s1인스턴스가 s2인스턴스보다 뒤에 있다.");
		
		//익명구현 객체
		/*int result = Objects.compare(s1, s2, new Comparator<Student>() {
			@Override
			public int compare(Student a, Student b) {
				return Integer.compare(a.sno, b.sno);
			}
			
		});
		System.out.println(result);*/
		
	}
	
		//중첩 정적 클래스
		static class Student{
			int sno;
			String name;
			
			public Student(int sno, String name) {
				this.sno = sno;
				this.name=name;
			}
		}
	
		static class StudentComparator implements Comparator<Student>{
			//숫자 비교
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
