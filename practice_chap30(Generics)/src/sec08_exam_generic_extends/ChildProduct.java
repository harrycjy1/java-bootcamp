package sec08_exam_generic_extends;

public class ChildProduct<T, M,C> extends Product<T, M>{
	//조상 클래스 제네릭타입을 그대로 상속해야함
	
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
	

}
