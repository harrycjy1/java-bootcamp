package sec01_exam_objects;

import java.util.Arrays;
import java.util.Objects;

public class HashExample {

	public static void main(String[] args) {
			Student s1 = new Student(1,"ȫ�浿",new int[] {100,100});
			Student s2 = new Student(1,"ȫ�浿",new int[] {100,100});
			
			System.out.println("s1�ν��Ͻ��� �ؽ��ڵ� : " + s1.hashCode());
			System.out.println("s2�ν��Ͻ��� �ؽ��ڵ� : " + s2.hashCode());
	}

}

class Student{

int sno;
String name;
int[] arr;

public Student(int sno, String name, int[] arr) {
	this.sno=sno;
	this.name=name;
	this.arr=arr;
}

@Override
	public int hashCode() {
		//�ʵ尪�� ���� ���϶� �־��� ������ �̿��ؼ� �ؽ��ڵ带 �����ϴ� ����
		//�迭�� ��� �ּҰ��� �ְ� �Ǹ� �ؽ����� �޶�����. �Ͽ� ��Ȯ�� �⺻����
		//�����Ͽ��� �Ѵ�.
		return Objects.hash(this.sno, this.name, Arrays.toString(arr));
		//return this.sno + this.name;
	}


}