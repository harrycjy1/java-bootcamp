package sec01_exam_objects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

class Member implements Comparable<Member>{

	
	int score;
	String name;
	
	//������
	public Member(int score, String name) {
		this.score=score;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return this.score +", "+this.name;
	}
	
	//�Ʒ��� ���� ��ü�� ���� ������ �������ָ� Arrays.sort�޼��忡����
	//�� ���� ������ �޾ƿͼ� ������ �Ѵ�. �װ� Comparable�̵� Comparator�̵�..
	
	@Override
	public int compareTo(Member o) {
		
		/*if(o.score < this.score) 
			return -1;
		else if(o.score==this.score)
			return 0;
		else 
			return 1;*/
		
		System.out.println(this.score + " : "+o.score);
		return this.score-o.score;			//��������
		//return o.score-this.score;		//��������
		//return (this.score-o.score)*-1;	//��������
		
	}

	
	

}

class NameAsceding implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		//return o1.name.compareTo(o2.name); //���ڿ��� ���������� ���������Ѵ�.
		
		return o2.name.compareTo(o1.name); //���ڿ��� ���������� �������� �Ѵ�.
		//return o2.score - o1.score;
	}
}

	/*����� Comparable�� �⺻ ���ı����� �����ϴµ� ����� �Ѵ�(compareTo()�޼��� ������)
	������ Comparator�� �⺻ ���ı��ظ��� �ٸ� �������� �����ϰ��� �� �� ����Ѵ�.
	(compare()�޼��� ������)*/

public class ComparableVsComparator{
	
	public static void main(String[] args) {
		//��ü�迭 ����
		Member[] mem = {
								new Member(100,"abc"),new Member(300,"aaa"),
								new Member(400,"ccc"),new Member(200,"bbb")
				
		};
		
		
		//������ ��.
		Member m1 = new Member(3,"�����");
		Member m2 = new Member(2,"�谭��");
		Member[] mem1 = {m1,m2};
		
		Arrays.sort(mem1); 	//Arrays.sort()�޼���� �Ű����� �迭���� �⺻�� Ÿ���̸� �⺻������ �������� ������ �̷����
							//�Ű����� Comparable<>�������̽��� �����ߴٸ� compareTo()�� ���ϰ����� ������ �����Ѵ�.
		
		System.out.println(Arrays.toString(mem1));
		
		
		System.out.println("Objects.compare()���� ȣ�� : "+Objects.compare(m1, m2, new NameAsceding()));
		
		
		
		
		//����� �ϴµ� ClassCastException �� �߻��� ������ Comparable �������̽���
		//MemberŬ������ �̱����߱� ������ �߻��ϴ� ���̴�.
		Arrays.sort(mem);
		System.out.println(Arrays.toString(mem));
		
		//���� ������ NameAsceding�ν��Ͻ��� �����ϰ� �ִ�.
		Arrays.sort(mem, new NameAsceding());
		System.out.println(Arrays.toString(mem));

	}
	
	
}
	
	