package sec02_exam_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		
		String subject = "�ڹ� ���α׷���";
		int location = subject.indexOf("���α׷���"); //"��"�� ���۵Ǵ� ��ġ�� ����
		
		System.out.println(location);
		
		//ã�� ����Ҷ� ���� ���δ�.(�����̳� ������)
		//"�ڹ�"�� �����ϰ� �ִ����� Ȯ���Ҵ� ���̴� �ڵ�
		
		if(subject.indexOf("�ڹ�")!=-1) { //�ڹٰ� ���� ���ڿ��ϰ�� indexOf�޼���� -1�� ����
			System.out.println("�ڹٿ� ���õ� å�̱���");
		}
		else {
			System.out.println("�ڹٿ� ������ ���� å�̱���");
		}
	}

}
