package sec01_exam;

public class IfnestedExample {

	public static void main(String[] args) {
		
		int score = (int)(Math.random()*20)+81;
		//0<= mathround <1 --> 0<= m <101 int���̹Ƿ� �������� ����  �� 100���϶� ��
		
		System.out.println("����"+score);
		
		String grade = null;
		
		if(score>=90) {
			if(score>=95)
				grade = "A+";
			else 
				grade = "A-";
		}//��ø if�� (���������� if�־ ������)
		
		else {
			if(score>=85) 
				grade = "B+";
			else  
				grade = "B-";
		}
		
		System.out.println("����"+grade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
