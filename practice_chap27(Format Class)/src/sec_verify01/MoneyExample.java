package sec_verify01;

import java.text.DecimalFormat;

public class MoneyExample {

	public static void main(String[] args) {
		
		String data = "123,456,789.5";
		
		String data1=data.replace(",", "");
		
		double data2 = Double.parseDouble(data1);
		
		
		DecimalFormat df = new DecimalFormat("#");
		System.out.println("data : "+data);
		System.out.println("반올림 결과 : " +df.format(data2));
		df = new DecimalFormat("#,####");
		System.out.println("만단위, 추가 :"+df.format(data2));
	
		/*
		 	출력결과
			data : 123,456,789.5
			반올림 결과 : 123456790
			만단위 , 추가 : 1,2345,6790
		*/
		
	}

}
