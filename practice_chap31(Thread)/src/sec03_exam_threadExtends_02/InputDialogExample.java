package sec03_exam_threadExtends_02;

import javax.swing.JOptionPane;

public class InputDialogExample {

	public static void main(String[] args) {
		
		TimerThread t = new TimerThread();
		t.start();
		t.setName("스레드드드");
		System.out.println(t.getName());
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은 "+input+"입니다.");

	}

}
