package sec_verify06;

public class StackExample {

	public static void main(String[] args) {
		
		
			Stack<String> Stringstack = new Stack<>(10);
			
			
			
			Stringstack.push("���");
			Stringstack.push("����");
			Stringstack.push("����");
			Stringstack.push("â��");
			Stringstack.push("����");
			Stringstack.push("��ǳ");
			Stringstack.push("�뱸");
			Stringstack.push("����");
			Stringstack.push("�λ�");
			Stringstack.push("����");
			
			Stringstack.push("�¹�");
			
			System.out.println("StringStack�� push��  ��ü�� pop()�� ���� ������½��ϴ�");
			for(int i=0; i<10; i++) {
				System.out.println((i+1)+"��° ��ü�� : "+Stringstack.pop());	
			}
			System.out.println();
			System.out.println();
			
			Stack<Integer> Intstack = new Stack<>(10);
			Intstack.push(100);
			Intstack.push(123);
			Intstack.push(164);
			Intstack.push(151);
			Intstack.push(187);
			Intstack.push(165);
			Intstack.push(532);
			Intstack.push(987);
			
			System.out.println("Intstack�� push��  ��ü�� pop()�� ���� ������½��ϴ�");
			for(int i=0; i<10; i++) {
				
				System.out.println((i+1)+"��° ��ü�� : "+Intstack.pop());	
				
			}
			

	}

}
