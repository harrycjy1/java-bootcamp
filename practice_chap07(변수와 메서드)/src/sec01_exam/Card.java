package sec01_exam;

public class Card {

	
		String kind;							//카드의 무늬 - 인스턴스변수 --> new연산자로 인스턴스를 생성한뒤 접근
		int number;								//카드의 숫자 - 인스턴스변수
		static int width = 100;					//카드의 폭    - 클래스 변수, 정적(static)변수, 공유변수  --> new연산자 선언 할 필요없이 Card.~~로 실행하면 된다.
		static int height = 250;				//카드의 높이 - 클래스 변수, 정적(static)변수, 공유변수  
	
	
	
}
