package sec03.exam01_file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception	{
		
		File dir = new File("D:\\example\\dir");
		File file1 = new File("D:\\example\\text_���纻.txt");
		File file2 = new File(new URI("file:///D:/example/file2.txt"));
		
		//local pc�̱� ������ localhost�� �����ص� �����ϴ�
		
		/* URI�� ���� �����ڿ� �ĺ���(Uniform Resource Identifierm URI)��
		���ͳݿ� �ִ� �ڿ��� ��Ÿ���� ������ �ּҸ� ���Ѵ�. URI�� ����� ���ͳݿ��� 
		�䱸�Ǵ� �⺻�������μ� ���ͳ� ��������(��ž��)�� �ٴ´�
		���� ���α׷��ֿ��� ���� ������ ������ �˵��� ����. ��������(HTTPȤ�� FTP) + : + / + ȣ��Ʈ�̸�  + �ּ�*/
		
		/*���� IP�ּҳ� ȣ��Ʈ�ּҰ� �;��Ѵ�.
		 * File file3 = new File(new URI("file://localhost/C:/temp/file3.txt"));
		 * URI�� �����̶�� schema�� �ʿ��ϴ�
		 * URIǥ����� ������ �ƴ��ϸ� IllegalArgumentException�ٻ���
		 * File file3 = new File(new URI("C:/temp/file3.txt"));
		 */
		
		//dir���丮�� �����ϴ°�?
		if(dir.exists() ==false)
			//dir.mkdirs(); �θ���丮�� �������� �ƴ��ϰ� �ڽŸ� �����Ѵ�.
			//��λ� ���� ���丣���� �ٻ����Ѵ�(����) �־ ���
			dir.mkdirs();
		
		if(file1.exists() == false)
			//���� C:/temp/file1.txt��ο� Temp���丮�����ٸ� IOException�� �߻��ϹǷ� 
			//�ݵ�� ���丮 �����̳� ��θ� �� �����ؾ� �Ѵ�.
			file1.createNewFile();
		
		if(file2.exists()==false)
			file2.createNewFile();
		
		//File��ü�� �ϳ� �����
		File temp = new File("D:\\example");
		//Temp���� ������丮�� ������ ���� �迭�� �����Ͽ� ������
		File[] contents = temp.listFiles();
		
		System.out.println("��¥\t\t�ð�\t����\tũ��\t�̸�");
		System.out.println("--------------------------------------------");
		
		//���������� ������¸� �����ϱ� ���� �Ʒ��� ���� SimpleDateFormat��ü�� �����Ѵ�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:MM");
		
		//���Ϲ��� File[]�� ����غ���,
		
		for(File file : contents) {
			//������ ������ ��¥�� �Ű������� DATA��ü�� �����Ͽ� SimpleDateFormat��ü�� Format()�� �Ű�Ÿ������ �ش�.
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			//file�� �����丮�̳�?
			if(file.isDirectory()) {
				System.out.print("\t[DIR]\t\t"+file.getName());
			}
			
			//file�̸�
			else {
				System.out.print("\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}
	
	}	

}
