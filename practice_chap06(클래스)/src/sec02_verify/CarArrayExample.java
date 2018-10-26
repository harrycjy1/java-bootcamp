package sec02_verify;

import sec01_verify.Car;

public class CarArrayExample {

	public static void main(String[] args) {
		
		Car[] cArr = new Car[5];
		int i =0;
		
		for(i=0; i<cArr.length; i++) {
			cArr[i]=new Car();
			System.out.println("cArr["+i+"] 인스턴스 생성");
		}
		
		for(i=0; i<cArr.length; i++) {
			cArr[i]=new Car();
			cArr[i].setNum2(i);
			System.out.println("cArr["+i+"] = "+cArr[i].getNum2());
		}
	

	}

}
