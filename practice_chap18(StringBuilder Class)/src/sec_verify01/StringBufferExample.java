package sec_verify01;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println("���� ��Ʈ������ sb ��� : "+sb.toString());
		System.out.println("��Ʈ������ sb�� �ؽ��� ��� : "+sb.hashCode());
		sb.append(" is pencil");
		System.out.println("������ ��Ʈ������ sb ��� : "+sb.toString());
		sb.replace(7, 8," my ");
		System.out.println("������ ��Ʈ������ sb ��� : "+sb.toString());
		sb.replace(7, 10, " your");
		System.out.println("������ ��Ʈ������ sb ��� : "+sb.toString());
		sb.delete(4,20);
		System.out.println("���ڿ� ���̸� �����Ͽ� ������ ��Ʈ������ sb ��� : "+sb.toString());
		System.out.println("���ڿ� ���� �� ��Ʈ�� ������ �ؽ� �ڵ� : "+sb.hashCode());
		System.out.println("���ڿ� ���� �Ŀ��� �ؽ��ڵ尡 ������ ���� ��, ��Ʈ�����۴� ���ο� �ν��Ͻ��� ������ �ƴ����� �˼� �ִ�.");
	}

}
