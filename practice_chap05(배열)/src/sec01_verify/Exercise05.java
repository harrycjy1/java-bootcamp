package sec01_verify;

public class Exercise05 {

	public static void main(String[] args) {
		
		
		int[] numArr = new int[10];
		
		System.out.println("������ �迭 ������ ���");
		
		for(int i=0; i<numArr.length; i++){
			numArr[i]=i;
			if(i==9) {
			System.out.print(numArr[i]);
			}
			else {
				System.out.print(numArr[i]+","); // ��°� ���� �޸��� ������� if/else�ۼ�
												//�޸��� ���� �ʾƵ� �ȴٸ� if�� ������� �ʾƵ� ��
			}
		}
		System.out.println();//�ٳѱ�
		
		System.out.println("���� ���Ƿ� ���� �� ���");
	
		for(int i=0; i<10; i++) {
		int r=(int)(Math.random()*10);
		int tmp = numArr[9];
		numArr[9]=numArr[r];
		numArr[r]=tmp; //���Ƿ� ���´ٴ� ���� ��� �ڸ��� �ε����� ��ġ�� �ٲٸ� �ȴٴ� ��
					   //r�� �������� 0~9������ ���ڰ� �ݺ��ؼ� �����ȴ�
					   //numArr[r]�� r��° �ε����� �� �� ���� ù��° �ε����� numArr[1]�̳� numArr[9]�� 
		               //��� �ؼ� �ڸ��� �ٲ��ָ� r���� �����̱� ������ �ڸ��� ���Ƿ� ���̰� �ȴ�.
		}
		
		for(int i=0; i<numArr.length; i++) {
			
			if(i==9) {
			System.out.print(numArr[i]);
				}
			else {
			System.out.print(numArr[i]+","); // ��°� ���� �޸��� ������� if/else�ۼ�
													//�޸��� ���� �ʾƵ� �ȴٸ� if�� ������� �ʾƵ� ��
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
