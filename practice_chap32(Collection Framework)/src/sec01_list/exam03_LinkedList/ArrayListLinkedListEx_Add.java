package sec01_list.exam03_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class ArrayListLinkedListEx_Add {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		LinkedList<String> ll = new LinkedList<>();
		
		System.out.println("= ���������� �߰��ϱ� =");
		System.out.println("ArrayList : "+add1(al));
		System.out.println("LinkedList : "+add1(ll));
		System.out.println();
		System.out.println("= �߰��� �߰��ϱ� = ");
		System.out.println("ArrayList(�迭����߻�) : "+add2(al));
		System.out.println("LinkedList(��尪 ����) : "+add2(ll));
		System.out.println();
		System.out.println("= �߰����� �����ϱ� =");
	    System.out.println("ArrayList(�迭����߻�) :"+remove2(al));
	    System.out.println("LinkedList(��尪 ����) :"+remove2(ll));
	    System.out.println();
	    System.out.println("= ���������� �����ϱ� =");
	    System.out.println("ArrayList :"+remove1(al));
	    System.out.println("LinkedList :"+remove1(ll));


	}
	
	//������ ������ �߰�
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) 
			list.add(i+"");
		
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	//������� ������ �߰�
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list.add(500, "X");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	//������ ������ ����
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	//������� ������ ����
	public static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000;i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

}
