package sec04_exam_cardDeck;

public class DeckExample {

	public static void main(String[] args) {
		
		Deck d = new Deck(); //ī�� �ѹ� ����
		Card c = new Card(); //������ ���� ���� ī�带 �̴´�.
		
		System.out.print("ī�弯���� ���� ���� �ִ� ī�� : ");
		System.out.println(c.toString());
		
		d.shuffle(); //ī�带 ���´�.
		
		c = d.pick(0);	//���� �Ŀ� ���� ���� ī�带 �̴´�.
		System.out.print("ī�带 ���� �� ���� ���� �ִ� ī�� : ");
		System.out.println(c.toString());
		
		c = d.pick(10); //11��° ī�带 �̴´�.
		
		System.out.print("ī�� ���� �� 11��°�� �ִ� ī�� : ");
		System.out.println(c.toString());
		
		c = d.pick();
		System.out.print("ī�带 ���Ƿ� �̾ƺ� ī�� : ");
		System.out.println(c.toString());
		
	}

}
