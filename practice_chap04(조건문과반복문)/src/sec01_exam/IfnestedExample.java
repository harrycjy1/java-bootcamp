package sec01_exam;

public class IfnestedExample {

	public static void main(String[] args) {
		
		int score = (int)(Math.random()*20)+81;
		//0<= mathround <1 --> 0<= m <101 int값이므로 정수값만 도출  즉 100이하란 말
		
		System.out.println("점수"+score);
		
		String grade = null;
		
		if(score>=90) {
			if(score>=95)
				grade = "A+";
			else 
				grade = "A-";
		}//중첩 if문 (무제한으로 if넣어도 괜찮다)
		
		else {
			if(score>=85) 
				grade = "B+";
			else  
				grade = "B-";
		}
		
		System.out.println("학점"+grade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
