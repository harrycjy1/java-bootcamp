package sec04_exam_Polymorphism;

public class Product {

	int price;
	int bonuspoint;
	
	//»ý¼ºÀÚ
	public Product(int price) {
		this.price=price;
		this.bonuspoint=(int)(price/10.0);
	}
}
