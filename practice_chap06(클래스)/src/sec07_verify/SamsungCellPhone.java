package sec07_verify;

public class SamsungCellPhone {

	
	String 		company;
	String 		model;
	String 		color;
	int 		release;
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		if(!(company=="samsung")) {
			System.out.println("�Ｚ���� �ƴմϴ�.");
			return;
		}
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(!(model.equals("Galaxy3")||model.equals("Galaxy4")||model.equals("Galaxy5")||model.equals("Galaxy6")||model.equals("Galaxy7")||model.equals("GalaxyNote"))) {
			System.out.println("Samsung�� ���� �ƴմϴ�.");
			return;
		}
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	
	@Override
	public String toString() {
		String str = this.getCompany()+"ȸ���� "+this.getColor()+"������ "+this.getModel()+"���̸�, "+
					"������� "+ this.getRelease()+"�� �Դϴ�.";
		return str;
	}
	
	
	
	
}
