package sec01_exam_wrapper;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//Auto Boxing
		Integer obj = 100;
		Integer obj1 = new Integer(100);
		List<Integer> list = new Vector<Integer>(); //���ʹ� �⺻������ 10���� ����
		list.add(100); // new Integer(100);
		list.add(obj);
		list.add(obj1);
		
		System.out.println("value : "+obj);
		System.out.println("value1 : "+obj1.intValue());
		System.out.println("value2 : "+list.get(0));
		System.out.println(list);
		
		//���Խ� �ڵ� ��ڽ�(���εǾ��ִ� 100�� ���ͼ� �⺻���� ����Ǵ� ��)
		//int value = obj.intValue(); <--��Ȯ�� �ڵ��ڵ�
		int value =obj;
		System.out.println("value2 : "+value);
		
		//����� �ڵ� ��ڽ�
		//��ü + �⺻��(���� ���� ���������� Wrapper��ü�� �����Ϸ��� �ڵ����� ��ڽ����ش�)
		int result = obj +100;
		System.out.println("result : "+result);

	}

}
