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
			System.out.println(p.toString()+"�� �����ϼ̽��ϴ�.");
		}
		else {
			System.out.println(p.toString()+"�ܾ��� �����Ͽ� �� �� �����ϴ�.");
		}
	
	}

	
	public void summary() {
		int sum = 0;
		String itemlist = "";
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
			
		for(int i=0; i<item.size(); i++) {
			if(item.get(i) instanceof Product) {
						Product p = (Product) item.get(i);
						sum += p.price;
						itemlist += p.toString();
			}
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� "+sum+"���� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ��"+itemlist+"�Դϴ�.");
		
	}
	
	
	
	























}
