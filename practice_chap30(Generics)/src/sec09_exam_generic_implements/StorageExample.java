package sec09_exam_generic_implements;

public class StorageExample {

	public static void main(String[] args) {
			//�������̽� ���׸� Ÿ���� ���������� ����Ŭ������ �����ϰ� �ִ�(������)
			Storage<String> st = new storageImpl<>(10);
			
			//���׸� �������̽� Ÿ���� ���� ������ ����Ŭ������ �޼��带 ȣ��
			for(int i=0; i<10; i++) {
				st.add("����ī"+(i+1), i);
			}
			
			for(int i=0; i<10; i++) {
				String str = st.get(i);
				System.out.println("����� ��ü �迭["+i+"] : "+str);
			}
			
			System.out.println();
			
			//���� Ŭ������ ���������� ������ �������̽��� ������ ����Ŭ������ �޼��带 ȣ��
			 storageImpl<Integer> si = new storageImpl<>(10);
			 
			 for(int i=0; i<10; i++) {
					si.add(100+(i+1), i);
				}
			 
			for(int i=0; i<10; i++) {
					int num = si.get(i);
					System.out.println("����� ��ü �迭["+i+"] : "+num);
				}
	}

}
