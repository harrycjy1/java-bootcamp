package sec02_verify;

public abstract class Phone {

		String owner;
		
		public Phone(String owner){
			System.out.println(owner+"�� ���Դϴ�.");
		}
		
		String getOwner() {
			return owner;
		}
	
		abstract void turnon();
		abstract void turnoff();
		
		

}
