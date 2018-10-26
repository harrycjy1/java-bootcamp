package sec05.exam06_treemap_search;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample_Search {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> treemap = new TreeMap<>();
		
		//Map.Entry객체를 10개 무작위로 저장하지만, 저장될때는 이진트리 형식으로
		//알파벳의 유니코드에 의해 자동정렬이 이루어진다.
		treemap.put("apple", new Integer(10));
		treemap.put("forever", new Integer(60));
		treemap.put("f", new Integer(64));
		treemap.put("description", new Integer(40));
		treemap.put("ever", new Integer(50));
		treemap.put("zoo", new Integer(100));
		treemap.put("guess", new Integer(80));
		treemap.put("banana", new Integer(90));
		treemap.put("kdb", new Integer(80));
		treemap.put("lherry", new Integer(15));
		
		System.out.println("[c ~ f 사이의 단어 검색]");
		//c ~ f사이의 Map.Entry객체를 가져오게 subMap을 이용한다.
		NavigableMap<String, Integer> rangeMap = treemap.subMap("c",true, "f",true);
		//다시, rangeMap의 entrySet을 얻고 출력해본다.
		
		Set<Map.Entry<String, Integer>> entrySet = rangeMap.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : "+str +" - 페이지 : "+value);
		}
		System.out.println();
		
		//"k"를 포함하고 이후 값들만 가지는 Map.Entry객체를 리턴한다.
		System.out.println("[k 포함 이후 단어 검색]");
		NavigableMap<String , Integer> tailMap = treemap.tailMap("k",true);
		for(Map.Entry<String , Integer> entry : tailMap.entrySet()) {
		String str = entry.getKey();
		int value = entry.getValue();
		System.out.println("단어 : "+str +" - 페이지 : "+value);
		}
		System.out.println();
		
		//g만 포함하고 그 이전의 값들만 가지는 Map.Entry객체를 리턴
		
		System.out.println("[g 포함 이전 단어 검색]");
		NavigableMap<String , Integer> headMap = treemap.headMap("k",true);
		for(Map.Entry<String , Integer> entry : headMap.entrySet()) {
		String str = entry.getKey();
		int value = entry.getValue();
		System.out.println("단어 : "+str +" - 페이지 : "+value);
		}

	}

}
