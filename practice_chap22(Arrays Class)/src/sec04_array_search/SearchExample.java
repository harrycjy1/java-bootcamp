package sec04_array_search;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		
		//�⺻Ÿ�԰� �˻�
		int[] scores = new int[]{1,88,100,99,97,98};
		
		//sort�� ���� ���� ������ �����Ѱ� �߻���.
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("���� ��");
		System.out.println("scores[] = "+Arrays.toString(scores));
		System.out.println("99�� �ִ� �ε��� : "+ index);
		
		Arrays.sort(scores);
		System.out.println("���� ��");
		System.out.println("scores[] = "+Arrays.toString(scores));
		index = Arrays.binarySearch(scores, 1);
		System.out.println("1�� �ִ� �ε��� : "+ index);
		System.out.println();
		
		//���ڿ� �˻�
		String[] names = {"ȫ�浿","�ڵ���","��μ�"};
		System.out.println("������");
		System.out.println("names[] = "+Arrays.toString(names));
		Arrays.sort(names);
		System.out.println("���� ��");
		System.out.println("names[] = "+Arrays.toString(names));
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ȫ�浿�� �ִ� �ε��� : "+index);
		System.out.println();
		
		//����� ���� ��ü �˻�
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] members = {m1,m2,m3};
		System.out.println("members ���� ��");
		for(int i=0; i<members.length; i++) {
			System.out.println("members["+i+"]�� �� : "+members[i].name);
		}
		Arrays.sort(members);
		System.out.println();
		
		System.out.println("members ���� ��");
		for(int i=0; i<members.length; i++) {
			System.out.println("members["+i+"]�� �� : "+members[i].name);
		}
		index = Arrays.binarySearch(members, m1);
		System.out.println("m1 �ν��Ͻ��� �ִ� �ε��� : "+index);
	}

}
