package sec05.exam01_treeset_method;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//TreeSet�� ����Ʈ���� ������� �̷���� �÷����̸�, Set�������̽��� ������ ��ü�̴�.
		//�׷��� Set�������̽��� �����Ͽ� �� �� ������, ���� TreeSet�� ��ü�� ���� �� �˻��� ���� 
		//���Ǿ� �׿� Ưȭ�� �޼��带 ����ϱ� ���� TreeSetŬ������ ���� �����Ͽ� �����ϵ��� �Ѵ�.
		TreeSet<Integer> scores = new TreeSet<>();
		
		//�Ʒ��� ���� �߰��Ǿ�����, ����Ʈ���� �׸��� ������ �ǳ�
		scores.add(new Integer(87)); //scores.add(87)
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		//���� ���� ���� ���ϱ�(����Ʈ�� ���� ������ ��)
		score = scores.first();
		System.out.println("���� ���� ���� : "+ score);
		//������� ���� ���ϱ�(����Ʈ���� ���� �����U�� ��
		score = scores.last();
		System.out.println("���� ���� ���� : "+ score);
		//�־��� ��ü�� ���ʿ� �ִ� ����(95�� �Ʒ� ����) --�־��� ��ü ������
		score = scores.lower(new Integer(95));
		System.out.println("95�� �Ʒ� ���� (���� ���) : "+ score);
		//�־��� ��ü�� �����ʿ� �ִ� ����(95�� �� ����)
		score = scores.higher(new Integer(95));
		System.out.println("95�� �� ���� (������ ���) : "+score);
		//�־��� ��ü�� �����Ͽ� �ٷ� �Ʒ��� ������ ��ȯ -- �־��� ��ü ����
		score = scores.floor(new Integer(95));
		System.out.println("95���̰ų� �ٷ� �Ʒ��� ���� : "+score);
		
		//�־��� ��ü�� �����Ͽ� �ٷ� ���� ������ ��ȯ -- �־�����ü ����
		score = scores.ceiling(new Integer(85));
		System.out.println("85���̰ų� �ٷ� ���� ���� : "+score);
		System.out.println();
		
		//�÷��ǿ� �����Ͱ� �ִٸ�
		/*while(!scores.isEmpty()) {
			//���� ���� ��ü���� �����´� ��, ������ �� treeset���� ���Ű� �ȴ�
			score = scores.pollFirst();
			System.out.println(score+"(���� ��ü �� : "+scores.size()+")");
		}
		
		while(!scores.isEmpty()) {
			//���� ������ ��ü���� �����´� ��, ������ �� treeset���� ���Ű� �ȴ�
			score = scores.pollLast();
			System.out.println(score+"(���� ��ü �� : "+scores.size()+")");
		}*/
		
		//�ݺ��ڸ� ��´�
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			//pollfirst()�� ���� ����� �������� ������ �������� ��ü�� ���������ʴ´�
			//remove�� ����� ��μ� ���Ű� ��
			int value = iterator.next();
			//iterator.remove(); remove����� ���ŵ�
			System.out.println(value+"(���� ��ü �� : "+scores.size()+")");
		}
	}

}
