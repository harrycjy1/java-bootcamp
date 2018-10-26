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
				System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
				return;
			}
		//���������� ������ ��ǰ�� ������ ���.
			this.money -= p.price;
			//��ǰ�� ���ʽ� ������ �߰��Ѵ�.
			this.bonuspoint += p.bonuspoint;
			this.item.add(p);
			System.out.println(p.toString() +"�� �����ϼ̽��ϴ�.");
		
		}
		
		public void refund(Product p) {
			//��ǰ�� Vector���� �����Ѵ�.
			if(item.remove(p)) {
				money +=p.price;
				bonuspoint -= p.bonuspoint;
				System.out.println(p + "�� ��ǰ�ϼ̽��ϴ�.");
			}
			else {
				System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
			}
		}
		
		
		
		public void summary() {
			int sum = 0;		//������ ��ǰ�� �����հ�
			String itemList="";	//������ ��ǰ���
			
			//vector�� ����ִ��� Ȯ�Τ��Ѵ�.
			if(item.isEmpty()) {
				System.out.println("���� �Ͻ� ��ǰ�� �����ϴ�.");
				return;
			}
			
			for(int i=0; i<item.size(); i++) {
				if(item.get(i) instanceof Product) {
					Product p = (Product)item.get(i);//�ٿ�ĳ����
					sum += p.price;
					itemList += ((i==0)? ""+p:", "+p);
				}
				else {
					System.out.println("Product��ü�� �ƴմϴ�.!");
				}
			}
			System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum+"�����Դϴ�.");
			System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
			
		}

		
}


