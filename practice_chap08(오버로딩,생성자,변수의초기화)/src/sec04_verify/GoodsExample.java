package sec04_verify;

import java.util.Scanner;

public class GoodsExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Goods good1 = new Goods("사이다",1000,200,50);
		Goods good2 = new Goods("콜라",1000,100,50);
		
		System.out.println("몇개의 상품을 입력받으시겠습니까?");
		
		int input = scan.nextInt();
		
		
		System.out.println("1번째 상품 이름 : "+ good1.name);
		System.out.println("1번째 상품 가격 : "+ good1.price);
		System.out.println("1번째 상품 재고 : "+ good1.numberOfStock);
		System.out.println("1번째 상품 팔린 수량 : "+ good1.sold);
		System.out.println();//줄바꿈
		
		System.out.println("2번째 상품 이름 : "+ good2.name);
		System.out.println("2번째 상품 가격 : "+ good2.price);
		System.out.println("2번째 상품 재고 : "+ good2.numberOfStock);
		System.out.println("2번째 상품 팔린 수량 : "+ good2.sold);
		System.out.println();
		
		System.out.println("입력하신 상품의 이름, 가격, 재고, 팔린수량 의 현황입니다.");
		System.out.println(good1.name+" "+good1.price+" "+good1.numberOfStock+" "+good1.sold);
		System.out.println(good2.name+" "+good2.price+" "+good2.numberOfStock+" "+good2.sold);

	}

}
