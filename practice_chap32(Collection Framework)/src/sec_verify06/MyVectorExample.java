package sec_verify06;

public class MyVectorExample {

	public static void main(String[] args) {
		

		MyVector v = new MyVector();
		v.add("2000");
		v.add("15");
		v.add("-20");
		v.add("993");
		v.add("4000");

		System.out.println("1�� �ε��� �� : " + v.get(1));
		System.out.println("���� �� : " + v.toString());
		System.out.println("��ü �� : " + v.size());
		System.out.println("�뷮 : " + v.capacity());

		System.out.println();
		v.remove("2000");
		v.remove("993");		
		System.out.println("���� �� : " + v.toString());
		System.out.println("��ü �� : " + v.size());
		System.out.println("�뷮 : " + v.capacity());

		v.clear();
		System.out.println();
		System.out.println("��ü ���� �� : " + v.toString());
		System.out.println("��ü �� : " + v.size());
		System.out.println("�뷮 : " + v.capacity());
		
		
		/*��°��
		1�� �ε��� �� : 15
		���� �� : [2000,15,-20,993,4000]
		��ü �� : 5
		�뷮 : 10
		
		���� �� : [15,-20,4000]
		��ü �� : 3
		�뷮 : 10
		
		��ü ���� �� : []
		��ü �� : 0
		�뷮 : 10*/

		
		
		
	}

}
