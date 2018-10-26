package sec03_array_sort;

import java.util.Arrays;
import java.util.Comparator;

public class SortExample {

	public static void main(String[] args) {
		
		int[] scores = new int[] {55,-9,8};
		//Arrays.sort()�� �⺻������ �������� �����̴�.
		Arrays.sort(scores); //����
		
		System.out.println(Arrays.toString(scores));
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"] = "+scores[i]);
		}
		System.out.println();
		
		//String �迭
		String[] names = new String[] {"�տ���","�ڵ���","���ȯ"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"] = "+names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		
		//����� ���� Ŭ���� �迭
		Member[] members = new Member[] {m1,m2,m3};
		
		//���������Ŭ������ sort�ϱ� ���ؼ��� Comparable<>�������̽��� �����ϰų�
		//Comparator<Member>�� �Ű������� �����ؾ� �Ѵ�.
		Arrays.sort(members, new Comparator<Member>() {
			
			@Override
			public int compare(Member o1,Member o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		
	
		
		Arrays.sort(members); //Comparator�Ⱦ��� �ϴ¹� ���ð���� ���� ������
		
		for(int i=0; i<members.length; i++) {
			System.out.println("members["+i+"] = "+members[i].name);
		}
		System.out.println();
		
		for(Member m : members) {
			System.out.println(m.name);
		}
		
		
	}

}
