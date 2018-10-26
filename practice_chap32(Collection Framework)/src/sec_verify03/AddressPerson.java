package sec_verify03;

import java.util.ArrayList;

public class AddressPerson {

	private ArrayList<Person> 	db;
	
	public AddressPerson() {
		db = new ArrayList<>();
		System.out.println("데이터베이스가 생성 되었습니다!");
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
		System.out.println("감자바님은 이미 등록된 회원입니다.");
		
		
		
	}

	public void print() {
		System.out.println("현재 고객리스트입니다.");
		System.out.println("---------------------------------------------------------");
		for(int i=0; i<db.size(); i++) {
			System.out.println("이름 : "+db.get(i).getName()+", 나이 : "+db.get(i).getAge()+", 연락처 : "+db.get(i).getHandPhone());
		}
		System.out.println("---------------------------------------------------------");
		System.out.println();
	}
	
	public void delete(String name) {
		if(check(name)==-1)	
		System.out.println(name+"라는 고객은 없습니다.");
		else
		db.remove(check(name));
	}
	
	public void update(String name, Person p) {
		System.out.println(name+"씨 정보를 업데이트하였습니다.");
		
		if(check(name)==-1)
				System.out.println(name+"이라는 고객의 이름은 없습니다.");
		else		
		db.set(check(name), p);
		
		System.out.println();
		
	}
	
}
