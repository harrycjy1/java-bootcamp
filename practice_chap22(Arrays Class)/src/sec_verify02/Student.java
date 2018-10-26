package sec_verify02;

public class Student implements Comparable<Student>{

	
	private String	hakbun;
	private String 	name;
	
	
	
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String hakbun,String name) {
		this.hakbun = hakbun;
		this.name=name;
	}
	
	@Override
	public int compareTo(Student o) {
		
		return (o.hakbun).compareTo(this.hakbun);
	}

	
	

	
		
}
