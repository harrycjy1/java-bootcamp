package sec04_exam_Polymorphism;

public class Product {

	int price;
	int bonuspoint;
	
	//������
	public Product(int price) {
		this.price=price;
		this.bonuspoint=(int)(price/10.0);
	}
}
