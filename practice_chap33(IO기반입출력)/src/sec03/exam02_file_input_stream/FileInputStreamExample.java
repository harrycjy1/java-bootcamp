package sec03.exam02_file_input_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		//FileInputStream fis = new FileInputStream(dfjkfjdfk);
		// \�� �̽������������̱⶧���� �Ʒ��� ���� /�� �ٲ��ش�
		//���� �ҽ��ڵ带 �ֿܼ� ����غ��� ���α׷��̴�.
		
		try {
			FileInputStream fis = new FileInputStream("D:\\java �۾� ������\\practice_chap33(IO��������)\\src\\sec03\\exam02_file_input_stream\\FileInputStreamExample.java");
			
			int data;
			int i=0;
			
			//�ѹ���Ʈ �� �д´�
			
			while((data = fis.read())!= -1) {
				//�ܼ� ���(���� System.out.println�� �ؾ��ϳ�,
				//������ ��½�Ʈ���̹Ƿ�write()�ᵵ ����
				System.out.write(data);
				
				//�ܼ���� system.out.print()���, �ѱ��� 2����Ʈ�̱�빮�� ������. �׷��� ������ ����Ʈ�迭�� �ϴ°��� �����ϴ�
				//system.out.print((char)data);
				i++;
			}
			System.out.println("���� �� : "+i);
			fis.close();
		} catch (Exception e) {e.printStackTrace();}

	}

}
