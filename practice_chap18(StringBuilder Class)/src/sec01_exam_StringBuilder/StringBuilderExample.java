package sec01_exam_StringBuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		//buffer(L1,L2ĳ��, ������ Ȯ��)�� �̿��ϱ� ������ ���ο� �ν��Ͻ��� �������� �ʴ´�.
		StringBuilder sb = new StringBuilder();
		//System.out.println(sb.hashcode());
		sb.append("JAVA");
		sb.append(" Program Study");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		
		sb.insert(3, 2); //���� 2�� �־ �����Ͻ� ���ڿ��� �ٲ��.
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); //���̿� Book���� �ٲ��.
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		int length = sb.length();
		
		System.out.println("�� ���ڼ� : "+ length);
		System.out.println(sb.hashCode());//�ؽ��ڵ尡 ���� (�ϳ��� �ν��Ͻ����� ������ �̷�����ٴ� ����)
		String result = sb.toString();
		System.out.println(result);
		
		
		
		

	}

}
