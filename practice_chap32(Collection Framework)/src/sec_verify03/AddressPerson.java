package sec_verify03;

import java.util.ArrayList;

public class AddressPerson {

	private ArrayList<Person> 	db;
	
	public AddressPerson() {
		db = new ArrayList<>();
		System.out.println("�����ͺ��̽��� ���� �Ǿ����ϴ�!");
	}
	
	public int check(String name) {
		for(int i =0; i<db.size(); i++) {
			if(name.equals(db.get(i).getName()))
				return i;
		}
		
		return -1;
	}
	
	
	public void insert(Person p) {
		if(check(p.getName())==-1)
		db.add(p);
		
		else
		System.out.println("���ڹٴ��� �̹� ��ϵ� ȸ���Դϴ�.");
		
		
		
	}

	public void print() {
		System.out.println("���� ������Ʈ�Դϴ�.");
		System.out.println("---------------------------------------------------------");
		for(int i=0; i<db.size(); i++) {
			System.out.println("�̸� : "+db.get(i).getName()+", ���� : "+db.get(i).getAge()+", ����ó : "+db.get(i).getHandPhone());
		}
		System.out.println("---------------------------------------------------------");
		System.out.println();
	}
	
	public void delete(String name) {
		if(check(name)==-1)	
		System.out.println(name+"��� ���� �����ϴ�.");
		else
		db.remove(check(name));
	}
	
	public void update(String name, Person p) {
		System.out.println(name+"�� ������ ������Ʈ�Ͽ����ϴ�.");
		
		if(check(name)==-1)
				System.out.println(name+"�̶�� ���� �̸��� �����ϴ�.");
		else		
		db.set(check(name), p);
		
		System.out.println();
		
	}
	
}
