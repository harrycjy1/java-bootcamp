package sec04_getProperty;

import java.util.Properties;
import java.util.Set;

public class PropertyExample {

	public static void main(String[] args) {
		
		String osName = System.getProperty("as.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println("�ü�� �̸� :"+osName);
		System.out.println("����� �̸� :"+userName);
		System.out.println("����� Ȩ���丮 :"+userHome);
		
		System.out.println("-----------------------------------");
		System.out.println("[key]                         value");
		System.out.println("-----------------------------------");
		
		//property�� ���� Set��ü �����Ͽ� keySet���� ���� �� ���
		
		Properties props = System.getProperties(); // ��� �ý����� �Ӽ��� ��Ƽ� ����
		
		//props.list(System.out);
		
		//Properties�÷����� Map�迭�ν� Ű�� ���� ��ü�� String�̴�. ���⼭�� Properties�÷�����
		//Ű���� �����ͼ� Set�÷����� ����� ����غ���. �ֳ� map�迭�� Ű���� �˾Ƶ� 
		//���� �����µ� ������ ���� ����.
		
		Set<Object> keys = props.keySet();//key���鸸 ���� Set�迭�� ��ȯ
		
		for(Object objkey : keys) {
			String key = (String) objkey; 
			String value = System.getProperty(key);
			System.out.println("["+key+"]"+value);
		}

	}

}
