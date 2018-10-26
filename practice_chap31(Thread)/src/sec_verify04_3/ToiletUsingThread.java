package sec_verify04_3;

public class ToiletUsingThread extends Thread{

	private Toilet 		toilet;
	private String 		name;
	
	
		public ToiletUsingThread (Toilet toilet, String name) {
			this.toilet=toilet;
			this.setName(name);
		}
		
		public void run() {
			this.toilet.use();
		}
}