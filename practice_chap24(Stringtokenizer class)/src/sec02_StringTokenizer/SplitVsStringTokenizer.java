package sec02_StringTokenizer;

import java.util.StringTokenizer;

import org.omg.Messaging.SyncScopeHelper;

public class SplitVsStringTokenizer {

	public static void main(String[] args) {
		
		String data = "100   200 300";
		/*�Ѵ� �����ڸ� �������� �������� �ұ��ϰ� ����� �ٸ���.
		��������, split()�� ���鵵 �ϳ��� ��ū���� ����������, StirngTokenizer�� �׷�ġ �ʴ�.
		�����Ϳ��� �̷� ������ ���̴� ũ��ū ����� �ʷ��Ѵ�.
		�Ͽ�, StringTokenizer�� ����ϴ� ���� �ٶ����ϴ�.*/
		
		String[] result = data.split(" ");
		StringTokenizer st = new StringTokenizer(data, " ");
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + "|");
		}
		
		System.out.println("���� : "+ result.length);
		
		int i =0;
		/*StringTokenizerŬ������ hasMoreToken()�޼���� nextTokens()�޼����
		String���� ��ū�� �����ͼ� ����ϰ� ������ �Ѵ�.
		�Ͽ� �Ʒ� while�������� ��°���� ������ �ʴ´�.*/
		System.out.println("���� : "+st.countTokens());
		for(;st.hasMoreTokens(); i++) 
			System.out.print(st.nextToken() + "|");
			
			System.out.println("���� : "+i);
			System.out.println("���� : "+st.countTokens());
			
			
		StringTokenizer st1 = new StringTokenizer(data," ");
		while(st1.hasMoreTokens()) {
			System.out.println("���� ��ū�� : "+ st1.countTokens());
			String str = st1.nextToken();
			System.out.println(str);
		}
		
			
	}

}
