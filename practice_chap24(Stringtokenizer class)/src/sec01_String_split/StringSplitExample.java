package sec01_String_split;

public class StringSplitExample {

	public static void main(String[] args) {
		
		
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ֿ�ȣ/������";
		//�����ڸ� ����ǥ�������� �������� ������ �� �ִ�.
		String[] names = text.split("&|,|-|/");
		
		//���� for��
		for(String name : names) //�� �迭�� �׸��� name���� ����
			System.out.println(name);
			//�� for�� name �� names[i] ����ϴ°Ŷ� ����
		
	}

}
