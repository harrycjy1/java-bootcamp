package sec03_map.exam02_userdefine_hashmap;

import java.util.Objects;

public class Student {

		private int sno;
		private String name;

		
		public int getSno() {
			return sno;
		}

		public String getName() {
			return name;
		}

		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			return this.sno==stu.sno && this.name.equals(stu.name);
		}
		return false;
		}
		
		@Override
		public int hashCode() {
	
		return Objects.hash(this.sno,this.name);
		}
		
		//2���� ���(���� ȣȯ���� ���ַ� �Ѵٸ� �̹���� ����)
		/*@Override
		public int hashCode() {
			return sno + name.hashCode()
		}*/
		
		
}
