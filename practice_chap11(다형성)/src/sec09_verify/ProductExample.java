package sec09_verify;

import java.util.Scanner;

public class ProductExample {

			static 	int productID = 0;
			static 	int numberOfProduct = 0;
			static 	Product[] p = new Product[10];
			
			
			
			private static void addProduct(int type) {
				
				Scanner scan = new Scanner(System.in);
				int index =0;
				System.out.print("��ǰ ���� : å(1), ����CD(2), ȸȭå(3)>>");
				productID=scan.nextInt();
				if(productID==1) {
				p[index]=new Book(0,null,null,0,0,null,null);
				
				p[index].setProductID(1);
				
				if(p[index] instanceof Book) {
				System.out.print("��ǰ���� >>");
				String description = scan.nextLine();
				p[index].setDescription(description);
				scan.nextLine();
				
				System.out.print("������ >>");
				String maker = scan.nextLine();
				p[index].setMaker(maker);
				
				System.out.print("���� >>");
				int price = scan.nextInt();
				p[index].setPrice(price);
				scan.nextLine();
				
				System.out.print("å ���� >>");
				String title = scan.nextLine();
				((Book)p[index]).setTitle(title);
				
				System.out.print("���� >>");
				String author = scan.nextLine();
				((Book)p[index]).setAuthor(author);
				
				System.out.print("����ǥ�ص�����ȣ(ex.0001) >> ");
				int iSBN = scan.nextInt();
				((Book)p[index]).setISBN(iSBN);
				}
				
				}
				
				if(productID==2) {
				p[index]=new CompactDisc(0, null, null, 0, null, null);
				
				if(p[index] instanceof CompactDisc) {
					
					p[index].setProductID(2);
					
					System.out.print("��ǰ���� >>");
					String description = scan.nextLine();
					p[index].setDescription(description);
					scan.nextLine();
					
					System.out.print("������ >>");
					String maker = scan.nextLine();
					p[index].setMaker(maker);
					
					System.out.print("���� >>");
					int price = scan.nextInt();
					p[index].setPrice(price);
					scan.nextLine();
					
					System.out.print("�ٹ� ���� >>");
					String albumTitle = scan.nextLine();
					((CompactDisc)p[index]).setAlbumTitle(albumTitle);
					
					System.out.print("���� >>");
					String artist = scan.nextLine();
					((CompactDisc)p[index]).setArtist(artist);
				}
				
				}
				
				if(productID==3) {
				p[index]=new ConversationBook(0, null, null, 0, 0, null, null, null);
				
				if(p[index] instanceof ConversationBook) {
					
					p[index].setProductID(3);
					
					System.out.print("��ǰ���� >>");
					String description = scan.nextLine();
					p[index].setDescription(description);
					scan.nextLine();
					
					System.out.print("������ >>");
					String maker = scan.nextLine();
					p[index].setMaker(maker);
					
					System.out.print("���� >>");
					int price = scan.nextInt();
					p[index].setPrice(price);
					scan.nextLine();
					
					System.out.print("å ���� >>");
					String title = scan.nextLine();
					((ConversationBook)p[index]).setTitle(title);
					
					System.out.print("���� >>");
					String author = scan.nextLine();
					((ConversationBook)p[index]).setAuthor(author);
					
					System.out.print("��� >> ");
					String language = scan.nextLine();
					((ConversationBook)p[index]).setLanguage(language);
					
					
					System.out.print("����ǥ�ص�����ȣ(ex.0001) >> ");
					int iSBN = scan.nextInt();
					((ConversationBook)p[index]).setISBN(iSBN);
					}
				}
				index++;
			}
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int index2=0;
		
		while(run) {
			System.out.print("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3)>>");
			int num1 = scan.nextInt();
			if(num1==1){
				addProduct(productID);
				index2++;
			}
			if(num1==2) {
				for(int i=0; i<index2; i++) {
					p[i].showinfo();
				}
			}
			if(num1==3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

}
