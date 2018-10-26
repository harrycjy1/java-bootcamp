package sec_verify01;

public class MathMethodExample {

	public static void main(String[] args) {
		double	number = -2.78987434;
		System.out.println("number의 절대값 :"+Math.abs(number));
		System.out.println("number의 올림값 :"+Math.ceil(number));
		System.out.println("number의 내림값 :"+Math.floor(number));
		System.out.println("9.0 의 제곱근 :"+Math.pow(9.0, 1.0/2.0));
		System.out.println("PI의 가까운 정수 :"+Math.rint(Math.PI));
		System.out.print("이번주 행운의 로또 번호는 ");
		for(int i=0; i<6; i++) {
		int a = (int) (Math.random()*100);
		System.out.print(a+" ");
		}
		System.out.println("입니다.");
		
	}

}
