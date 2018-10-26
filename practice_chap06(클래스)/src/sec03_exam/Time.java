package sec03_exam;

public class Time {

	/*
	접근 제어자(Access Modifier)의 종류
	
	private		: 같은 클래스 내에서만 접근 가능함.
	protected	: 같은 패키지, 자손클래스에서만 접근 가능함.
	default		: 같은 패키지에서만 접근 가능함
	public 		: 누구나 다 접근 가능함
	*/
	
	
	private int hour;		//필드 값 (멤버변수)
	private int minute;
	private float second;
	
	//getter메서드 : 멤버 변수의 값을 가져가게 하는 메서드
	public int getHour() {
		return this.hour;//this는 객체 자신의 주소를 지니고 있는 것 참조변수와 동일.
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public float getSecond() {
		return this.second;
	}
	
	//setter 메서드 : 멤버변수의 값을 저장하는 메서드
	public void setHour(int h) {
		if(h<0||h>23) {
			System.out.println("시간을 잘못 입력하셨습니다.!");
			return;//안적어도 상관없다 void이기 때문
		}
		this.hour = h;
	}
	public void setMinute(int m) {
		if(m<0||m>59) {
			System.out.println("분을 잘못 입력하셨습니다.!");
			return;
		}
		this.minute = m;
	}
	public void setSecond(int s) {
		if(s<0||s>59) {
			System.out.println("초를 잘못 입력하셨습니다.!");
			return;
		}
		this.second = s;
	}
	//object클래스의 tostring 메서드 재정의(오버라이딩)함.
	//this 는 현재 자기 자신의 ㅡㄹ래스를 의미함.
	

	@Override
	public String toString() {
		String str = this.getHour() + ":"+this.getMinute()+":"+this.getSecond()+"초입니다.";
		return str;
	}

	
	
	//왼쪽 source 가서 generate 가서 자동 완성
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
