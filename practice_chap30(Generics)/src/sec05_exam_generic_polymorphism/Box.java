package sec05_exam_generic_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
					
	
				
	//List�迭�� �÷��� .. List�� �������̽��̰�, ArrayList�� list�������̽��� ������ Ŭ����
	//�������̽� �ʵ��� ������

		List<T> list = new ArrayList<>();
		
		
		//�÷��� ��ü �߰�..  ������ ���ϸ� ��ü�� �ּҰ��� ����Ǵ°�
		public void add(T item) {
			list.add(item);
		}
		
		//�÷��� ��ü �ε����� ã�ƿ���
		public T get(int i) {
			return list.get(i);
		}
		
		//�÷��� ũ�� ��ȯ
		public int size() {
			return list.size();
		}

		//�÷��ǿ� �ִ� �׸� �� ���
		public String toString() {
			return list.toString();
		}
}
