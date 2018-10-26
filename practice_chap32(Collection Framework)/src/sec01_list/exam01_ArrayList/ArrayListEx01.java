package sec01_list.exam01_ArrayList;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		/*
		 * ArrayList는 원래 제네릭타입이다. 그래서 Warning이 뜬다
		 * 굳이 없애고 싶다면 Quick Access에서 Error를 입력하고 preference에 가서
		 * Generics탭에 있는 것을 모두 ignore로 바꾸면된다
		 */
		ArrayList list = new ArrayList(); //기본적으로 10개의 방을 생성함
		
		
		System.out.println("총 크기 : "+ list.size()); //size는 배열의 length와는 조금 다름 
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");
		System.out.println(list.hashCode());
		list.add(333);
		System.out.println(list.hashCode()); //순차적 추가임에도 주소가 바뀌는 이유??
		System.out.println("총 크기 : "+list.size());
		System.out.println("ArrayList에 있는값 : "+ list);
		System.out.println("ArrayList 주소 : "+ list.hashCode());
		
		//0번째 인덱스에 새로 값을 넣으면 기존의 값들은 뒤로 밀려나게 된다.
		list.add(0,"333");
		System.out.println("ArrayList에 있는값 : "+ list.toString());
		System.out.println("ArrayList 주소 : "+ list.hashCode()); //주소가 변경됨을 확인
		
		//앞에서부터 검색하여 "333"을 삭제한다(가까운것 한개만 삭제
		//boolean remove(Object o)
		list.remove("333");
		System.out.println("ArrayList에 있는 값 : "+ list.toString());
		System.out.println(list.remove("333"));
		
		//indexOf()의 결과가 -1이라는 것은 AarrayList에 "333"이 없다는 것이다.
		System.out.println("ArrayList에 있는 값 : "+ list.toString());
		System.out.println("index = "+list.indexOf("333"));
		
		//기본적으로 10개의 방을 넘어서면 또다시 10개의 방을 만든다.
		/*list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		list.add("111");
		System.out.println("총 크기 : "+ list.size());*/
		
		//ArrayList의 각 인덱스의 값 저장(set(index, Object))이용
		for(int i=0; i<list.size(); i++) {
			list.set(i, i+"");
		}
		System.out.println(list.hashCode());
		//ArrayList의 각 인덱스의 값 출력(get(index)이용)
		System.out.print("{");
		for(int i=0; i<list.size(); i++) {
			if(i==list.size()-1) {
				System.out.print(list.get(i));
			}
			else
				System.out.print(list.get(i)+",");
		}
		System.out.println("}");
		
		//ArrayList의 각 인덱스의 값 삭제 remove(index)이용
		for(int i=0; i<list.size(); i++) {
			list.remove(i);
		}
		
		System.out.println(list);
		/*
		 * 다 삭제를 했음에도 불고하고 1,3이 남아 있다. 왜일까?
		 * 0을 삭제할 때는 i가 0이니 당연히 삭제가 된다. 하지만,
		 * 0이 삭제된 후 뒤에 값들은 다 앞으로 당겨져 올것이다. 
		 * 그럼 다음것을 삭제할려고 보니 i값은 1이다. 하여 1을 삭제하지 않고
		 * 2를 삭제하는 것이다. 그림으로 그려보면 잘 이해가 될 것이다.
		 * 이해가 되었으면 ArrayList는 인덱스를 뒤에서부터 삭제를
		 * 해야 제대로 삭제가 됨을 알수 있다.
		 * */
		
		//아래와 같이 삭제를 하면 ArrayIndexOutofBoundsException이 발생한다. 왜일까?
		/*for(int i=list.size(); i>=0; i--) {
			list.remove(i);
		}*/
		
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		//list.clear(); //클리어를 쓰면 한방에 정리
		System.out.println(list);
	}

}
