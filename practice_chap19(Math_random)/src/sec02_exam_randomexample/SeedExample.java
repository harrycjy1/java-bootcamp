package sec02_exam_randomexample;

import java.util.Random;

public class SeedExample {

	public static void main(String[] args) {
	
		//math.random()�� RandomŬ������ ���� ū �������� ���ڰ�(Seed)�� ���� �Ҽ� �ִ°��� ����
		//Random���� ���ڰ��� �����ϸ�, �׻� ���� ������ ���� ������� ��ȯ�Ѵٴ� ��
		//public random(){this(system.currentTimeMillis());}�� ������ ȣ��
		
		Random rand1 = new Random();
		Random rand2 = new Random(1);
		Random rand3 = new Random(2);

		
		System.out.println("= rand1(�׻� �ٸ��� ��ȯ) =");
		
		for(int i=0; i<5; i++){
			int num = Math.abs(rand1.nextInt()%10)+1;
			System.out.println(num);
		}
		
		System.out.println();
		//rand2�� �׻� ���� ���� ������ ��ȯ�Ѵ�.
		System.out.println("=rand2(�׻� ���� �� ��ȯ) =");
		
		for(int i=0; i<5; i++) {
			System.out.println(i+":"+rand2.nextInt()%10);
		}
		System.out.println("=rand3(�׻� ���� �� ��ȯ) =");
		
		for(int i=0; i<5; i++) {
			System.out.println(i+":"+rand3.nextInt()%10);
		}
	
	
	}
}
