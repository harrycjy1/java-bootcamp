package sec01_list.exam02_Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		//����Ǵ� ��ü�� 
		Vector<Board> list = new Vector<>();
		//��ü �߰�
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));
		
		list.remove(2);
		list.remove(3);
		//list.setSize(15);
		
		//�ݺ���
		Iterator<Board> it = list.iterator();
		
		while(it.hasNext()) {
			Board board = it.next();
			System.out.println(board.subject +"\t"+board.content+"\t"+board.writer);
		}
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject +"\t"+board.content+"\t"+board.writer);
		}
		
		for(Board board : list) {
			System.out.println(board.subject +"\t"+board.content+"\t"+board.writer);
		}
		
	}

}
