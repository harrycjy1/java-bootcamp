package sec01_exam_OverridingTest;

public class HddTest {

	public static void main(String[] args) {
		
		Hddisk hd = new Hddisk(500,720);
		UsbMemory um =new UsbMemory(32, 520);//�ν��Ͻ��� ���� ������ Ŭ������ �ν��Ͻ� ����
		
		String strhd = hd.Status();

		System.out.println(hd.Status());//superŬ������ �޼��� ȣ��
		
		System.out.println(um.Status());//subŬ������ �������̵��� �޼��� ȣ��
		
		
		
		
				
	}

}
