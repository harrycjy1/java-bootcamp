package sec_verify05;

public class FruitBasketExample {

	public static void main(String[] args) {
		
		
		Fruit<String,Integer> f1=FruitBasket.basketing("���", 1500);
		System.out.println("���ϸ� : "+f1.getK());
		System.out.println("���� : "+f1.getV());
		
		Fruit<String,Integer> f2=FruitBasket.basketing("��", 700);
		System.out.println("���ϸ� : "+f2.getK());
		System.out.println("���� : "+f2.getV());
		
		Fruit<String,Integer> f3=FruitBasket.basketing("��", 3700);
		System.out.println("���ϸ� : "+f3.getK());
		System.out.println("���� : "+f3.getV());
	}

}
