	package sec_verify11;
	
	import java.util.Objects;
	
	public class Student {
	
		private int 		studentNum;
		private String 		name;
		
		public Student (int num, String str) {
			this.studentNum=num;
			this.name=str;
		}
	
		public int getStudentNum() {
			return studentNum;
		}
	
		public String getName() {
			return name;
		}
		
		@Override
		public int hashCode() {
			
			return Objects.hash(this.studentNum);
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student stu = (Student)obj;
			return stu.getName().equals(this.name) || stu.getStudentNum()==this.studentNum;
					}
			else
			return false;
		}
		
	}
