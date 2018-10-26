package sec01_list.exam01_ArrayList;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		/*
		 * ArrayList�� ���� ���׸�Ÿ���̴�. �׷��� Warning�� ���
		 * ���� ���ְ� �ʹٸ� Quick Access���� Error�� �Է��ϰ� preference�� ����
		 * Generics�ǿ� �ִ� ���� ��� ignore�� �ٲٸ�ȴ�
		 */
		ArrayList list = new ArrayList(); //�⺻������ 10���� ���� ������
		
		
		System.out.println("�� ũ�� : "+ list.size()); //size�� �迭�� length�ʹ� ���� �ٸ� 
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");
		System.out.println(list.hashCode());
		list.add(333);
		System.out.println(list.hashCode()); //������ �߰��ӿ��� �ּҰ� �ٲ�� ����??
		System.out.println("�� ũ�� : "+list.size());
		System.out.println("ArrayList�� �ִ°� : "+ list);
		System.out.println("ArrayList �ּ� : "+ list.hashCode());
		
		//0��° �ε����� ���� ���� ������ ������ ������ �ڷ� �з����� �ȴ�.
		list.add(0,"333");
		System.out.println("ArrayList�� �ִ°� : "+ list.toString());
		System.out.println("ArrayList �ּ� : "+ list.hashCode()); //�ּҰ� ������� Ȯ��
		
		//�տ������� �˻��Ͽ� "333"�� �����Ѵ�(������ �Ѱ��� ����
		//boolean remove(Object o)
		list.remove("333");
		System.out.println("ArrayList�� �ִ� �� : "+ list.toString());
		System.out.println(list.remove("333"));
		
		//indexOf()�� ����� -1�̶�� ���� AarrayList�� "333"�� ���ٴ� ���̴�.
		System.out.println("ArrayList�� �ִ� �� : "+ list.toString());
		System.out.println("index = "+list.indexOf("333"));
		
		//�⺻������ 10���� ���� �Ѿ�� �Ǵٽ� 10���� ���� �����.
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
		System.out.println("�� ũ�� : "+ list.size());*/
		
		//ArrayList�� �� �ε����� �� ����(set(index, Object))�̿�
		for(int i=0; i<list.size(); i++) {
			list.set(i, i+"");
		}
		System.out.println(list.hashCode());
		//ArrayList�� �� �ε����� �� ���(get(index)�̿�)
		System.out.print("{");
		for(int i=0; i<list.size(); i++) {
			if(i==list.size()-1) {
				System.out.print(list.get(i));
			}
			else
				System.out.print(list.get(i)+",");
		}
		System.out.println("}");
		
		//ArrayList�� �� �ε����� �� ���� remove(index)�̿�
		for(int i=0; i<list.size(); i++) {
			list.remove(i);
		}
		
		System.out.println(list);
		/*
		 * �� ������ �������� �Ұ��ϰ� 1,3�� ���� �ִ�. ���ϱ�?
		 * 0�� ������ ���� i�� 0�̴� �翬�� ������ �ȴ�. ������,
		 * 0�� ������ �� �ڿ� ������ �� ������ ����� �ð��̴�. 
		 * �׷� �������� �����ҷ��� ���� i���� 1�̴�. �Ͽ� 1�� �������� �ʰ�
		 * 2�� �����ϴ� ���̴�. �׸����� �׷����� �� ���ذ� �� ���̴�.
		 * ���ذ� �Ǿ����� ArrayList�� �ε����� �ڿ������� ������
		 * �ؾ� ����� ������ ���� �˼� �ִ�.
		 * */
		
		//�Ʒ��� ���� ������ �ϸ� ArrayIndexOutofBoundsException�� �߻��Ѵ�. ���ϱ�?
		/*for(int i=list.size(); i>=0; i--) {
			list.remove(i);
		}*/
		
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		//list.clear(); //Ŭ��� ���� �ѹ濡 ����
		System.out.println(list);
	}

}
