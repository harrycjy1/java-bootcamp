package sec02_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String source = "1,��õ��,100,100,100|2,�ڼ���,95,80,90|3,���ڹ�,80,90,90";
		//�� �л��� ������ �����ϱ� ���� |�� ���
		
		StringTokenizer st= new StringTokenizer(source,"|");
		
		//��������� ���� ������ �����ڰ� ũ�� 2������ ���������� ����
		while(st.hasMoreTokens()) {
			String token  = st.nextToken();
			System.out.println("������ ��ū : "+token);
			
			//������ ��ū�� �ٽ� m�� �����ڸ� ��
			StringTokenizer st2 = new StringTokenizer(token, ",");
			while(st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
				
			}
			System.out.println("---------");
		}

	}

}
