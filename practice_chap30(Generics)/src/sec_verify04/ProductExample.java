package sec_verify04;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<String,Audio> p1 = new Product<>();
		p1.setA("�����");
		p1.setM(new Audio("Sony","�ֻ�",4));
		Audio a = p1.getM();
		
		System.out.println("�� "+p1.getA()+"�� "+a.getBrand()+" �������̸�, ������ "+a.getQuality()+"�̰�, "+a.getChannel()+"ä���̴�");
		System.out.println();
		Product<Integer,Monitor> p2 = new Product<>();
		p2.setA(350000);
		p2.setM(new Monitor("�Ｚ",27));
		Monitor m = p2.getM();
		
		System.out.println("������� ��");
		System.out.println("�귣�� : "+m.getCompany()+"\n��ġ : "+m.getInch()+"\n���� : "+p2.getA());

	}

}
