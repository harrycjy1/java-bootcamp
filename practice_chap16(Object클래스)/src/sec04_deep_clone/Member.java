package sec04_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable{ //��ü�� ������ ���ؼ� Cloneable�������̽��� �ݵ�� �����ؾ���

	
	String name;
	int age;
	int[] scores = null;//����Ÿ��
	Car car = null;
	
	//������
	public Member(String name,int age,int[] scores,Car car) {
		this.name=name;
		this.age=age;
		this.car=car;
		this.scores=scores;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//���� ��������(Object�� clone()�޼��带 ���� ȣ��)
		Member cloned = (Member)super.clone();//this.clone�ϸ� �����÷ο��
		//Arrays.copyof�� ���� �迭�� ���̸�ŭ ������.
		//����Ÿ���� ���� �ݵ�� ���α׷��Ӱ� �����Ǵ� �ڵ带 ������ ����� �Ѵ�.
		//String�� ���� �⺻��ó�� ���.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	
	
	public Member getMember() {
		Member cloned =null;
		
		try {
			cloned = (Member)this.clone();//�������̵��� Ŭ���� ȣ�� super.clone�� ������Ʈ�� clone�� ȣ��
		}
		catch(CloneNotSupportedException e) {}
		
		return cloned; 
	}
	
	
	
	
	
}
