package sec02_try_catch_finally;

public class TryCatchExample01 {

	public static void main(String[] args) {
		
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4/0);
		}
		catch(Exception e){
			System.out.println("예외발생");
			System.out.println(5); //
		}
		
		System.out.println(6);
	}

}
