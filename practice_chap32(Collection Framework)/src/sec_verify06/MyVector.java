package sec_verify06;

import java.util.Arrays;

import org.omg.Messaging.SyncScopeHelper;

public class MyVector {

	
	Object[] data = null;	//객체를 담기 위한 객체배열을 선언한다.
	private int capacity = 0;	//용량
	private int size = 0; 	//크기
	
	//생성자
	public MyVector(int capacity) {
		this.capacity=capacity;
		data = new Object[capacity];
	}
	
	public MyVector() {
		this(10);
		
	}
	
	
	
	//메서드
	public boolean isEmpty() {
		if(data.length==0)
		return true;
		
		else
		return false;
	}
	
	public int capacity() {
		return this.capacity;
	}
	
	public int size() {
		return this.size;
	}
	
	private void setCapacity(int capacity) {
		this.capacity=capacity;
	}
	
	public void ensureCapacity(int minCapacity) {
		this.setCapacity(minCapacity);
		
	}
	
	public void add(Object o) {
		if(isEmpty()==false) {
			data[size] = o;
			size++;
		}
		
	}
	
	public Object get(int index) {
		
		return data[index];
	}
	
	public void remove(int i) {
		Object[] newdata =new Object[data.length-1];
		System.arraycopy(data, 0, newdata, 0, i);
		System.arraycopy(data, i+1, newdata, i, data.length-(i+1));
		data=newdata;
		size--;
	}
	
	public boolean remove(Object o) {
		
		for(int i=0; i<data.length; i++) {
			if(data[i]==o) {
			this.remove(i);
			return true;
			}
			
		}
		return false;
		
		
	}
	
	public void clear() {
		size=0;
		capacity=10;
		data=new Object[capacity];
		
	}
	
	@Override
	public String toString() {
	
		String result = "";
		result += "[";
		for(int i=0; i<size; i++) {
			if(i==size-1)
				result += data[i];
			else
			result += data[i]+" ,";
			
		}
		result +="]";
		
		return result;
		
	
	}
}
