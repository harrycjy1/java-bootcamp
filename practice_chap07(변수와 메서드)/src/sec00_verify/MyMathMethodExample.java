package sec00_verify;

public class MyMathMethodExample {

	public static void main(String[] args) {
		
			long a=200L;
			long b=100L;
		
		//����ƽ Ŭ���� new������ �ʿ� x
		
		System.out.println("Ŭ����(static)�޼��� add ȣ��\t"+MyMathMethod.add(a,b));
		System.out.println("Ŭ����(static)�޼��� subtract ȣ��\t"+MyMathMethod.subtract(a, b));
		System.out.println("Ŭ����(static)�޼��� multiply ȣ��\t"+MyMathMethod.multiply(a, b));
		System.out.println("Ŭ����(static)�޼���divide ȣ��\t"+MyMathMethod.divide(a, b));
		System.out.println();
		
		System.out.println();
		
		//�ν��Ͻ� Ŭ���� new������ �ʿ�o
		
		MyMathMethod math=new MyMathMethod();
		
		math.setA(200);
		math.setB(100);
		
		System.out.println("�ν��Ͻ� �޼��� add ȣ��\t"+math.add());
		System.out.println("�ν��Ͻ� �޼��� subtract ȣ��\t"+math.subtract());
		System.out.println("�ν��Ͻ� �޼��� multiply ȣ��\t"+math.multiply());
		System.out.println("�ν��Ͻ� �޼��� divide ȣ��\t"+math.divide());
	
	
	}

}
