package sec01_exam;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Array_Example06 {

	public static void main(String[] args) {
		
		
		char[] abc=new char[] {'a','b','c','d'};
		char[] num=new char[] {'0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc); //charŸ�� �迭�� toString �־�� �ּҰ� �θ���
		System.out.println(num);

		
		char[] result = new char[abc.length+num.length];
		
		
		//java.lang.system Ŭ���� API����
		//abc : �����迭, 0: abc�迭�� 0��° �ε���, result: Ÿ�ٹ迭
		//0: Ÿ�ٹ迭�� �ε��� abc.length:4��ŭ ����
		
		System.arraycopy(abc, 0, result, 0, abc.length);
	
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//�迭 abc�� �迭 num�� 0��° �ε������� �迭 abc�� ���̸�ŭ ����
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);//tostring���̸� �ּҰ�����
		
		//number�� �ε��� 6��ġ�� 3���� ����
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
		
		char[] newabc = new char[num.length-1];
		System.arraycopy(num, 0, newabc, 0, 4);
		System.arraycopy(num, 5, newabc, 4, num.length-6);
		System.out.println(newabc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
