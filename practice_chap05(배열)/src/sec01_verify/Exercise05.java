package sec01_verify;

public class Exercise05 {

	public static void main(String[] args) {
		
		
		int[] numArr = new int[10];
		
		System.out.println("원래의 배열 값들을 출력");
		
		for(int i=0; i<numArr.length; i++){
			numArr[i]=i;
			if(i==9) {
			System.out.print(numArr[i]);
			}
			else {
				System.out.print(numArr[i]+","); // 출력값 옆에 콤마를 찍기위해 if/else작성
												//콤마를 찍지 않아도 된다면 if문 사용하지 않아도 됨
			}
		}
		System.out.println();//줄넘김
		
		System.out.println("값을 임의로 섞은 후 출력");
	
		for(int i=0; i<10; i++) {
		int r=(int)(Math.random()*10);
		int tmp = numArr[9];
		numArr[9]=numArr[r];
		numArr[r]=tmp; //임의로 섞는다는 말은 모든 자리의 인덱스의 위치를 바꾸면 된다는 말
					   //r은 랜덤으로 0~9까지의 숫자가 반복해서 생성된다
					   //numArr[r]은 r번째 인덱스란 말 이 값을 첫번째 인덱스인 numArr[1]이나 numArr[9]와 
		               //계속 해서 자리를 바꿔주면 r값이 랜덤이기 때문에 자리가 임의로 섞이게 된다.
		}
		
		for(int i=0; i<numArr.length; i++) {
			
			if(i==9) {
			System.out.print(numArr[i]);
				}
			else {
			System.out.print(numArr[i]+","); // 출력값 옆에 콤마를 찍기위해 if/else작성
													//콤마를 찍지 않아도 된다면 if문 사용하지 않아도 됨
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
