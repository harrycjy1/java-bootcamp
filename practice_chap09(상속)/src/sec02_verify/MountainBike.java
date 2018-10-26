package sec02_verify;

public class MountainBike extends Bicycle {

	
	String 		frame;
	int 		gear;
	String 		money;
	
	
	
	void prtInfo() {
		if(brand=="Scott") {
			this.gear = 30;
			this.money = "8천만원";
			this.frame = "카본";
		}
		else if(brand=="Giant") {
			this.gear = 27;
			this.frame = "알루미늄";
			this.money = "30만원";
		}
		else if(brand=="Lespo") {
			this.gear = 18;
			this.frame = "철";
			this.money = "5만원";
		}
		else {
			System.out.println("잘못된 브랜드이름입니다.");
		}
		
		System.out.println("기어는 : "+this.gear+"단 입니다.");
		System.out.println("프레임은 : "+ this.frame+"입니다.");
		System.out.println("가격은 : "+this.money+"입니다.");
		System.out.println();
	}
	
	
	
	public MountainBike(int id, String brand) {
		super(id,brand);
		System.out.println("내 자전거는 상표가"+this.brand+"입니다.");
		
	}
	
	
}
