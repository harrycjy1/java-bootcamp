package sec03_verify;

public class ColorPoint extends Point {
	
	
		String 		color;
			
			
		void setColor(String color) {
			this.color = color;
		}
		void showColorPoint() {
			System.out.print("������ "+this.color+"���� ��ǥ : ");
			showpoint();
		}
				
		public ColorPoint() {
			
		}
}
