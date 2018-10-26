package sec_verify12;

public class Student {

	String 			name;
	int 			ban;
	int 			no;
	int 			kor;
	int 			eng;
	int 			math;
	
	public Student	(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public int getTotal() {
		int result = kor+eng+math;
		return result;
	}
	
	public int getAverage() {
		int result = getTotal()/3;
		return result;
	}
	
	@Override
	public String toString() {
		
		return "이름 : "+this.name+", "+this.ban+"반, "+this.no+"번, 국어 : "+kor+"점, 영어 : "+eng+"점, 수학 : "+math+"점, 총점 : "
		+getTotal()+", 평균 : "+getAverage();
	}
	
}
