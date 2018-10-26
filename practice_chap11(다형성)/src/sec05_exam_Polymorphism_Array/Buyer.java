package sec05_exam_Polymorphism_Array;

import java.util.Arrays;

public class Buyer {

		int money = 1000;
		int bonuspoint = 0;
		
		Product[] item = new Product[10];//포함임
		int i=0;
		
		public void buy(Product p) {
			
			if(this.money < p.price) {
				System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
				return;
			}
		//가진돈에서 구입한 제품의 가격을 밴다.
			this.money -= p.price;
			//제품의 보너스 점수를 추가한다.
			this.bonuspoint += p.bonuspoint;
			this.item[i++]=p;
			System.out.println(p+"를 구입하셨습니다.");
		
		}
		
		public void summary() {
			int sum = 0;		//구입한 물품의 가격합계
			String itemList="";	//구입한 물품목록
			
			//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
			for(int i=0; i<item.length; i++) {
				if(item[i]==null)
					break;
				
				sum+=this.item[i].price;
				
				if(i==9)
					itemList += this.item[i];
				else
					itemList += this.item[i] + ",";
			}
			System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
			System.out.println("구입하신 제품은 "+Arrays.toString(item)+"입니다.");
			
		}
		
		
		
		
		
		
		
		
		
}


