package sec_verify08;

import java.util.Arrays;

public class DeepCloneDriveExample {

	public static void main(String[] args) {
		
		System.out.println("[���� ����̺��� �ʵ� ��]");
		Drive d1 = new Drive("C����̺�",500,new String[]{"����������","�ý�������"},new Folder("�߽òٸ��Ѱ�",15));
		
		System.out.println("�̸� : "+d1.name);
		System.out.println("ũ�� : "+d1.size);
		System.out.println("���� ��� : "+Arrays.toString(d1.driverList));
		System.out.println("�� ������ : "+d1.folder.name);
		System.out.println("ũ�� : "+d1.folder.size);
		
		System.out.println();
		
		Drive d2=d1.getDrive();//���� ���� ����
		
		
		System.out.println("[������ ����̺� �ʵ� ��]");
		System.out.println("�̸� : "+d2.name);
		System.out.println("ũ�� : "+d2.size);
		System.out.println("���� ��� : "+Arrays.toString(d2.driverList));
		System.out.println("�� ������ : "+d2.folder.name);
		System.out.println("ũ�� : "+d2.folder.size);
		
	}

}
