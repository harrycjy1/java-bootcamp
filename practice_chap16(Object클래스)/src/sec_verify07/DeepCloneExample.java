package sec_verify07;

public class DeepCloneExample {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10, 10, -5, -5);
		System.out.println("���� ���簢���� ����Ʈ");
		r1.showposition();
		System.out.println();//�ٶ���
		
		try{
			System.out.println("������ ���簢���� ����Ʈ");
			Rectangle r2 =(Rectangle) r1.clone();
			r2.changePos(2, 2, 7, 7);
			r2.showposition();
			}
		catch(CloneNotSupportedException e) {
			System.out.println("����");
		}

	
	}

}
