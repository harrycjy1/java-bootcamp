package sec01_exam;

public class Array_Example07 {

	public static void main(String[] args) {
		
		int[] ball= new int[5];
		
		for(int i=0; i<ball.length; i++){
			 ball[i]= (int)(Math.random()*45);
		}
		
		System.out.println("���� ��");
		for(int i=0; i<ball.length; i++) {
			System.out.println(ball[i]);
		}
		//���� �������� �迭�� �������
		
		//Arrays.sort(ball);
		//������ �ϱ� ���ؼ��� �������+���ǹ��� �ʼ��̴�. �����ʵ��� ����.
		for(int i=0; i<ball.length; i++){
			for(int j=0; j<ball.length-1; j++) {
				if(ball[j] > ball[j+1]) {
					//�������(����)
					int temp= ball[j];
					ball[j]=ball[j+1];
					ball[j+1]=temp;
				}
			}
		}		
		
		
		
		System.out.println("���� ��");
		for(int i=0; i<ball.length; i++) {
			System.out.println(ball[i]);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
