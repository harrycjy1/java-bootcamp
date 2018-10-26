package sec01_exam;

public class IncreDecreOperatorEx {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
        
		
		System.out.println("--------------");
		System.out.println("x="+ x++);
		x++;
		++x;
		System.out.println("x="+x++);
		System.out.println("x="+x);            // x=10, x=12, x= 13
		                                       //Á¤´ä : x=10, x=13, x= 14
		
		System.out.println("--------------");
		y--;
		--y;
		System.out.println("y="+y);            // y=8  
		
		
		System.out.println("--------------");
		int z=x++;
		System.out.println("z="+z);
		System.out.println("x="+x);            //z=14, x=15
		
		
		System.out.println("--------------");
		z=++x;
		System.out.println("z="+z);
		System.out.println("x="+x);            //z=16, x=16 
		
		System.out.println("--------------");
		z=(++x)+(++y);
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);            //z=26, x=17, y=9

		
		
	
	}

}
