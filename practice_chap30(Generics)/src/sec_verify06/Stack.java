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
			System.out.println("������ �� ã�׿�! ��ü�� �� �־��!\r\n" + 
					"���� �߻����� ���α׷��� ���� �����մϴ�.\r\n" + 
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
			System.out.println("������ ����׿�. ��ü�� �����. null�� ����ؿ�!");
		}
				
		return null;
		
		
	}
}
