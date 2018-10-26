package sec10_verify;

import java.util.Scanner;

public class BankApplicationPractice {

	
	private static Account[] accountArray=new Account[100];
	private static Scanner 	scan=new Scanner(System.in);
	
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("���»���");
		System.out.println("--------------");
		System.out.print("���¹�ȣ : ");
		String ano = scan.next();
		System.out.print("������ : ");
		String owner = scan.next();
		System.out.println("�ʱ��Աݾ� : ");
		int Balance = scan.nextInt();
		
		
		Account newacc = new Account(ano, owner, Balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray==null) {
				accountArray[i] = newacc;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
		}
		
	}
	
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("���¸��");
		System.out.println("--------------");
		
		for(int i=0; i<accountArray.length; i++) {
			Account acc=accountArray[i];
			System.out.print(acc.getAno()+"\t");
			System.out.print(acc.getOwner()+"\t");
			System.out.print(acc.getBalance());
			System.out.println();
		}
		
	}

	private static Account findAccount(String ano) {
		Account acc=null;
		
		for(int i=0; i<accountArray.length; i++) {
			String dbAno = accountArray[i].getAno();
			if(dbAno.equals(ano)) {
				acc=accountArray[i];
				break;
			}
		}
			
		return acc; 
	}








}
