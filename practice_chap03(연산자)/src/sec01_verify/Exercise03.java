package sec01_verify;

public class Exercise03 {

	public static void main(String[] args) {
		
		
		int pencils = 534;
		int students = 30;
		
		
		int pencilsPerStudent = pencils/students;
		int leftedPencil = pencils%students;
		
		System.out.println("학생 한 명이 가지는 연필 수 :"+pencilsPerStudent);
		System.out.println("남은 연필수 :" + leftedPencil);

	}

}
