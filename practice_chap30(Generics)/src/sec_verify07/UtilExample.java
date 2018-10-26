package sec_verify07;

public class UtilExample {

	public static void main(String[] args) {
	
	OtherPair<String,Integer> oa = new OtherPair<>("조진영",29);
	//Util.getValue(oa, "조진영");
	//Otherpair는 Pair와 상관없는 클래스이므로 getValue메서드의 매개변수로서 취급이 불가능하다.	
		
	Pair<String,Integer> pa = new Pair<>("홍길동",35);
	System.out.println("Pair의 객체를 생성할때, Util의 getValue()를 호출할때 "
			+ "K값 홍길동 주고 얻어진 V값 : "+Util.getValue(pa, "홍길동"));
	
	ChildPair<String,String> ca = new ChildPair<>("홍삼원", "60");
	System.out.println("ChildPair의 객체 생성할때 K값 홍삼원,"
			+ " Util의 getValue()를 호출할 때 K값 홍삼순 주고 얻어진 V값 : "+Util.getValue(ca, "홍삼원"));
	
	}
	
}
