package sec04.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		
		long start =0;
		long end = 0;
		String str = "D:\\java �۾� ������\\practice_chap33(IO��������)\\src\\sec04\\exam03_bufferedinputstream\\����Ű��(���ܾ�).mp3";
		//����Ʈ������� �ӵ��� ���̸� �������� ���α׷�
		FileInputStream fis1 = new FileInputStream(str);
		
		System.out.println("����Ʈ ��� �б� ����");
		
		start = System.currentTimeMillis();
		while(fis1.read()!=-1) {}
		System.out.println("����Ʈ ��� �б� ��");
		end = System.currentTimeMillis();
		
		System.out.println("���۸� ������� �ʾ����� �ð� : "+(end-start)+"ms");
		fis1.close();
		
		System.out.println();
		//���Է½�Ʈ�� FileinputStream���ٰ� �ӵ���� ������Ʈ���� BufferedINputStream�� ������.
		//BufferedInputStream�� ������Ʈ���̱� ������ ������ ���� �о� �� ���� ����
		
		FileInputStream fis2 = new FileInputStream(str);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		System.out.println("���� ��� �б� ����");
		start = System.currentTimeMillis();
		
		while (bis.read()!=-1) {}
		System.out.println("���� ��� �б� ��");
		end = System.currentTimeMillis();
		
		System.out.println("���۸� ��� ������ �ð� : "+(end-start)+"ms");
		bis.close();
		fis2.close();

	}

}
