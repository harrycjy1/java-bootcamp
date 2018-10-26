package sec01_exam;

public class StringEqualsEx {

	public static void main(String[] args) {
	
		
		
	String strVar1="신민철";
	String strVar2="신민철";//new가 없음 literal값임
	String strVar3=new String("신민철");
	
	System.out.println("--------------");
	

	System.out.println(strVar1==strVar2); //(자바에선 String의 리터럴이 같을경우, 같은 번지 참조)
	System.out.println(strVar1==strVar3); //주소값 비교(strVar3는 새로 객체를 생성했으므로 주소가 다름)
	System.out.println();
	
	System.out.println(strVar1.equals(strVar2));
	System.out.println(strVar1.equals(strVar3));
	//값을 가지고 비교(신민철이라는 글자)
	//equals는 비교 대상과 값이 같은지를 비교함(String에선)
	//(Object의 equals는 객체의 주소값 비교임(String이랑 다름))
	}

}
