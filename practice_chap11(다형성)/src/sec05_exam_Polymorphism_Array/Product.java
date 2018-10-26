package sec05_exam_Polymorphism_Array;

public class Product {

	int price;
	int bonuspoint;
	
	//»ý¼ºÀÚ
	public Product(int price) {
		this.price=price;
		this.bonuspoint=(int)(price/10.0);
	}
	public Product() {
		
	}
}
