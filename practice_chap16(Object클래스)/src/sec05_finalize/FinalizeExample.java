package sec05_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		
		Counter count = null;
		
		for(int i=1; i<=50; i++) {
			count = new Counter(i);
			count = null;
			System.gc(); //직접 gc를 호출함
							
		}

	}

}
