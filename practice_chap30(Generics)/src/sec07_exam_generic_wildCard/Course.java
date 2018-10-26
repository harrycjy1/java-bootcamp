package sec07_exam_generic_wildCard;

public class Course<T> {
		
		private String name;
		private T[] students;
		
		//������
		public Course(String name, int capacity) {
			this.name = name;
			//�̰� �ȵȴ� ���� TŸ���� ���� �ȵǾ��µ� �迭�� ����� �ֳ���?
			//this.students = new T[capacity];
			//�� �κ� ���� ���� �����ؾ��� �̷��ڵ� ���� ����.
			this.students = (T[]) (new Object[capacity]);
			
		}
		
		//������ getter
		public String getName() {
			return this.name;
			
		}
		
		public T[] getStudents() {
			return this.students;
		}
		
		//�������� �߰� ������
		public void add(T t) {
			for(int i=0; i<this.students.length; i++) {
				if(students[i]== null) {
					students[i]=t;
					break;
				}
		}
	}
}

