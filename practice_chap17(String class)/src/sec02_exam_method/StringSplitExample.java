package sec02_exam_method;

public class StringSplitExample {

	public static void main(String[] args) {
		
		String animals = "dog/cat/bear";
		String animals1 = "dog/cat,bear&abc";
		
		//split�޼���� �Ű������� ����ǥ������ �´�. �Ͽ�
		//����ǥ������ ������ ���ڿ��� �����Ͽ� String �迭�� ������.
		
		String[] arr = animals.split("/");
		String[] arr2 = animals1.split("/|,|&");
		
		
		//for each���� �迭�� ���� ��븸 ����, ������ �Ұ��� �ϴ�.
		for(String s : arr) {
			System.out.println(s);
		}
		
		for(String s : arr2) {
			System.out.println(s);
		}

	}

}
