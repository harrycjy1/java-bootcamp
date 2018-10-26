package sec01_exam_OverridingTest;

public class HddTest {

	public static void main(String[] args) {
		
		Hddisk hd = new Hddisk(500,720);
		UsbMemory um =new UsbMemory(32, 520);//인스턴스를 선언 각각의 클래스의 인스턴스 생성
		
		String strhd = hd.Status();

		System.out.println(hd.Status());//super클래스의 메서드 호출
		
		System.out.println(um.Status());//sub클래스의 오버라이딩한 메서드 호출
		
		
		
		
				
	}

}
