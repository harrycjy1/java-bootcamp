package sec_verify03;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
			SmartPhone<String,String,Double> s1 = new SmartPhone<>();
			s1.setCompany("Samsung");
			s1.setModel("Galaxy5");
			s1.setInch(5.5);
			System.out.println("타입파라메터에 <String, String, Double>으로 객체 생성 후 저장값 불러오기");
			System.out.println("회사 :"+s1.getCompany()+"\n모델 :"+s1.getModel()+"\n인치 : "+s1.getInch());
			System.out.println();
			
			SmartPhone<String,String,String> s2 = new SmartPhone<>();
			s2.setCompany("LG");
			s2.setInch("6.0");
			s2.setModel("V20");
			System.out.println("타입파라메터에 <String, String, String>으로 객체 생성 후 저장값 불러오기");
			System.out.println("회사 :"+s2.getCompany()+"\n모델 :"+s2.getModel()+"\n인치 : "+s2.getInch());
		
			

	}

}
