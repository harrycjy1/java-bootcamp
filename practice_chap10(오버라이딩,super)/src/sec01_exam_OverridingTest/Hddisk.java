package sec01_exam_OverridingTest;

public class Hddisk {

	
		int capacity;
		int rpm;
		
		public Hddisk() {
			
		}
		
		public Hddisk(int c,int r) {
			this.capacity = c;
			this.rpm = r;
			
		}
		
		public String Status() {
			return "�ϵ��ũ�� �뷮�� "+ this.capacity+"GB�̸�, RPM�� "+this.rpm+"�Դϴ�.";
		}
		
		
}
