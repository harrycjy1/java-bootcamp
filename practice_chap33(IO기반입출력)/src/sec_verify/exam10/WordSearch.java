package sec_verify.exam10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {
	
	
	public static void main(String[] args) throws Exception{
		
		String path = "D:\\����\\0823\\words.txt";
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
			
			System.out.print("ã�� �ܾ� >> ");
			String input = scan.nextLine();
			
			if(input.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			for(String st : v) {
				if(st.contains(input)) {
				System.out.println(st);
				check=true;
				}
			}
			
			
			if(check==false)
				System.out.println("ã�� �ܾ �����ϴ�.");
			
			check=false;
	
		}
		scan.close();

	}


	

	
}
