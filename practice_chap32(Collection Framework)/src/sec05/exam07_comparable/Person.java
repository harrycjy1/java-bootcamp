package sec05.exam07_comparable;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	/*Comparable<>�� ������ �ִ� �߻�޼��带 �����Ǹ� �ؾ߸�
	 * treeSet�� ������������ ������ �ȴ� 
	 * �Ʒ��ǰ��� �ݴ�� �ϸ� ���������� �ȴ�.
	*/
	
	public int compareTo(Person o) {
		/*if(this.age<o.age)
			return -1;
		else if(this.age==o.age)
			return 0;
		else
			return 1;*/
		
		//return Integer.compare(this.age, o.age);
		return this.name.compareTo(o.name);
		
	}
	
	
}
