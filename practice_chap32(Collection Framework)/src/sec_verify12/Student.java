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
		
		return "�̸� : "+this.name+", "+this.ban+"��, "+this.no+"��, ���� : "+kor+"��, ���� : "+eng+"��, ���� : "+math+"��, ���� : "
		+getTotal()+", ��� : "+getAverage();
	}
	
}
