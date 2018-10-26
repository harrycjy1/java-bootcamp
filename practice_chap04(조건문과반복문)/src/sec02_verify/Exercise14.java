package sec02_verify;

public class Exercise14 {

	public static void main(String[] args) {
		
		for (int i =1; i<=3; i++) 
		{
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				for(j=1; j<=i+1; j++);
				System.out.print(" ");
				for(j=1; j<=i+1; j++);
				System.out.print(" ");
				for(j=1; j<=i; j++) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
			
		

	}

}
