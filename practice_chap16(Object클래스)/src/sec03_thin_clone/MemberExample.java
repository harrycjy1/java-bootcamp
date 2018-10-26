package sec03_thin_clone;

public class MemberExample {

	public static void main(String[] args) {
		
		Member original = new Member("blue","ȫ�浿","12345",25,true,new int[] {90,100});
		
		//��������� ������ü�� ������ ���� clone�� �ؼ� ������ü�� ���� �۾��� ���� �Ѵ�.
		Member cloned = original.getMember();	//���� ������ �ν��Ͻ� ������ ��.
		
		cloned.password = "978910";
		
		
		cloned.scores[0] = 88; //���� ������ original�� ���� ����(������ �����ϰ� �ֱ� ����)
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id : "+original.id);
		System.out.println("name : "+original.name);
		System.out.println("password : "+original.password);
		System.out.println("age : "+original.age);
		System.out.println("adult : "+original.adult);
		System.out.println("���� �迭 �ּ� : "+original.scores.toString());
		System.out.print("scores : {");
		
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))? "": " ");
		}
		
		System.out.println("}");
		
		System.out.println("[���� ��ü�� �ʵ� ��]");
		System.out.println("id : "+cloned.id);
		System.out.println("name : "+cloned.name);
		System.out.println("password : "+cloned.password);
		System.out.println("age : "+cloned.age);
		System.out.println("adult : "+cloned.adult);
		System.out.println("���� �迭 �ּ� : "+cloned.scores.toString());
		System.out.print("scores : {");
		
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))? "": " ");
		}
		
		System.out.println("}");
	
	
	
	
	}

}
