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
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 : ");
			String id = scan.nextLine();
			System.out.print("비밀번호 : ");
			String password = scan.nextLine();
			System.out.println();
			//저장되어 있는 객체를 검색하여 (DB라고 상상)
			//아이디랑 비밀번호를 일치시 로그인 성공
			//id가 있다면..
			if(map.containsKey(id)) {
				//id 즉, 키를 주고 얻어오는것이 값, 즉 password이니깐
				//같다면 로그인 성공, 아니면 비밀번호 불일치
				if(map.get(id).equals(password)) {
					System.out.println(id+"님이 로그인 했습니다!");
					break;
				}
				else
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
			}
			
			else
				System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요.");
		}
		
		scan.close();
	}

}
