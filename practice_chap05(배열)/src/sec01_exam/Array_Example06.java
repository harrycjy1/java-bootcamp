package sec01_exam;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Array_Example06 {

	public static void main(String[] args) {
		
		
		char[] abc=new char[] {'a','b','c','d'};
		char[] num=new char[] {'0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc); //char타입 배열은 toString 넣어야 주소값 부른다
		System.out.println(num);

		
		char[] result = new char[abc.length+num.length];
		
		
		//java.lang.system 클래스 API참조
		//abc : 원본배열, 0: abc배열의 0번째 인덱스, result: 타겟배열
		//0: 타겟배열의 인덱스 abc.length:4만큼 복사
		
		System.arraycopy(abc, 0, result, 0, abc.length);
	
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//배열 abc를 배열 num의 0번째 인덱스부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);//tostring붙이면 주소값나옴
		
		//number의 인덱스 6위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
		
		char[] newabc = new char[num.length-1];
		System.arraycopy(num, 0, newabc, 0, 4);
		System.arraycopy(num, 5, newabc, 4, num.length-6);
		System.out.println(newabc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
