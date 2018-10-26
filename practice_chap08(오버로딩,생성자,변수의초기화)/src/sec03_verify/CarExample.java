package sec03_verify;

import java.util.concurrent.SynchronousQueue;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();//기본생성자
		System.out.println("car1.company :"+ car1.company);//컴퍼니는 이미 현대자동차로 초기화 해놓은 상태.
		System.out.println();//줄바꿈

		Car car2 = new Car("자가용");//매개변수가 한개인 생성자
		System.out.println("car2.company :"+ car2.company);
		System.out.println("car2.model :"+ car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용","빨강");//매개변수가 두개인 생성자
		System.out.println("car3.company :"+car3.company);
		System.out.println("car3.model :"+car3.model);
		System.out.println("car3.color :"+car3.color);
		System.out.println();
		
		Car car4 = new Car("택시","검정",200);//매개변수가 세개인 생성자
		System.out.println("car4.company :"+car4.company);
		System.out.println("car4.color :"+car4.color);
		System.out.println("car4.model :"+car4.model);
		System.out.println("car4.maxSpeed :"+car4.maxSpeed);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
