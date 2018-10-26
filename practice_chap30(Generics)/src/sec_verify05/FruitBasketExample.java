package sec_verify05;

public class FruitBasketExample {

	public static void main(String[] args) {
		
		
		Fruit<String,Integer> f1=FruitBasket.basketing("사과", 1500);
		System.out.println("과일명 : "+f1.getK());
		System.out.println("가격 : "+f1.getV());
		
		Fruit<String,Integer> f2=FruitBasket.basketing("귤", 700);
		System.out.println("과일명 : "+f2.getK());
		System.out.println("가격 : "+f2.getV());
		
		Fruit<String,Integer> f3=FruitBasket.basketing("배", 3700);
		System.out.println("과일명 : "+f3.getK());
		System.out.println("가격 : "+f3.getV());
	}

}
