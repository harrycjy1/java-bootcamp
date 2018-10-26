package sec01_runtime_exception;

public class ArrayOutofBoundsException {

	public static void main(String[] args) {
		
		if(args.length ==2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("arg[0]"+data1);
			System.out.println("arg[1]"+data2);
		}
		
		else {
			//실행 매개값이 없으면 arrayoutofboudsexception 발생
			
			System.out.println("실행방법");
			System.out.println("Java ArrayOutOfBoundsException");
			System.out.println("값1 값2");
		}

	}

}
