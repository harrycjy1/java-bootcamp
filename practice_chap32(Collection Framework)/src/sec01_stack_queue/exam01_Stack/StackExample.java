package sec01_stack_queue.exam01_Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
			//coin을 저장하는 Stack컬렉션을 생성함
			Stack<Coin> coinBox = new Stack<>();
			
			//coinBox에서 동전을 저장(후입선출)
			coinBox.push(new Coin(100));
			coinBox.push(new Coin(150));
			coinBox.push(new Coin(50));
			coinBox.push(new Coin(70));
			coinBox.push(new Coin(60));
			coinBox.push(new Coin(90));
			
			while(!coinBox.isEmpty()) {
				Coin coin = coinBox.pop();
				
				System.out.println("꺼내온 동전 : "+coin.getValue());
			}
			

	}

}
