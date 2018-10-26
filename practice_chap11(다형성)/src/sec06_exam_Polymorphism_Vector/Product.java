package sec06_exam_Polymorphism_Vector;

public class Product {

	int price;
	int bonuspoint;
	
	//»ý¼ºÀÚ
	public Product(int price) {
		this.price=price;
		this.bonuspoint=(int)(price/10.0);
	}
	public Product() {
		this.price=0;
		this.bonuspoint=0;
	}
}
