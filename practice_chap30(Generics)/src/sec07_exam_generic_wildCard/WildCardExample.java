package sec07_exam_generic_wildCard;

import java.util.Arrays;

public class WildCardExample {

	//Course<T>�� ���׸�Ÿ������ ����� �κп� ?�� ���� ��� ��ü�� ���� �������
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "������ : "+Arrays.toString(course.getStudents()));
	}
	//Course<T>�� ���׸�Ÿ������ ����� �κп� ?extends Students�� ���� , Students������ ���� Ŭ������ ��ü�� ����
	
	public static void registerCourseStudent(Course<? extends Student>course) {
		System.out.println(course.getName() + "������ : "+Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker>course) {
		System.out.println(course.getName() + "������ : "+Arrays.toString(course.getStudents()));
	}
	
	
	public static void main(String[] args) {
		
		//���� �����ϱ����� ������� Ŭ�������� ��Ӱ������� �׷�����.
		
		registerCourse(new Course<Person>("�Ϲ��� ����",5));
		registerCourse(new Course<Student>("�л� ����",5));
		registerCourse(new Course<Worker>("�ٷ��� ����",5));
		registerCourse(new Course<HighStudent>("�����л� ����",5));
		System.out.println();
		
		//registerCourseStudent(new Course<Person>("�Ϲ��� ����",5));
		registerCourseStudent(new Course<Student>("�л�����",5));
		//registerCourseStudent(new Course<Worker>("�ٷ��� ����",5));
		registerCourseStudent(new Course<HighStudent>("�����л� ����",5));
		System.out.println();
		
		registerCourseWorker(new Course<Person>("�Ϲ��� ����",5));
		//registerCourseWorker((new Course<Student>("�л� ����",5));
		registerCourseWorker(new Course<Worker>("�ٷ��� ����",5));
		//registerCourseWorker(new Course<HighStudent>("�����л� ����",5));
		System.out.println();
		
		System.out.println("���� ������ �߰�");
		
		//2. ���� Course�����ؼ� Ȯ���ϴ� ����
		
		Course<Person> personCourse = new Course<>("�Ϲ��� ����",4);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Person("������"));
		personCourse.add(new Person("�л�"));
		personCourse.add(new Person("�����л�"));
		
		Course<Worker> workerCourse = new Course<>("������ ����",3);
		workerCourse.add(new Worker("��ƿ����"));
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<>("�л� ����",5);
		studentCourse.add(new Student("�����"));
		studentCourse.add(new Student("������"));
		studentCourse.add(new Student("����ȣ"));
		studentCourse.add(new Student("��â��"));
		studentCourse.add(new Student("������"));
		
		Course<HighStudent> highStudentCourse = new Course<>("�����л� ����",5);
		highStudentCourse.add(new HighStudent("�ŵ�ȣ"));
		highStudentCourse.add(new HighStudent("��⸮"));
		highStudentCourse.add(new HighStudent("�ſ��"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		//registerCourseStudent(personCourse);
		//registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);
		//registerCourseWorker(highStudentCourse);
		
	}

}