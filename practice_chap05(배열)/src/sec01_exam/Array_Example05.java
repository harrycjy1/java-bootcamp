package sec01_exam;

public class Array_Example05 {

	public static void main(String[] args) {
	
		
		
		int[] arr= new int[5];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
			System.out.println("���� ��  arr.length : "+arr.length);
			System.out.println("������ arr�ּҰ�"+arr);
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
			}
		
		int[] tmp = new int[arr.length*2];
		
		for (int i=0; i<arr.length; i++) {
			tmp[i]= arr[i];
		}
		
		arr= tmp;//tmp�� ����� �ּҰ��� arr�� �����Ѵ�.
				//���� arr�� �ּҰ��� ������� �������� ������ �迭���� GC�� ����.
		
		System.out.println("������ arr�ּҰ�"+arr);//tmp�� �ּҰ��� �����ͼ� ���Ѱ��� �˼� ����.
		System.out.println("���� �� arr.length : "+arr.length);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
