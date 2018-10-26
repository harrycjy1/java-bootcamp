package sec01_arrayCopy;

import java.util.Arrays;



public class ArrayCopyExample {

	public static void main(String[] args) {
		
			char[] arr1 = {'J','A','V','A'};
			long start;
			long end;
			//방법 1
			start = System.nanoTime();
			System.out.println();
			char[] arr2 = Arrays.copyOf(arr1, arr1.length);
			end = System.nanoTime();
			//보기 좋게 toString이 오버라이딩 되어 있다.
			System.out.println("arr2 = "+Arrays.toString(arr2));
			System.out.println(end-start);
			System.out.println();
			
			//방법 2
			//copyOfRange(원본배열,시작인덱스,끝인덱스)
			start = System.nanoTime();
			char[] arr3 = Arrays.copyOfRange(arr1, 0, 4);
			end = System.nanoTime();
			System.out.println("arr3 = "+Arrays.toString(arr3));
			System.out.println(end-start);
			System.out.println();
			
			//방법3
			char[] arr4 = new char[arr1.length];
			start = System.nanoTime();
			System.arraycopy(arr1, 0, arr4, 0, arr1.length);
			end=System.nanoTime();
			System.out.println("arr4 = "+Arrays.toString(arr4));
			System.out.println(end-start);
			System.out.println();
			
			//반복문을 이용한 출력
			start = System.nanoTime();
			for(int i=0; i<arr4.length; i++) {
				System.out.println("arr4["+i+"] = "+arr4[i]);
			}
			end=System.nanoTime();
			System.out.println(end-start);
			System.out.println();
			
			//향상된 for문 이용
			start=System.nanoTime();
			for(char j : arr4) {
				System.out.println("arr4["+j+"] = "+j);
			}
			end=System.nanoTime();
			System.out.println(end-start);
			System.out.println();
		
	}

}
