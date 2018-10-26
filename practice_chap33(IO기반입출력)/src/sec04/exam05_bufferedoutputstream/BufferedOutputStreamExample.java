package sec04.exam05_bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import sec02.exam01_system_in_out.SystemOutExample;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis =null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		
		int data = 0;
		long start = 0;
		long end = 0;
		
		String path = "D:\\java �۾� ������\\practice_chap33(IO��������)\\src\\sec04\\exam05_bufferedoutputstream\\����Ű��(���ܾ�).mp3";
		
		//���Է� ��Ʈ���� FileinputStrmeam���� ������ BufferedInputStream������Ʈ���� ����
		fis = new FileInputStream(path);
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream("D:/example/�뷡���纻.mp3");
		//bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		
		while((data = bis.read())!=-1) {
			fos.write(data);
		}
		
		fos.flush();
		end= System.currentTimeMillis();
		
		fos.close();
		bis.close();
		fis.close();
		
		System.out.println("���۾ƿ���Ʈ�� ��� ���� �ʾ����� : "+(end-start)+"ms");
		System.out.println();
		//
		
		fis = new FileInputStream(path);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("D:/example/�뷡���纻2.mp3");
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		
		while((data = bis.read())!=-1) {
			bos.write(data);
		}
		
		bos.flush();
		end= System.currentTimeMillis();
		
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		
		System.out.println("���۾ƿ���Ʈ�� ��� ������ : "+(end-start)+"ms");
		
		
	}

}
