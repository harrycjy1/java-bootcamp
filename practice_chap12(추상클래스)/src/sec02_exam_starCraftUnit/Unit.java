package sec02_exam_starCraftUnit;

public abstract class Unit {

	
		int x;
		int y;
		String str;
		
		//�߻�޼��� ����(�����(������)�� ����.)
		
		public abstract void move(int x, int y);
		
		public void stop(String str, int x, int y) {
			this.x =x;
			this.y=y;
			this.str=str;
			System.out.println("������ġ : "+this.x + ", "+this.y+"�� "+this.str+"��/�� ����ϴ�.");
		}
}
