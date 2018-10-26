package sec10_verify;

import java.util.Scanner;

public class BankApplication {

   private static Account[] accountarray = new Account[100];
   private static Scanner scanner = new Scanner(System.in);
   
   //���� ����
   private static void createAccount() {
      System.out.println("-----------------");
      System.out.println("���� ����");
      System.out.println("-----------------");
      
      System.out.print("���¹�ȣ : ");
      String ano = scanner.next();
      
      System.out.print("������ : ");
      String owner = scanner.next();
      
      System.out.print("�ʱ��Աݾ� : ");
      int balance = scanner.nextInt();
      
      //Attach �۾�
      Account newAccount = new Account(ano, owner, balance);
      for(int i = 0; i<accountarray.length; i++) {
         if(accountarray[i] == null) {
            accountarray[i] = newAccount;
            System.out.println("��� : ���°� �����Ǿ����ϴ�.");
            break;   
         }
      }
   }
   
   //���� ��� ����
   private static void accountList() {
      
         System.out.println("-----------------");
         System.out.println("���� ���");
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
   
   
   //�����ϱ�
   private static void deposit() {
      
      System.out.println("-----------------");
      System.out.println("�����ϱ�");
      System.out.println("-----------------");
      
      System.out.print("���¹�ȣ : ");
      String ano = scanner.next();
      
      System.out.print("���ݾ� : ");
      int money = scanner.nextInt();
      
      Account account = findAccount(ano);
      if(account == null) {
         System.out.println("��� : ���°� �����ϴ�.");
         return;
      }
      account.setBalance(account.getBalance() + money);
      System.out.println("��� : ���ݿ� �����Ͽ����ϴ�.");
   }
   
   //����ϱ�
   private static void withdraw() {
      
      System.out.println("-----------------");
      System.out.println("����ϱ�");
      System.out.println("-----------------");
      
      System.out.print("���¹�ȣ : ");
      String ano = scanner.next();
      
      System.out.print("��ݾ� : ");
      int money = scanner.nextInt();
      
      Account account = findAccount(ano);
      if(account == null) {
         System.out.println("��� : ���°� �����ϴ�.");
         return;
      }
   account.setBalance(account.getBalance() - money);
   System.out.println("��� : ��ݿ� �����Ͽ����ϴ�.");
   System.out.println("���� �ܾ� : " + account.getBalance());
   }
   
   
   private static Account findAccount(String ano) {
      
      Account account = null;
      
      for(int i = 0; i<accountarray.length; i++) {
         if(accountarray[i] != null) {
            String dbAno = accountarray[i].getAno();//�迭Ÿ��.�ż���
            //string�� equals�� ���� ����
            if(dbAno.equals(ano)) {
               account = accountarray[i];
               break;
               //��ü�迭�� ����Ǿ��ִ� ���¹�ȣ�� ��ġ�ϴ� ���� ã�������� ����
            }
         }  
      }
      return account;
   }
   
   
   
   public static void main(String[] args) {
      
      boolean run = true;
      
      while(run) {
         System.out.println("------------------------------------------------------------");
         System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
         System.out.println("------------------------------------------------------------");
         System.out.println("���� > ");
         
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
      System.out.println("���α׷� ����");
   }

}