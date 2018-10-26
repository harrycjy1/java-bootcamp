package sec01_verify;

public class Exercise02 {

	public static void main(String[] args) {
		
		
			int score = 85;
			String result = (!(score>90)?"가":"나");
			
			System.out.println(result);

			/*if(result)
			{	
				System.out.println("가");
			}
			else
			{
				System.out.println("나");
				
			}
		*/
			
			
			//삼항 연산자로서 나오는 값은 "나"여야 하지만 앞의 !연산자로 인해 출력값은 가로 나온다)
		
			

	}

}
