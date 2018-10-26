package sec_verify01;

import java.text.DecimalFormat;

public class MoneyExample {

	public static void main(String[] args) {
		
		String data = "123,456,789.5";
		
		String data1=data.replace(",", "");
		
		double data2 = Double.parseDouble(data1);
		
		
		DecimalFormat df = new DecimalFormat("#");
		System.out.println("data : "+data);
		System.out.println("�ݿø� ��� : " +df.format(data2));
		df = new DecimalFormat("#,####");
		System.out.println("������, �߰� :"+df.format(data2));
	
		/*
		 	��°��
			data : 123,456,789.5
			�ݿø� ��� : 123456790
			������ , �߰� : 1,2345,6790
		*/
		
	}

}
