package sec_verify.exam05;

import java.util.ArrayList;

public class Score {

	ArrayList<Student> record = new ArrayList<>();
	int koreanTotal = 0;
	int mathTotal = 0;
	int englishTotal = 0;
	
	public void add(String name, String studentNo, int koreanScore, int mathScore, int englishScore) {
		record.add(new Student(name,studentNo,koreanScore,mathScore,englishScore));
	}
	
	
	
	public void getSubjectTotal() {
	
		for(Student stu : record) {
			koreanTotal += stu.koreanScore;
			mathTotal += stu.mathScore;
			englishTotal += stu.englishScore;
		}
		
		int total = koreanTotal+mathTotal+englishTotal;
		System.out.println("6�� ���� : \t"+koreanTotal+"\t"+mathTotal+"\t"+englishTotal+"\t"+total);
		
		
	}
	
	public void displayList() {
		System.out.println("�̸�\t��ȣ\t����\t����\t����\t����");
		System.out.println("==============================================");
		for(Student stu : record) {
			System.out.println(stu.toString());
		}
		System.out.println("==============================================");
		getSubjectTotal();
		
	}
}
