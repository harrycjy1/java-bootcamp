package sec05_verify;

import java.util.concurrent.SynchronousQueue;

public class Document {

	static int 	count=0;
	String 		name;    
	
	
	//�⺻�� ������
	Document(){
		this("�������"+count++);//�Ű����� 1��¥��
	}
	
	Document(String name){
		this.name=name;
		System.out.println("���� "+this.name+"�� �����Ǿ����ϴ�.");
	}
}
