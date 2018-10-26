package sec05.exam04_treemap_method;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		//키로  Integer 값으로 String
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		//map객체 5개를 무작위로 저장했지만, treemap의 이진트리에 의해서
		//자동정렬이 된다.
		scores.put(87, "홍길동");
		scores.put(98, "신은혁");
		scores.put(75, "김연아");
		scores.put(95, "손연재");
		scores.put(80, "김삼순");
		
		Map.Entry<Integer, String> entry = null;
		
		//가장낮은점수
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : "+ entry.getKey()+ " - "+entry.getValue());
		System.out.println();
		
		//가장 높은 점수
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : "+entry.getKey()+" - "+entry.getValue());
		System.out.println();
		
		//이진트리 중 주어진 객체 즉, 95점보다 작은 Entry를 리턴한다. (95점을 포함하지 않는다.)
		entry = scores.lowerEntry(95);
		System.out.println("95점 바로 아래점수 (미포함) : "+entry.getKey() +" - "+ entry.getValue());
		System.out.println();
		
		entry=scores.higherEntry(95);
		System.out.println("95점 바로 위 점수(미포함) :"+entry.getKey() +" - "+ entry.getValue());
		System.out.println();
		
		entry = scores.floorEntry(95);
		System.out.println("95점 바로 아래점수 (포함) : "+entry.getKey() +" - "+ entry.getValue());
		System.out.println();
		
		entry=scores.ceilingEntry(95);
		System.out.println("95점 바로 위 점수(포함) :"+entry.getKey() +" - "+ entry.getValue());
		System.out.println();
		
		/*while(!scores.isEmpty()) {
			//역시 treeset과 유사하게 pollFirstEntry()는 treemap에서
			//가장 낮은 점수 entry를 가져오고 map에서 제거한다. 올림차순
			entry = scores.pollFirstEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 : "+value+" - "+"값 : "+str+"(남아있는 객체수 : "+ scores.size()+")");
		}*/
		
		/*while(!scores.isEmpty()) {
			//역시 treeset과 유사하게 pollLastEntry()는 treemap에서
			//가장 낮은 점수 entry를 가져오고 map에서 제거한다. 내림차순
			entry = scores.pollLastEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 : "+value+" - "+"값 : "+str+"(남아있는 객체수 : "+ scores.size()+")");
		}*/
		
		//treeMap에대한 keySet을 얻고, 반복자를 얻은 후 전체 객체를 출력해봄
		//위와 차이가 있는것은 객체 제거가 일어나지 않음
		
		/*Set<Integer> keySet = scores.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);
			//명시적으로 호출함으로써  treemap에서 제거를 할 수가 있다.
			//iterator.remove();
			System.out.println("키 : "+value+" - "+"값 : "+str+"(남아있는 객체수 : "+ scores.size()+")");
		}
		*/
		
		Set<Map.Entry<Integer, String>> entrySet = scores.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> mapentry = iterator.next();
			int value = mapentry.getKey();
			String str = mapentry.getValue();
			//iterator.remove();
			System.out.println("키 : "+value+" - "+"값 : "+str+"(남아있는 객체수 : "+ scores.size()+")");
		}
		
		
		
		

	}

}
