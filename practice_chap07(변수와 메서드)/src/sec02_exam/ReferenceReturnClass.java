package sec02_exam;

public class ReferenceReturnClass {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x=10;
		
		//�������� d�� �Ű������� ������. �ƿ﷯ ��ȯ���� dataŸ������ �޴´�.
		
		Data d2 = ReferenceReturnClass.copy(d);
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
		System.out.println("d�ּ� = "+d);
		System.out.println("d2�ּ� = "+d2);
		
	}

	
		public static Data copy(Data d) {
			Data tmp = new Data();
			tmp.x = d.x;
			System.out.println("tmp �ּ� = " +tmp);
			return tmp;
		}
}
