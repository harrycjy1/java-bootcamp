package sec02_exam;

public class Tv {

		String color;
		boolean power;
		int channel;
		
		//��� �޼���(�Լ�)
		//Tv�� �Ѱų� ���� ����� �ϴ� �޼���
		public void power() {
			this.power = !this.power;
		}
		
		public void channelup() {
			++this.channel;
			
		}
		
		public void channeldown() {
			if(this.channel <0) {
				System.out.println("ä���� �������� �����ϴ�.");
			}
			else {
				--this.channel;
			}
			return;
		}













}
