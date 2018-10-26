package sec01_list.exam01_ArrayList;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ArrayListEx03 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("신은혁");
		list.add("Java");
		list.add("JDBC");
		list.add(2,"오라클");
		list.add("신은비");
		list.add("신은혁");
		//list.add(15);
		
		int size = list.size();
		System.out.println("총 객체 수 :"+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2번 인덱스에 있는 객체 : "+skill);
		System.out.println();
		System.out.println("삭제 전");
		skill=list.get(0);
		System.out.println("0번 인덱스에 있는 객체 : "+skill);
		System.out.println();
		System.out.println("삭제 후");
		list.remove("홍길동");
		skill=list.get(0);
		System.out.println("0번 인덱스에 있는 객체 : "+skill);
		
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번 째 객체 : "+ list.get(i));
		}
		
		list.remove(2); //Java가 삭제됨
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번 째 객체 : "+ list.get(i));
		}
		
		//주어진 객체를 찾아 다 삭제하는 것이 아니라 젤 가까운 객체가 삭제됨
		list.remove("신은혁");
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번 째 객체 : "+ list.get(i));
		}
	}
}
