package sec01_exam_OverridingTest;

public class UsbMemory extends Hddisk {

		int capacity;
		int rpm;
		
		public UsbMemory(int c, int r) {
			super(10,50);
			this.capacity=c;
			this.rpm=r;
		}
		
		@Override
		public String Status() {
			return "USB �޸� �뷮��  "+this.capacity+"GB�̸�, RPM��"+this.rpm+"�Դϴ�.";
		}
	
	
	
	
	
	
	
	
}
