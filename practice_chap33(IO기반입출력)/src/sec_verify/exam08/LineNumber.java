package sec_verify.exam08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LineNumber {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ؽ�Ʈ ���� �̸��� �Է��ϼ���");
		String input = scan.nextLine();
		
		FileReader file = new FileReader(input);
		BufferedReader br = new BufferedReader(file);
		
		int i=1;
		
		while((input=br.readLine()) != null) {
		System.out.print(i+" :");
		System.out.println(input);
		i++;
		}
		
	}

}
