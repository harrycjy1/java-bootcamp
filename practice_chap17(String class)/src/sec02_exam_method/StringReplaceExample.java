package sec02_exam_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		
		//2���� String �ν��Ͻ��� �����Ǵ� ���� ����ϵ��� ����.
		String oldStr = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
