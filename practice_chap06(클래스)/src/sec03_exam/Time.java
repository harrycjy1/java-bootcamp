package sec03_exam;

public class Time {

	/*
	���� ������(Access Modifier)�� ����
	
	private		: ���� Ŭ���� �������� ���� ������.
	protected	: ���� ��Ű��, �ڼ�Ŭ���������� ���� ������.
	default		: ���� ��Ű�������� ���� ������
	public 		: ������ �� ���� ������
	*/
	
	
	private int hour;		//�ʵ� �� (�������)
	private int minute;
	private float second;
	
	//getter�޼��� : ��� ������ ���� �������� �ϴ� �޼���
	public int getHour() {
		return this.hour;//this�� ��ü �ڽ��� �ּҸ� ���ϰ� �ִ� �� ���������� ����.
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public float getSecond() {
		return this.second;
	}
	
	//setter �޼��� : ��������� ���� �����ϴ� �޼���
	public void setHour(int h) {
		if(h<0||h>23) {
			System.out.println("�ð��� �߸� �Է��ϼ̽��ϴ�.!");
			return;//����� ������� void�̱� ����
		}
		this.hour = h;
	}
	public void setMinute(int m) {
		if(m<0||m>59) {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.!");
			return;
		}
		this.minute = m;
	}
	public void setSecond(int s) {
		if(s<0||s>59) {
			System.out.println("�ʸ� �߸� �Է��ϼ̽��ϴ�.!");
			return;
		}
		this.second = s;
	}
	//objectŬ������ tostring �޼��� ������(�������̵�)��.
	//this �� ���� �ڱ� �ڽ��� �Ѥ������� �ǹ���.
	

	@Override
	public String toString() {
		String str = this.getHour() + ":"+this.getMinute()+":"+this.getSecond()+"���Դϴ�.";
		return str;
	}

	
	
	//���� source ���� generate ���� �ڵ� �ϼ�
	/*public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public float getSecond() {
		return second;
	}

	public void setSecond(float second) {
		this.second = second;
	}*/
	

	
	
	
	
	
	
	
	
	
	
	
	
}
