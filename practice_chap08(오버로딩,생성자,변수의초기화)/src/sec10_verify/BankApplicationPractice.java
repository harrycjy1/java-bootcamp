package sec10_verify;

import java.util.Scanner;

public class BankApplicationPractice {

	
	private static Account[] accountArray=new Account[100];
	private static Scanner 	scan=new Scanner(System.in);
	
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		System.out.print("계좌번호 : ");
		String ano = scan.next();
		System.out.print("계좌주 : ");
		String owner = scan.next();
		System.out.println("초기입금액 : ");
		int Balance = scan.nextInt();
		
		
		Account newacc = new Account(ano, owner, Balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray==null) {
				accountArray[i] = newacc;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
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
