package sec03_exam_singleinheritance;

public class Vcr {
			
	
			boolean power;
			int counter = 0;
			
			public Vcr() {
				super();
				System.out.println("Vcr������ ȣ��");
			}
			public void power() {
				this.power = !this.power;
				System.out.println("Vcr�� power�޼��带 ȣ���Ͽ����ϴ�.");
			}
			public void play() {
				System.out.println("Vcr�� play�޼��带 ȣ���Ͽ����ϴ�.");
			}
			public void stop() {
				System.out.println("Vcr�� stop�޼��带 ȣ���Ͽ����ϴ�.");
			}
			
			
			//�ǰ��� <<
			public void rew() {
				System.out.println("Vcr�� rew�޼��带 ȣ���Ͽ����ϴ�.");
			}
			//�������� >>
			public void ff() {
				System.out.println("Vcr�� ff�޼��带 ȣ���Ͽ����ϴ�.");
			}
	
	
	
}
