package sec07_verify;

public class SamsungCellPhoneExample {

	public static void main(String[] args) {
		
		SamsungCellPhone phone = new SamsungCellPhone();
		
		phone.setColor("white");
		phone.setCompany("apple");
		phone.setModel("iphone");
		phone.setRelease(2013);
	
		phone.setCompany("samsung");
		phone.setModel("Galaxy5");
		
		System.out.println(phone);
	
		
	
	
	}	

}
