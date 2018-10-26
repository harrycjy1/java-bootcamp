package sec01_exam;

public class Array_Example02 {
//클래스영역
	
	
	
	
	public static void main(String[] args) {
	//메서드영역
		
		
		int sum=0;
		float average=0.0f;
		
		int[] score= new int[] {100,88,100,100,90};
		//선언과 동시에 초기화
		
		System.out.println("배열의 길이 : "+ score.length);
		
		for(int i=0; i<score.length; i++){
			sum += score[i];
		}//배열값 누적
		
		
		average = (float)sum/score.length;
		//우항이 int형 좌항이 float 형인데 원하는값을 float형으로 얻기 위해서 float로 캐스팅
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average);
		

	}

}
