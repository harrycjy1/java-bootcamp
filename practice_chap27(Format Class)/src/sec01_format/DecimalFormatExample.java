package sec01_format;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		
		double num = 1234567.89;
		
		//아래 소스를 보고 형식지정자에 따라 값이 변화되는것을 보고 적절히 사용하자
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000000000000.0000000000000");
		System.out.println(df.format(num));//0은 값이 없더라도 0을 찍어서 출력한다.
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("###################.##################");
		System.out.println(df.format(num));
	
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
	
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
	
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
	
	
	
	
	
	
	
	}

}
