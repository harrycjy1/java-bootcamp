package sec01_verify;

public class Car {

	
	private String model;
	private String company;
	private String color;
	private String speed;
	private String maxspeed;
	private String modispeed;
	private int num2;
	
	//�ڵ� �ϼ�
	
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(String maxspeed) {
		this.maxspeed = maxspeed;
	}
	public String getModispeed() {
		return modispeed;
	}
	public void setModispeed(String modispeed) {
		this.modispeed = modispeed;
	}
	
	
	
	@Override
	public String toString() {
		String str = "����ȸ��\t: "+this.getCompany()+"\n"+"�𵨸�\t: "+this.getModel()+"\n"+
					"����\t: "+getColor()+"\n"+"�ְ�ӵ�\t: "+getMaxspeed()+"\n"+"����ӵ�\t: "+getSpeed()+
					"\n"+"���� �ӵ�\t: "+getModispeed();
		return str;
	}
	
	
	
	
	
	
}
