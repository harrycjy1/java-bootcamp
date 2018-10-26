package sec03_exam_threadExtends_01;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		//상속을 통한 하위클래스로버투 생성하는 멀티 스레드 방법
		//상속을 위용한 다형성 적용
		Thread thread = new BeepThread();
		thread.start();
		
		//"띵"문자열 출력
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
