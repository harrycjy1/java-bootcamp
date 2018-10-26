package sec07_exam_generic_wildCard;

public class Course<T> {
		
		private String name;
		private T[] students;
		
		//생성자
		public Course(String name, int capacity) {
			this.name = name;
			//이거 안된다 아직 T타입이 결정 안되었는데 배열을 만들수 있나요?
			//this.students = new T[capacity];
			//이 부분 필히 보고 숙지해야함 이런코드 자주 등장.
			this.students = (T[]) (new Object[capacity]);
			
		}
		
		//과정명 getter
		public String getName() {
			return this.name;
			
		}
		
		public T[] getStudents() {
			return this.students;
		}
		
		//수강생을 추가 시켜줌
		public void add(T t) {
			for(int i=0; i<this.students.length; i++) {
				if(students[i]== null) {
					students[i]=t;
					break;
				}
		}
	}
}

