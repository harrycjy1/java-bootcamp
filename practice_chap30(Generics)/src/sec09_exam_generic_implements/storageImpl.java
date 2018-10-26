package sec09_exam_generic_implements;

public class storageImpl<T> implements Storage<T>{

	
	private T[] array;
	
	//»ı¼ºÀÚ
	public storageImpl(int capacity) {
		this.array = (T[]) new Object[capacity];
	}
	
	
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}
	
	@Override
	public T get(int index) {
		
		return array[index];
	}
	
	

}
