package sec08_exam_generic_extends;

public class ChildProduct<T, M,C> extends Product<T, M>{
	//���� Ŭ���� ���׸�Ÿ���� �״�� ����ؾ���
	
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
	

}
