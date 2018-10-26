package sec03.exam03_file_output_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception{
		
		//������ �����ϱ� ���� ��θ� ����
		String originalFileName = "D:\\java �۾� ������\\practice_chap33(IO��������)\\src\\sec03\\exam03_file_output_stream\\�迬��.jpg";
		
		String targetFileName = "D:\\example\\�迬��1.jpg";
		
		File file= new File(originalFileName); //????
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		int i=0;
		
		//����Ʈ�迭�� ũ���������� ����ð��� ��������.
		//byte[] readBytes = new byte[10000];
		byte[] readBytes = new byte[100];
		long currentTime = System.currentTimeMillis();
		
		while((readByteNo=fis.read(readBytes))!=-1) {
			fos.write(readBytes); //���� ����Ʈ ����ŭ ��½�Ʈ������ ������
			i++;
		}
		fos.flush();
		
		long endTime = System.currentTimeMillis();
		System.out.println("���μ� : "+i+"\t����ð� : "+(endTime-currentTime)+"ms"+"\t������ ������ ũ�� : "+file.length()/1024+"KByte");
		fos.close();
		fis.close();
		System.out.println(file.getName()+"������ ���簡 �Ϸ�Ǿ����ϴ�.");
	}

}
