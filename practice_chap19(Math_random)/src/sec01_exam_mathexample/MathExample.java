package sec01_exam_mathexample;

public class MathExample {

	public static void main(String[] args) {
			
		//���밪
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		
		//�ø���
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
		
		//������
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5="+v5);
		System.out.println("v6="+v6);
		
		//������ ū ��
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7="+v7);
		System.out.println("v8="+v8);
		
		//���߿� ���� ��
		int v9=Math.min(5, 9);
		double v10 = Math.min(5.3, 2.3);
		System.out.println("v9="+v9);
		System.out.println("v10="+v10);
		
		//����
		double v11= Math.random();
		System.out.println("v11="+v11);

		//����� ������ �Ǽ���
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.5);
		System.out.println("v12="+v12);
		System.out.println("v13="+v13);
		
		//�ݿø���
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14="+v14);
		System.out.println("v15="+v15);
		
		//�Ҽ� �¤� �ڸ����� �ݿø� �ϴ� ��
		double value = 12.3456;
		double temp1 = value*100;
		long temp2 = Math.round(temp1);
		double v16 = temp2/100.0;
		System.out.println("v16"+v16);
		
		
		double temp3 = (Math.round(value*1000))/1000.0;
		System.out.println(temp3);
		
		
		
		
		
		
		
		
	}

}
