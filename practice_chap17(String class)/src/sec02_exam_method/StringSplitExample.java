package sec02_exam_method;

public class StringSplitExample {

	public static void main(String[] args) {
		
		String animals = "dog/cat/bear";
		String animals1 = "dog/cat,bear&abc";
		
		//split메서드는 매개변수로 정규표현식이 온다. 하여
		//정규표현식을 가지고 문자열을 구분하여 String 배열을 리턴함.
		
		String[] arr = animals.split("/");
		String[] arr2 = animals1.split("/|,|&");
		
		
		//for each문은 배열의 값을 사용만 가능, 수정은 불가능 하다.
		for(String s : arr) {
			System.out.println(s);
		}
		
		for(String s : arr2) {
			System.out.println(s);
		}

	}

}
