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
			System.out.println("삼성차가 아닙니다.");
			return;
		}
		this.company = company;
	}
	public String getModel() {
		
		return model;
	}
	public void setModel(String model) {
		if(!(model.equals("SM5"))) {
			System.out.println("삼성 차 모델이 아닙니다.");
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
			System.out.println("속도는 음수일 수가 없네요. 뒤로 갈까요??");
		}
		this.maxSpeed = maxSpeed;
	}
	
	
	@Override
	public String toString() {
		String str = this.getCompany()+"회사의"+this.getColor()+"색상의" +this.getModel()+"모델이며, "+this.getMaxSpeed()+"의 최고 속도를 자랑합니다.";
		return str;
	}
	
	
	
	
}
