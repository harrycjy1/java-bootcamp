package sec_verify07;

public class UtilExample {

	public static void main(String[] args) {
	
	OtherPair<String,Integer> oa = new OtherPair<>("������",29);
	//Util.getValue(oa, "������");
	//Otherpair�� Pair�� ������� Ŭ�����̹Ƿ� getValue�޼����� �Ű������μ� ����� �Ұ����ϴ�.	
		
	Pair<String,Integer> pa = new Pair<>("ȫ�浿",35);
	System.out.println("Pair�� ��ü�� �����Ҷ�, Util�� getValue()�� ȣ���Ҷ� "
			+ "K�� ȫ�浿 �ְ� ����� V�� : "+Util.getValue(pa, "ȫ�浿"));
	
	ChildPair<String,String> ca = new ChildPair<>("ȫ���", "60");
	System.out.println("ChildPair�� ��ü �����Ҷ� K�� ȫ���,"
			+ " Util�� getValue()�� ȣ���� �� K�� ȫ��� �ְ� ����� V�� : "+Util.getValue(ca, "ȫ���"));
	
	}
	
}
