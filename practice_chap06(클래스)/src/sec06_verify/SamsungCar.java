package sec06_verify;

public class SamsungCar {

	
	private String 	company;
	private String 	model;
	private String 	color;
	private int 	maxSpeed;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		if(!(company.equals("samsung"))) {
			System.out.println("�Ｚ���� �ƴմϴ�.");
			return;
		}
		this.company = company;
	}
	public String getModel() {
		
		return model;
	}
	public void setModel(String model) {
		if(!(model.equals("SM5"))) {
			System.out.println("�Ｚ �� ���� �ƴմϴ�.");
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
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed<0) {
			System.out.println("�ӵ��� ������ ���� ���׿�. �ڷ� �����??");
		}
		this.maxSpeed = maxSpeed;
	}
	
	
	@Override
	public String toString() {
		String str = this.getCompany()+"ȸ����"+this.getColor()+"������" +this.getModel()+"���̸�, "+this.getMaxSpeed()+"�� �ְ� �ӵ��� �ڶ��մϴ�.";
		return str;
	}
	
	
	
	
}
