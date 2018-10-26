package sec07_verify;

public class Printer {

	
	void 	println(int value) {
		int result = value;
		System.out.println("숫자값 출력 : "+value);
	}
	void 	println(boolean value) {
		boolean result = value;
		System.out.println("논리값 출력 : "+value);
	}
	void 	println(double value) {
		double result = value;
		System.out.println("더블형값 출력 : "+value);
	}
	void 	println(String value) {
		String result = value;
		System.out.println("스트링 출력 : "+value);
	}
	//매개변수의 타입이 각각 다 다르므로 오버로딩의 조건이 성립
	//void엔 return 필요없음.
	
	
}
