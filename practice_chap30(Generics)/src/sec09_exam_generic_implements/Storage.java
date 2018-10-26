package sec09_exam_generic_implements;

public interface Storage<T> {

		//T라는 제네릭 타입을 저장하는 메서드 물론 추상
		public void add(T item, int index);
		//index를 이용해 T를 찾아오는 추상메서드
		public T get(int index);
}
