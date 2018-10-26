package sec01_exam;

public class AsOpEx {

	public static void main(String[] args) {
		
		int result = 0;
		
		result += 10;
		System.out.println("result ="+ result);
		
		result -=5;
		System.out.println("result ="+ result);
		
		result *= 3;
		System.out.println("result ="+ result);
		
		result /= 5;
		System.out.println("result ="+ result);
		
		result %=3;
		System.out.println("result ="+ result);
		
		//result값이 변화하는걸 식에 대입해야함(누적)

	}

}
