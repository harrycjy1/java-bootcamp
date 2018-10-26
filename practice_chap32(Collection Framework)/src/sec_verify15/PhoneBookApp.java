package sec_verify15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookApp {

			final int 			INSERT = 1;
			final int 			DELETE = 2;
			final int 			SEARCH = 3;
			final int 			SHOWALL = 4;
			final int 			EXIT = 5;
			private Scanner 	scan;
			private HashMap<String, Phone> 	map00;
			
			
			
			public PhoneBookApp() {
				scan = new Scanner(System.in);
				map00 = new HashMap<>();
			}
		
			public void run() {
				
				while(true) {
					System.out.print("1 : ����, 2 : ����, 3 : ã��, 4. ��ü ����, 5. ���� >>");
					int num = scan.nextInt();
					scan.nextLine();
					
					switch(num) {
					case INSERT :
						insert();
						break;
						
					case DELETE :
						delete();
						break;
						
					case SEARCH :
						search();
						break;
						
					case SHOWALL :
						showall();
						break;
					case EXIT :
						System.exit(0);
						break;
					}
				}
					
				
			}
			public void insert() {
				System.out.print("�̸� >>");
				String name = scan.nextLine();
				if(map00.containsKey(name)) {
					System.out.println(name+"���� �̹� ��ϵǾ����ϴ�.");
					return;
				}
				
				System.out.print("�ּ� >>");
				String add = scan.nextLine();
				System.out.print("��ȭ��ȣ >>");
				String num = scan.nextLine();
				map00.put(name, new Phone(name,add,num));
				System.out.println(name+"���� ����Ǿ����ϴ�.");
			}
			public void 		delete() {
				System.out.print("�̸� >>");
				String name = scan.nextLine();
				if(map00.containsKey(name)) {
				map00.remove(name);
				System.out.println(name+"���� ������ �����Ǿ����ϴ�.");
				}
				else
					System.out.println(name+"���� ��ϵ��� ���� ����Դϴ�.");
				
			}
			public void search() {
				System.out.print("�̸� >>");
				String name = scan.nextLine();
				
				if(map00.containsKey(name)) {
				Phone information = map00.get(name);
				System.out.println(information.toString());
				}
				
				else
				System.out.println(name+"���� ��ϵ��� ���� ����Դϴ�.");
				
			}
			public void showall() {
				Set<String> keymap = map00.keySet();
				
				for(String key : keymap) 
					System.out.println(map00.get(key).toString());
	
			}
			
}
