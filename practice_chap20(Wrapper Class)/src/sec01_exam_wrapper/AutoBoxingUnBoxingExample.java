package sec01_exam_wrapper;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//Auto Boxing
		Integer obj = 100;
		Integer obj1 = new Integer(100);
		List<Integer> list = new Vector<Integer>(); //벡터는 기본적으로 10개방 생성
		list.add(100); // new Integer(100);
		list.add(obj);
		list.add(obj1);
		
		System.out.println("value : "+obj);
		System.out.println("value1 : "+obj1.intValue());
		System.out.println("value2 : "+list.get(0));
		System.out.println(list);
		
		//대입시 자동 언박싱(랩핑되어있는 100이 나와서 기본형에 저장되는 꼴)
		//int value = obj.intValue(); <--정확한 코딩코드
		int value =obj;
		System.out.println("value2 : "+value);
		
		//연산시 자동 언박싱
		//객체 + 기본형(원래 문법 에러이지만 Wrapper객체라서 컴파일러가 자동으로 언박싱해준다)
		int result = obj +100;
		System.out.println("result : "+result);

	}

}
