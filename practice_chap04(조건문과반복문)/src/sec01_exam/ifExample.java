package sec01_exam;


public class ifExample {

	public static void main(String[] args) {

		/*Scanner scanner = new Scanner(System.in);
		
		System.out.printin("점수를 입력해주세요");
		
		int score=scanner.nextInt();*/
		
		int score=93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");			
		}
		
		if(score<90) {
			System.out.println("점수가 90보다 작습니다.");
		
		//{}는 한줄일때는 생략할 수 있지만, 웬만하면 묶어주는게 보기 좋다.
		}
		System.out.println("등급은 B입니다.");
		
		
		
		
		
	}

}
