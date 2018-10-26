package sec02_verify;

public class Smartphone extends Phone{
	
	
	Smartphone(String owner){
		super(owner);
		
	}
	

	 void turnon() {
		 System.out.println("폰 전원을 켭니다.");
	 }
	 void turnoff() {
		 System.out.println("폰 전원을 끕니다.");
	 }
	 void internetSearch() {
		 System.out.println("네이버를 검색합니다.");
	 }

}
