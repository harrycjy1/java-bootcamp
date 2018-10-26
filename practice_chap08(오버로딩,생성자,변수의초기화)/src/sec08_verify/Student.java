package sec08_verify;

public class Student {

	String 		name;
	/*int 		ban;
	int 		no;*/
	int 		kor;
	int 		eng;
	int 		math;
		
	
	int getTotal() {
		int result = kor+math+eng;
		return result;
	}
	
	float getAverage() {
		float result = (float)getTotal()/3;
		return result;
	}

	Student() {
		this("ÃÖÀç¿í", 70, 70, 78);
	}
	
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor=kor;
		this.eng = eng;
		this.math= math;
	}
}
