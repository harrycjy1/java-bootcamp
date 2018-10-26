package sec06_exam_Polymorphism_Vector;

import java.util.Arrays;
import java.util.Vector;

public class Buyer {

		int money = 100000;
		int bonuspoint = 0;
		
		Vector item = new Vector();
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
			this.item.add(p);
			System.out.println(p.toString() +"를 구입하셨습니다.");
		
		}
		
		public void refund(Product p) {
			//제품을 Vector에서 제거한다.
			if(item.remove(p)) {
				money +=p.price;
				bonuspoint -= p.bonuspoint;
				System.out.println(p + "을 반품하셨습니다.");
			}
			else {
				System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
			}
		}
		
		
		
		public void summary() {
			int sum = 0;		//구입한 물품의 가격합계
			String itemList="";	//구입한 물품목록
			
			//vector가 비어있는지 확인ㄷ한다.
			if(item.isEmpty()) {
				System.out.println("구입 하신 제품이 없습니다.");
				return;
			}
			
			for(int i=0; i<item.size(); i++) {
				if(item.get(i) instanceof Product) {
					Product p = (Product)item.get(i);//다운캐스팅
					sum += p.price;
					itemList += ((i==0)? ""+p:", "+p);
				}
				else {
					System.out.println("Product객체가 아닙니다.!");
				}
			}
			System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
			System.out.println("구입하신 제품은 "+itemList+"입니다.");
			
		}

		
}


