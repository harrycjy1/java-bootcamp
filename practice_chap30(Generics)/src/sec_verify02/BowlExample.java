package sec_verify02;

public class BowlExample {

	public static void main(String[] args) {
		
		
			Bowl<String,String> b1= new Bowl<>();
			b1.setKey("박근혜");
			b1.setValue("대통령");
			Bowl<String,Integer> b2= new Bowl<>();
			b2.setKey("박근혜");
			b2.setValue(65);
			
			System.out.println("타입파라메터에 <String, String>으로 객체 생성 후 저장값 불러오기");
			System.out.println("이름 : "+b1.getKey());
			System.out.println("직업 : "+b1.getValue());
			System.out.println("타입파라메터에 <String, Integer>으로 객체 생성 후 저장값 불러오기");
			System.out.println("이름 : "+b2.getKey());
			System.out.println("직업 : "+b2.getValue());
	}

}
