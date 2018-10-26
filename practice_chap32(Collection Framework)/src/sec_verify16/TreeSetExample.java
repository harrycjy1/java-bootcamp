package sec_verify16;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Student> treeSet = new TreeSet<>();
		
		treeSet.add(new Student("신은혁", 96));
		treeSet.add(new Student("김주성", 86));
		treeSet.add(new Student("김동주", 68));
		treeSet.add(new Student("이대호", 100));
		treeSet.add(new Student("김호주", 59));
		treeSet.add(new Student("이주희", 77));
		
		for(Student stu : treeSet) {
			System.out.println("학생 이름 : "+stu.getName()+", 점수 : "+stu.getScore());
		}
		
		System.out.println();
		System.out.println("최고 점수 : "+treeSet.last().getScore()+", 학생 이름 : "+treeSet.last().getName());

	}

}
