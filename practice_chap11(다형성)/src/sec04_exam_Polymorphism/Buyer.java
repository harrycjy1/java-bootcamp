package sec04_exam_Polymorphism;

public class Buyer {

		int money = 1000;
		int bonuspoint = 0;
		
		//�Ű����� Product p �� ������ ��Ȯ�� �����ϴ� ���� �ſ� �߿�!(������ ����)
		//Product�� �ƴ϶� Product�� ��ӹ޴�
		//�Ŭ������ �� �Ű������� ���ü� �ִ�.
		public void buy(Product p) {
			
			if(this.money < p.price) {
				System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
				this.money = 0;
				return;
			}
		//���������� ������ ��ǰ�� ������ ���.
			this.money -= p.price;
			//��ǰ�� ���ʽ� ������ �߰��Ѵ�.
			this.bonuspoint += p.bonuspoint;
			System.out.println(p+"�� �����ϼ̽��ϴ�.");
		
		}
	}


