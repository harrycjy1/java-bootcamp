package sec01_exam;

import java.util.Arrays;

public class Array_Example03 {
	

	public static void main(String[] args) {
		
		
		
		int[] iArr1=new int[10]; //현재 0으로 초기화중
		int[] iArr2=new int [10];
		int[] iArr3=new int[] {100, 95, 80, 70,60};
		int[] iArr4=new int[] {100, 95,80,70,60};
		
		char[] chArr=new char[] {'a','b','c','d'};
		
		
		System.out.println("배열 iArr1의 초기화 값: ");
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.println(iArr1[i]);
		}
		System.out.println();
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i]=i+1;
		}
		
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i]=(int)(Math.random()*10)+1;
			
		}
		
		for(int i=0; i<iArr1.length; i++) {
			if(i==9) {
				System.out.print(iArr1[i]);
			}
			else {
				System.out.print(iArr1[i]+".");
			}
			
		}
		
		System.out.println();
		//int[]타입에서 to.String()호출시 string형태로 반환
		
		System.out.println(Arrays.toString(iArr2));//[배열값,배열값...]형태로 출력
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(iArr4));
		//print{}메서드 안에 참조형 변수가 오면 기본적으로 객체이름@16진수가 나온다.
		//그리고 참조형변수(레퍼런스 변수)뒤에는 .toString()이 생략되어 있다.
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3.toString());//배열 내부주소 출력[@21335 ->타입@주소(16진수)
		System.out.println(iArr3);//참조변수는 자동으로 tostring을 호출한다.
		
		System.out.println(chArr.toString());
		//char 타입만 toString()을 호출해야 주소가 나오고,
		//toString을 호출하지 않으면 그냥 값들이 출력됨
		System.out.println(chArr.toString());
		System.out.println(chArr);
		
		

	}

}

