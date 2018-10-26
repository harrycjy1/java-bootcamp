package sec05_exam_Polymorphism_Array;

import java.util.Arrays;

public class Buyer {

		int money = 1000;
		int bonuspoint = 0;
		
		Product[] item = new Product[10];//������
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
			this.item[i++]=p;
			System.out.println(p+"�� �����ϼ̽��ϴ�.");
		
		}
		
		public void summary() {
			int sum = 0;		//������ ��ǰ�� �����հ�
			String itemList="";	//������ ��ǰ���
			
			//�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
			for(int i=0; i<item.length; i++) {
				if(item[i]==null)
					break;
				
				sum+=this.item[i].price;
				
				if(i==9)
					itemList += this.item[i];
				else
					itemList += this.item[i] + ",";
			}
			System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum+"�����Դϴ�.");
			System.out.println("�����Ͻ� ��ǰ�� "+Arrays.toString(item)+"�Դϴ�.");
			
		}
		
		
		
		
		
		
		
		
		
}


