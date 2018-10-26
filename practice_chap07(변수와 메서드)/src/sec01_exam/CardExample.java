package sec01_exam;

public class CardExample {

	public static void main(String[] args) {
		
		
		
		//static변수는 인스턴스 생성없이도 접근 가능
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
	
		//c1인스턴스를생성
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		//c2인스턴스를 생성		
		Card c2 = new Card();
		
		c2.kind="Space";
		c2.number= 4;
		
		System.out.println("c1은 "+ c1.kind +","+c1.number + "이며 크기는 ("+Card.width+","+Card.height+")");
		System.out.println("c2은 "+ c2.kind +","+c2.number + "이며 크기는 ("+Card.width+","+Card.height+")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		
		Card.width =50;
		Card.height=80; //static변수로 선언되어 있기 때문에 접근방식을 인스턴스 변수에게 접근할때와는 다르게 접근해야한다.
						
		System.out.println("c1은 "+ c1.kind +","+c1.number + "이며 크기는 ("+Card.width+","+Card.height+")");
		System.out.println("c2은 "+ c2.kind +","+c2.number + "이며 크기는 ("+Card.width+","+Card.height+")");
	
		
	}

}
