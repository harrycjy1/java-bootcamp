package sec04_exam_generic_method_1;

public class Box<T> {
				
		
		private T t;
		
		//setter
		public void set(T t) {
			this.t= t;
			
		}
		
		//getter
		public T get() {
			return this.t;
		}
		
}
