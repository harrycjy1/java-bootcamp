package sec_verify02;

public class StringMethodExample {

	public static void main(String[] args) {
	
		String a =new String("    java,");
		String b =new String("program,fighting      ");
		
		String ab=a+b;
		String ab2 = ab.trim();
		String ab3 = ab2.replace("a", "1");
		String ab4 = ab3.substring(0, 4);
		String ab5 = ab3.substring(5,12);
		String ab6 = ab3.substring(13);
		char c = ab3.substring(3).charAt(2);
		
		System.out.println("���ڿ� a�� ���ڿ� b�� ������ ��� :"+ab);
		System.out.println("���ڿ� a�� ������ ������ ��� : "+ab2);
		System.out.println("���ڿ� a�� a�� 1�� ��ġ�� ��� :"+ab3);
		System.out.println("�и��� 0�� ���ڿ� : "+ab4);
		System.out.println("�и��� 1�� ���ڿ� : "+ab5);
		System.out.println("�и��� 2�� ���ڿ� : "+ab6);
		System.out.println("���ڿ� a�� substring�� ���  : "+ab3.substring(3));
		System.out.println("���ڿ� a�� 2��° ���ڸ� char c�� ������ ��� : "+c);
	}

}
