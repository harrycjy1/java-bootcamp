package sec01_verify;

public class Student extends People{
	
	
	int	 sutudentNo;
	
	
	public Student(String name, String ssn, int studentNo){
		super(name,ssn);
		this.sutudentNo=studentNo;
	}

}
