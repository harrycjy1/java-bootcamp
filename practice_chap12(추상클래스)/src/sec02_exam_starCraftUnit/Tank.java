package sec02_exam_starCraftUnit;

public class Tank extends Unit{

	
		String str;
		
		public Tank() {}
		
		@Override
		public void move(int x, int y) {
			this.x=x;
			this.y=y;
			System.out.println("��ũ�� ��ġ : "+this.x +", "+this.y+"�� �̵���.");
			
		}


		public void sizeMode() {
			this.str = "���ݸ�� : ���� ��� ��ȯ";
			System.out.println(this.str);
		}


}
