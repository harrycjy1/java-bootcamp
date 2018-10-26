package sec07_verify;

import java.util.Vector;

public class Buyer {

	int 			money = 1000;
	int 			bonusPoint = 0;
	Vector item = new Vector();
	int 			i =0;


	public void buy(Product p) {
		if(p.price<money) {
			this.item.add(p);
			this.money-=p.price;
			this.bonusPoint += p.bonusPoint;
			System.out.println(p.toString()+"를 구입하셨습니다.");
		}
		else {
			System.out.println(p.toString()+"잔액이 부족하여 살 수 없습니다.");
		}
	
	}

	
	public void summary() {
		int sum = 0;
		String itemlist = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 물품이 없습니다.");
			return;
		}
			
		for(int i=0; i<item.size(); i++) {
			if(item.get(i) instanceof Product) {
						Product p = (Product) item.get(i);
						sum += p.price;
						itemlist += p.toString();
			}
		}
		
		System.out.println("구입하신 물품의 총 금액은 "+sum+"만원 입니다.");
		System.out.println("구입하신 제품은"+itemlist+"입니다.");
		
	}
	
	
	
	























}
