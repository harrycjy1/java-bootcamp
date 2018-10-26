package sec02_set.exam02_UserDefineHashSet;

import java.util.Objects;

public class Member {
	private String name;
	private int age;
	
	//������
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*
	 * ���� ��ü�� ������ ObjectŬ���������� ������ �ٽ� �����ϸ�,
	 * 1��° �ΰ�ü�� �ؽ��ڵ尪�� �������� ���� (hashcode������)
	 * 2��° �� ��ü�� �ʵ尪�� �� �������� ����(equals������)
	 * */
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			//Member�� �̸��� ���̰� ���ٸ� ���ü�� �ν��ϰ� true�� ������
			return member.name.equals(this.name) && member.age==this.age;
		}
		else {
			//�ƴϸ� ���ü�� �ƴ϶�� ���� false�� ����
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		//�̸��� ���̸� ������ �ؽ��ڵ带 ����� ������.
		return Objects.hash(this.name,this.age);
	}
	
	/*@Override
	public int hashCode() {
		return name.hashCode()+age;
	}*/
	
	
}
