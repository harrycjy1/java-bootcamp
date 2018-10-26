package sec03_map.exam02_userdefine_hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		
		//hashtable�� ������ ��, map�÷����� ������ ������ ����ߴ�
		//�ڷᱸ���̴�. �Ź����� �ռ� �� hashmap�÷����̴�.
		//Ű�� ������ ��� String�� ����.
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter","12345");
		
		Scanner scan =  new Scanner(System.in);
		//��ü�˻�
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.print("���̵� : ");
			String id = scan.nextLine();
			System.out.print("��й�ȣ : ");
			String password = scan.nextLine();
			System.out.println();
			//����Ǿ� �ִ� ��ü�� �˻��Ͽ� (DB��� ���)
			//���̵�� ��й�ȣ�� ��ġ�� �α��� ����
			//id�� �ִٸ�..
			if(map.containsKey(id)) {
				//id ��, Ű�� �ְ� �����°��� ��, �� password�̴ϱ�
				//���ٸ� �α��� ����, �ƴϸ� ��й�ȣ ����ġ
				if(map.get(id).equals(password)) {
					System.out.println(id+"���� �α��� �Ǿ����ϴ�.");
					break;
				}
				else
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
			
			else
				System.out.println("���̵� �������� �ʽ��ϴ�.");
		}
		
		scan.close();
	}

}
