package sec_verify06;

public class StackExample {

	public static void main(String[] args) {
		
		
			Stack<String> Stringstack = new Stack<>(10);
			
			
			
			Stringstack.push("고양");
			Stringstack.push("용인");
			Stringstack.push("마산");
			Stringstack.push("창녕");
			Stringstack.push("구지");
			Stringstack.push("현풍");
			Stringstack.push("대구");
			Stringstack.push("광주");
			Stringstack.push("부산");
			Stringstack.push("서울");
			
			Stringstack.push("태백");
			
			System.out.println("StringStack에 push된  객체를 pop()을 통해 꺼집어냈습니다");
			for(int i=0; i<10; i++) {
				System.out.println((i+1)+"번째 객체값 : "+Stringstack.pop());	
			}
			System.out.println();
			System.out.println();
			
			Stack<Integer> Intstack = new Stack<>(10);
			Intstack.push(100);
			Intstack.push(123);
			Intstack.push(164);
			Intstack.push(151);
			Intstack.push(187);
			Intstack.push(165);
			Intstack.push(532);
			Intstack.push(987);
			
			System.out.println("Intstack에 push된  객체를 pop()을 통해 꺼집어냈습니다");
			for(int i=0; i<10; i++) {
				
				System.out.println((i+1)+"번째 객체값 : "+Intstack.pop());	
				
			}
			

	}

}
