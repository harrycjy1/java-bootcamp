package sec_verify03;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
			SmartPhone<String,String,Double> s1 = new SmartPhone<>();
			s1.setCompany("Samsung");
			s1.setModel("Galaxy5");
			s1.setInch(5.5);
			System.out.println("Ÿ���Ķ���Ϳ� <String, String, Double>���� ��ü ���� �� ���尪 �ҷ�����");
			System.out.println("ȸ�� :"+s1.getCompany()+"\n�� :"+s1.getModel()+"\n��ġ : "+s1.getInch());
			System.out.println();
			
			SmartPhone<String,String,String> s2 = new SmartPhone<>();
			s2.setCompany("LG");
			s2.setInch("6.0");
			s2.setModel("V20");
			System.out.println("Ÿ���Ķ���Ϳ� <String, String, String>���� ��ü ���� �� ���尪 �ҷ�����");
			System.out.println("ȸ�� :"+s2.getCompany()+"\n�� :"+s2.getModel()+"\n��ġ : "+s2.getInch());
		
			

	}

}
