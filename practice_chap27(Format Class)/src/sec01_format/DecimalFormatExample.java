package sec01_format;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		
		double num = 1234567.89;
		
		//�Ʒ� �ҽ��� ���� ���������ڿ� ���� ���� ��ȭ�Ǵ°��� ���� ������ �������
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000000000000.0000000000000");
		System.out.println(df.format(num));//0�� ���� ������ 0�� �� ����Ѵ�.
		
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
