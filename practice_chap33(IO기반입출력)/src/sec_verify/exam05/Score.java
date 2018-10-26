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
		System.out.println("6명 총점 : \t"+koreanTotal+"\t"+mathTotal+"\t"+englishTotal+"\t"+total);
		
		
	}
	
	public void displayList() {
		System.out.println("이름\t번호\t국어\t수학\t영어\t총점");
		System.out.println("==============================================");
		for(Student stu : record) {
			System.out.println(stu.toString());
		}
		System.out.println("==============================================");
		getSubjectTotal();
		
	}
}
