package sec_verify06;

public class Stack<T> {

	int 			tos=0; 
	int 			capacity;
	Object[] 		stck; 
	
	
	public Stack(int capacity) {
		this.stck = new Object[capacity];
	}
	
	public void push(T item) {
		
		try {
			stck[tos] = item;
			tos++;
		}
		catch(Exception e) {
			System.out.println("스택이 꽉 찾네요! 객체를 못 넣어요!\r\n" + 
					"예외 발생으로 프로그램을 정상 종료합니다.\r\n" + 
					"java.lang.ArrayIndexOutOfBoundsException: "+e.getMessage());
		}
		
		}
	
	public T pop() {	
		try {
		tos--;
		T result = (T)stck[tos];
		return result;
		}
		catch(Exception e) {
			System.out.println("스택이 비었네요. 객체가 없어요. null을 출력해요!");
		}
				
		return null;
		
		
	}
}
