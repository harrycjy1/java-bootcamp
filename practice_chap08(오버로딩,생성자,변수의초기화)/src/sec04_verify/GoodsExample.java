package sec04_verify;

import java.util.Scanner;

public class GoodsExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Goods good1 = new Goods("���̴�",1000,200,50);
		Goods good2 = new Goods("�ݶ�",1000,100,50);
		
		System.out.println("��� ��ǰ�� �Է¹����ðڽ��ϱ�?");
		
		int input = scan.nextInt();
		
		
		System.out.println("1��° ��ǰ �̸� : "+ good1.name);
		System.out.println("1��° ��ǰ ���� : "+ good1.price);
		System.out.println("1��° ��ǰ ��� : "+ good1.numberOfStock);
		System.out.println("1��° ��ǰ �ȸ� ���� : "+ good1.sold);
		System.out.println();//�ٹٲ�
		
		System.out.println("2��° ��ǰ �̸� : "+ good2.name);
		System.out.println("2��° ��ǰ ���� : "+ good2.price);
		System.out.println("2��° ��ǰ ��� : "+ good2.numberOfStock);
		System.out.println("2��° ��ǰ �ȸ� ���� : "+ good2.sold);
		System.out.println();
		
		System.out.println("�Է��Ͻ� ��ǰ�� �̸�, ����, ���, �ȸ����� �� ��Ȳ�Դϴ�.");
		System.out.println(good1.name+" "+good1.price+" "+good1.numberOfStock+" "+good1.sold);
		System.out.println(good2.name+" "+good2.price+" "+good2.numberOfStock+" "+good2.sold);

	}

}
