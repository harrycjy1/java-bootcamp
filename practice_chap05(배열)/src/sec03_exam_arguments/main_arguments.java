package sec03_exam_arguments;

public class main_arguments {

	//main()�� �Ű��������� �����ϱ� ���Ͽ� �޴����� run�� �����ϰ�
	//run_configguration�� Ŭ���Ͽ� ����. �׸��� �Ű��������� �����ϸ� �ȴ�.
	//arguments(�Ű�����)
		
	public static void main(String[] args) {
	
		if(args.length != 2) {
			System.out.println("���α׷��� ����");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);//�ý��� ���� ����
			
		}
		
		String strNum1 = args[0];//ù��° ������ ���
		String strNum2 = args[1];//�ι�° ������ ���
		
		int num1 = Integer.parseInt(strNum1);//���ڿ��� ������ ��ȯ
		int num2 = Integer.parseInt(strNum2);//���ڿ��� ������ ��ȯ
		
		int result = num1 + num2;
		System.out.println(num1 + "+"+num2+"="+result);
		
		

	}

}
