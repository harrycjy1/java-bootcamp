package sec03_verify;

import java.util.concurrent.SynchronousQueue;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();//�⺻������
		System.out.println("car1.company :"+ car1.company);//���۴ϴ� �̹� �����ڵ����� �ʱ�ȭ �س��� ����.
		System.out.println();//�ٹٲ�

		Car car2 = new Car("�ڰ���");//�Ű������� �Ѱ��� ������
		System.out.println("car2.company :"+ car2.company);
		System.out.println("car2.model :"+ car2.model);
		System.out.println();
		
		Car car3 = new Car("�ڰ���","����");//�Ű������� �ΰ��� ������
		System.out.println("car3.company :"+car3.company);
		System.out.println("car3.model :"+car3.model);
		System.out.println("car3.color :"+car3.color);
		System.out.println();
		
		Car car4 = new Car("�ý�","����",200);//�Ű������� ������ ������
		System.out.println("car4.company :"+car4.company);
		System.out.println("car4.color :"+car4.color);
		System.out.println("car4.model :"+car4.model);
		System.out.println("car4.maxSpeed :"+car4.maxSpeed);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
