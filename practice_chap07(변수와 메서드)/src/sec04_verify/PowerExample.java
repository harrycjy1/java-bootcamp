package sec04_verify;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class PowerExample {

	public static void main(String[] args) {
		
		int x =0;
		int n =0;
		long sum =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� ���� ����մϴ�.");
		System.out.print("�����ϰ� ���� ���� �Է� : ");
		x=scan.nextInt();
		System.out.print("����� ���ұ��? :");
		n=scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum += power(x, i);
		}
		System.out.println(sum);		
		
	
		

	}

		static long power(int x,int n) {
		
		long result =0L;
		result = (n==1)? x:x*power(x,n-1);
			
		return result;
			
		}

}


/*int result=0;
int tmp=1;
for(int i=0; i<n; i++) {
	 tmp *= x;
	 result += tmp;
     			 
}
System.out.println(x+"�� "+n+"�� ������ ����"+result+"�Դϴ�.");
return result;*/