package sec_verify06;

import java.util.Arrays;

public class CloneExample {

	public static void main(String[] args) {
		
			Student s1 = new Student("perpear","�Ȱ�����");
			
			
			Student s2 = s1.getStudent();
			
			//�⺻��,String�� ��� �ּҰ��� �����ϰ� �ִ°��� �ƴϱ� ������
			//����� �ν��Ͻ��� ���� �ٲ㵵 ���� �� �ν��Ͻ��� ���� ������ ���� �ʴ´�. 
			
			System.out.println("Student�ν��Ͻ�1 :"+s1.toString());
			System.out.println("Student�ν��Ͻ�2�� Student�ν��Ͻ�1���� ���� ������ ��");
			System.out.println("Student�ν��Ͻ�2 :"+s2.toString());
			

	}

}
