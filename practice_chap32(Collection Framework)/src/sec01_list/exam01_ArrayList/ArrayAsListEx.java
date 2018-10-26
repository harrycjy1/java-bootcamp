package sec01_list.exam01_ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {

	public static void main(String[] args) {
		
		//aslist()는 컬렉션이 아니라 배열형식으로 된 컬렉션을 리턴한다.
		List<String> list1 = Arrays.asList("홍길동","이준호","김기리");
		
		//아래와 같이 객체 추가/삭제하면 예외 발생
		//list1.add("dfdf");
		//list1.remove(0);
		
		for(String str : list1)
			System.out.println(str);

		
		System.out.println();
		
		//원래 이렇게 해야 정상
		//List<Integer> list2 = Arrays.asList(new Integer(100), new Integer(200), new Integer(300));
		
		List<Integer> list2 = Arrays.asList(100,200,300);
		
		Integer[] arr = (Integer[]) list2.toArray();
		for(int value : arr)
			System.out.println(value);
		
		System.out.println();
		//자동 언박싱
		for(int value : list2)
			System.out.println(value);
	}

}
