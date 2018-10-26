package sec01_date;

import java.text.SimpleDateFormat;
import java.util.Date;



public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		//DateŬ������ ���� �ν��Ͻ� ������ SimpleDateFormatŬ������ format()�� �̿��ؼ�
		//���ϴ� ���·� ����� �� �ִ�
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
		SimpleDateFormat sf = new SimpleDateFormat("hh:mm:ss");
		
		System.out.println(sf.format(now));
		
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);

	}

}
