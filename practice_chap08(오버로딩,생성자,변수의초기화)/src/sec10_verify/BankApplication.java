package sec10_verify;

import java.util.Scanner;

public class BankApplication {

   private static Account[] accountarray = new Account[100];
   private static Scanner scanner = new Scanner(System.in);
   
   //계좌 생성
   private static void createAccount() {
      System.out.println("-----------------");
      System.out.println("계좌 생성");
      System.out.println("-----------------");
      
      System.out.print("계좌번호 : ");
      String ano = scanner.next();
      
      System.out.print("계좌주 : ");
      String owner = scanner.next();
      
      System.out.print("초기입금액 : ");
      int balance = scanner.nextInt();
      
      //Attach 작업
      Account newAccount = new Account(ano, owner, balance);
      for(int i = 0; i<accountarray.length; i++) {
         if(accountarray[i] == null) {
            accountarray[i] = newAccount;
            System.out.println("결과 : 계좌가 생성되었습니다.");
            break;   
         }
      }
   }
   
   //계좌 목록 보기
   private static void accountList() {
      
         System.out.println("-----------------");
         System.out.println("계좌 목록");
         System.out.println("-----------------");
         
         for(int i = 0; i < accountarray.length; i++) {
            
            Account account = accountarray[i];
            if(account != null) {
               System.out.print(account.getAno());
               System.out.print("\t");
               System.out.print(account.getOwner());
               System.out.print("\t");
               System.out.print(account.getBalance());
               System.out.print("\t");
               System.out.println();
            }
         }
      }
   
   
   //예금하기
   private static void deposit() {
      
      System.out.println("-----------------");
      System.out.println("예금하기");
      System.out.println("-----------------");
      
      System.out.print("계좌번호 : ");
      String ano = scanner.next();
      
      System.out.print("예금액 : ");
      int money = scanner.nextInt();
      
      Account account = findAccount(ano);
      if(account == null) {
         System.out.println("결과 : 계좌가 없습니다.");
         return;
      }
      account.setBalance(account.getBalance() + money);
      System.out.println("결과 : 예금에 성공하였습니다.");
   }
   
   //출금하기
   private static void withdraw() {
      
      System.out.println("-----------------");
      System.out.println("출금하기");
      System.out.println("-----------------");
      
      System.out.print("계좌번호 : ");
      String ano = scanner.next();
      
      System.out.print("출금액 : ");
      int money = scanner.nextInt();
      
      Account account = findAccount(ano);
      if(account == null) {
         System.out.println("결과 : 계좌가 없습니다.");
         return;
      }
   account.setBalance(account.getBalance() - money);
   System.out.println("결과 : 출금에 성공하였습니다.");
   System.out.println("현재 잔액 : " + account.getBalance());
   }
   
   
   private static Account findAccount(String ano) {
      
      Account account = null;
      
      for(int i = 0; i<accountarray.length; i++) {
         if(accountarray[i] != null) {
            String dbAno = accountarray[i].getAno();//배열타입.매서드
            //string의 equals는 값을 비교함
            if(dbAno.equals(ano)) {
               account = accountarray[i];
               break;
               //객체배열에 저장되어있는 계좌번호와 일치하는 값을 찾을때까지 비교함
            }
         }  
      }
      return account;
   }
   
   
   
   public static void main(String[] args) {
      
      boolean run = true;
      
      while(run) {
         System.out.println("------------------------------------------------------------");
         System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
         System.out.println("------------------------------------------------------------");
         System.out.println("선택 > ");
         
         int selectno = scanner.nextInt();
         
         if(selectno == 1) {
            createAccount();
         }
         else if(selectno == 2) {
            accountList();
         }
         else if(selectno == 3) {
            deposit();
         }
         else if(selectno == 4) {
            withdraw();
         }
         else if(selectno == 5) {
            run = false;
         }
      }
      System.out.println("프로그램 종료");
   }

}