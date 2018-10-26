package sec_verify.exam10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {
	
	
	public static void main(String[] args) throws Exception{
		
		String path = "D:\\숙제\\0823\\words.txt";
		String str = "";
		
		Scanner scan = new Scanner(System.in);
	
		Reader fl = new FileReader(path);
		BufferedReader bf = new BufferedReader(fl);
		Vector<String> v = new Vector<>();
		
		boolean check =false;
		
		while((str=bf.readLine())!=null) {
			v.add(str);
		}
		
		
		while(true) {
			
			System.out.print("찾는 단어 >> ");
			String input = scan.nextLine();
			
			if(input.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			for(String st : v) {
				if(st.contains(input)) {
				System.out.println(st);
				check=true;
				}
			}
			
			
			if(check==false)
				System.out.println("찾는 단어가 없습니다.");
			
			check=false;
	
		}
		scan.close();

	}


	

	
}
