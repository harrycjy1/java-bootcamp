package sec01_exam_create_singleThread;

import java.awt.Toolkit;

public class BeepPrintExample {

	//main()스레드는 JVM이 실행함을 기억하자
	public static void main(String[] args) {
		/*
		 * 아래코드는 싱글스레드에서 돌아가는 작업이므로, 비프음을 5번 알리고 난후, "핑"이라는 문자열을 5번 출력한다
		 * 하지만 우리가 원하는것은 핑이라는 문자열이 출력되면서 비프음도 같이 출력되는 것을 원한다.
		 * 이것이 싱글 스레드의 단점, 즉 순차적이라는 것이다
		 * 이것을 멀티스레드로 바꿔가는것이 스레드 장에서 우리가 해야할 일이다.
		 * 비프음을 5번 박복해서 소리나게함
		 * Toolkit은 AWT(Abstract Window Toolkit)추상클래스를 상속받은 또 다른 추상클래스이다.
		 * 그주으 GUI관련된 메서드들이 있다 getDefaultToolkit 는 기본적인 메서드를 구현해놓은 메서드이다.
		 * 
		 * */
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("핑");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
