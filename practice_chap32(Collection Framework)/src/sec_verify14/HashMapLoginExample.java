package sec_verify14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLoginExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		map.put("perpear", "4321");
		map.put("fly", "1012");
		map.put("numeric", "1234");
		map.put("fish", "15244");
		map.put("ruby", "00145");
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
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
					System.out.println(id+"���� �α��� �߽��ϴ�!");
					break;
				}
				else
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
			}
			
			else
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
		}
		
		scan.close();
	}

}
