package sec09_exam_generic_implements;

public interface Storage<T> {

		//T��� ���׸� Ÿ���� �����ϴ� �޼��� ���� �߻�
		public void add(T item, int index);
		//index�� �̿��� T�� ã�ƿ��� �߻�޼���
		public T get(int index);
}
