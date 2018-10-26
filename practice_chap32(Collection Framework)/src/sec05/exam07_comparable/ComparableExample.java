package sec05.exam07_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		//Person이라는 사용자정의 클래스를 저장하는 treeSet을 생성
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("신은혁",9));
		treeSet.add(new Person("홍길동",35));
		treeSet.add(new Person("손연재",19));
		treeSet.add(new Person("김기수",19));
		treeSet.add(new Person("박연수",25));
		treeSet.add(new Person("손은정",21));
		treeSet.add(new Person("손민수",29));
		treeSet.add(new Person("김춘자",51));
		treeSet.add(new Person("박길후",61));
		
		
		//오름차순 정렬이된것을 아래와 같이 확인할 수 있다.
		System.out.println("총 객체수 : "+treeSet.size());
		
		/*for(Person person: treeSet) {
			String str = person.getName();
			int age = person.getAge();
			System.out.println("이름 : "+str+", 나이 : "+age);
		}*/
		
		Iterator<Person> iter = treeSet.iterator();
		while(iter.hasNext()) {
			Person person = iter.next();
			int age=person.getAge();
			String str = person.getName();
			
			System.out.println("이름 : "+str+", 나이 : "+age);
		}

	}

}
