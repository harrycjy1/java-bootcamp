package sec02_exam_final;

public class PersonExample {

	public static void main(String[] args) {
		
		
			//�Ű������� �ִ� �����ڸ� ȣ���ϴ� ��!
			Person p1 = new Person("123456-1234567", "���");
			
			System.out.println(p1.ssn);
			System.out.println(p1.nation);
			System.out.println(p1.name);
			
			//p1.nation = "usa"; 			����� Korea ����Ǿ� ����.(����� �Һ�)
			//p1.ssn = "654321-7654321";	���� 123456-1234567�� ����� ����.(����� �Һ�)
			p1.name = "��������";
			
			
			
			
	}

}
