package sec_verify06;

public class Student implements Cloneable{

	private String 		nID;
	private String 		szName;
	public int[] a;
	
	
	
	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public String getnID() {
		return nID;
	}

	public void setnID(String nID) {
		this.nID = nID;
	}

	public String getSzName() {
		return szName;
	}

	public void setSzName(String szName) {
		this.szName = szName;
	}

	public Student(String nID,String szName) {
		this.nID=nID;
		this.szName=szName;
	}
	
	
	
	
	public Student getStudent() {
		Student cloned = null;
		try {
			cloned = (Student)this.clone();
		}
		
		catch(CloneNotSupportedException e) {}
		
		return cloned;
	}
	
	
	
	
	@Override
	public String toString() {
		
		return "ID´Â "+this.nID+", NameÀº "+this.szName;
	}
}
