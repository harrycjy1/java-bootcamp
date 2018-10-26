package sec03_map.exam02_userdefine_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//키로  Student(사용자 정의 객체), 값으로 Integer를 사용
		Map<Student, Integer> map = new HashMap<>();
		/*아래 두개의 Map.entry는 동등객체가 된다. 키로사용된 Student객체의 sno와, name의 값이 같다.
		 * 하여 마지막에 저장된 값으로 대체 된다.
		 * 하지만 hashcode()와 equals를 재정의 하지 않았다면,
		 * 다른객체로 인식하여 저장된다.
		 */
		map.put(new Student(1, "홍길동"), 90);
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "신은혁"), 100);
		map.put(new Student(3, "김주성"), 58);
		
		System.out.println("총 Entry 수 : "+ map.size());
		System.out.println("홍길동  : "+ map.get(new Student(1, "홍길동")));
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			Student key = iter.next();
			System.out.println("Student(sno) : "+key.getSno()+", "+"Student(name) : "+key.getName()+", "+
			"Integer : "+map.get(new Student(key.getSno(), key.getName())));
		}
		
		
		//Map.Entry로 얻어보고 코딩해봐라(집에 가서)
		

	}

}
