package sec02_exam;

public class TvTestExample3 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];
		int i=0;
		
		//Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		
		for(i=0; i<tvArr.length; i++) {
			tvArr[i]=new Tv();
			tvArr[i].channel = i+10;//tvArr[i]의 channel의 값에 10증가
			System.out.println(tvArr[i].channel);
		}
		
		for(i=0; i<tvArr.length; i++) {
			tvArr[i].channelup();//tvArr[i]의 메서드를 호출. 채널이 1증가
			System.out.println("tvArr["+i+"].channel ="+tvArr[i].channel);
			
		}
		System.out.println();
		
		//향상된 for문
		//가져올 타입 : 가져올 장소
			for(Tv tv:tvArr) {
			tv = new Tv();
			tv.channel = 10;//tvArr 새로운 Tv인스턴스를 만들어 channel에 10을 저장
			System.out.println(tv.channel);
			
		}
	
	
	}
	
}
