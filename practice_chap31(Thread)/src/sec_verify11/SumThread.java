package sec_verify11;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class SumThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int sum =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ������ ������ ���� ���մϴ�");
		System.out.print("ù ��° ���� : ");
		int input1 = scan.nextInt();
		System.out.print("�� ��° ���� : ");
		int input2 = scan.nextInt();
		
		for(int i= input1; i<=input2; i++) {
			sum+=i;
		}
		return sum;
	}
}
