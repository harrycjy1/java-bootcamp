package sec02_exam;

public class WhileExample_1 {

	public static void main(String[] args) {
		
		int i=1;
		
		//while 문은 보통 무한루프돌때 많이 사용.
		//무한루프를 탈출할 조건문이 반드시 필요하다.
		
		while(true) {
			if(i>=11)
				break;
			System.out.println(i);
			i++;
		}
		
		/*for(i=1; i<=10; i++) {
			
			System.out.println(i);
		}*/
		
		
		
		
	}

}
