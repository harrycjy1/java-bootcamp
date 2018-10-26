package sec04.exam06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception{
		
		//�⺻Ÿ���� �����Ͱ� ����Ǳ� ������, .txt�� �������� �ʰ�,
		//.datȮ���ڸ� ����Ͽ� FileOutputStream�� �����Ͽ���.
		
		String path = "D:/example/primitive-type_save.dat";
		FileOutputStream fos = new FileOutputStream(path);
		
		//File�� ũ�⸦ �˾ƺ��� ���ؼ� �����޴�.
		File file = new File(path);
		
		//�׸��� �⺻ Ÿ���� ����ϱ� ���� ������Ʈ������ DataOutputStream�� �����Ͽ���.
		DataOutputStream dos = new DataOutputStream(fos);
		
		//������ ó���� �⺻������ 0����Ʈ�� �����Ѵ�.
		System.out.println("���� ũ�� : "+file.length());
		//String�� ���Ͽ� �����ϱ� ���ؼ��� writeUTF�� ����Ѵ�.
		dos.writeUTF("������");
		//������ �����ϸ鼭 ������ �⺸�� ���Ͻý����� ũ�Ⱑ 2Kbyte�� �����ϴ� ���� �� �� �ִ�.
		System.out.println("���� ũ�� : "+file.length());
		
		dos.writeDouble(100.4);	//doubleŸ�� ����
		dos.writeInt(10);
		System.out.println("���� ũ�� : "+file.length());
		
		dos.writeUTF("�迬��");
		dos.writeDouble(96.3);
		dos.writeInt(27);
		System.out.println("���� ũ�� (byte) :" +file.length());
		
		//�ڿ� ����
		
		dos.flush();
		dos.close();
		fos.close();
		
		System.out.println();
		
		//������ ������ ������ �б� ���� �Ʒ��� ���� FileInputStream�� DataInputStream�� �����ߴ�.
		FileInputStream fis = new FileInputStream(path);
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++)	{
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println("���� ���ڿ� : "+name);
			System.out.println("���� double�� : "+score);
			System.out.println("���� Int��  : "+ order);
			System.out.println();
			
		}
		
		System.out.println("���� ũ��(byte) : "+file.length());
		//�ڿ� ����
		dis.close();
		fis.close();
		
		

	}

}
