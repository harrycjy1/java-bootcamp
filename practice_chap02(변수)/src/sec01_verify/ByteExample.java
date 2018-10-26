package sec01_verify;

public class ByteExample {

	public static void main(String[] args) {
	

		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128;
		//(byte는 1바이트까지의 범위만을 수용가능하므로 -128부터 127까지의 값만을 인식함)
		
		System.out.println("var1 :" + var1);
		System.out.println("var2 :" + var2);
		System.out.println("var3 :" + var3);
		System.out.println("var4 :" + var4);
		System.out.println("var5 :" + var5);
	}

}
