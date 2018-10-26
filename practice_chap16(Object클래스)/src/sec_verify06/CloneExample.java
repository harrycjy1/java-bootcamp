package sec_verify06;

import java.util.Arrays;

public class CloneExample {

	public static void main(String[] args) {
		
			Student s1 = new Student("perpear","안경잡이");
			
			
			Student s2 = s1.getStudent();
			
			//기본형,String의 경우 주소값를 참조하고 있는것이 아니기 때문에
			//복사된 인스턴스의 값을 바꿔도 복사 전 인스턴스의 값에 영향을 주지 않는다. 
			
			System.out.println("Student인스턴스1 :"+s1.toString());
			System.out.println("Student인스턴스2를 Student인스턴스1으로 얕은 복제를 함");
			System.out.println("Student인스턴스2 :"+s2.toString());
			

	}

}
