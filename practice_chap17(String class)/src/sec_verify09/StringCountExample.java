package sec_verify09;

public class StringCountExample {

	static int 	count (String src, String target) {
		int count =0;
		int i =0;
		
		while(true) {
			src.indexOf(target);
		if(src.indexOf(target)!=-1) {
			src=src.substring(i+target.length());
			count++;	
			}
		else {
			break;
		}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		String s = "�뱸�� ����սô�.�뱸!";
		System.out.println(s);
		System.out.println("�� ���ڿ����� �뱸��� �ܾ ��"+count(s, "�뱸")+"�� �־��");
		
		System.out.println();
		String s2 = "I like LG, I like Pizza!";
		System.out.println(s2);
		System.out.println("�� ���ڿ����� �뱸��� �ܾ ��"+count(s2, "�뱸")+"�� �־��");
		
	}

}
