package sec01_stack_queue.exam01_Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
			//coin�� �����ϴ� Stack�÷����� ������
			Stack<Coin> coinBox = new Stack<>();
			
			//coinBox���� ������ ����(���Լ���)
			coinBox.push(new Coin(100));
			coinBox.push(new Coin(150));
			coinBox.push(new Coin(50));
			coinBox.push(new Coin(70));
			coinBox.push(new Coin(60));
			coinBox.push(new Coin(90));
			
			while(!coinBox.isEmpty()) {
				Coin coin = coinBox.pop();
				
				System.out.println("������ ���� : "+coin.getValue());
			}
			

	}

}
