package sec07_exam_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		
		//Singleton obj1 = new Singleton(); private는 같은 클래스 내에서만 접근허용함
		//Singleton obj2 = new Singleton();
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		//사용자 정의 클래스의 object의 equals()호출 --> 주소비교
		
		if(obj1.equals(obj2)) {
			System.out.println("같은 Singleton객체 입니다.");
		}
		else {	
		System.out.println("다른 Singleton객체 입니다.");
		}

	}

}
