package sec_verify04;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		Board bo1 = new Board("�̰��� �ڹٴ�","�ſ��");
		Board bo2 = new Board("�ڹ��� ����","���ü�");
		Board bo3 = new Board("��ǰ �ڹ� ���α׷���","Ȳ����");
		
		List<Board> bo = new ArrayList<>();
		bo.add(bo1);
		bo.add(bo2);
		bo.add(bo3);
		
		
		BoardDao dao = new BoardDao();
		System.out.println("���� list�� ����Ǿ� �ִ� Board��ü���Դϴ�.");
		for(int i=0; i<bo.size(); i++) {
			System.out.println(dao.getBoardList(bo).get(i).getTitle()+" : "
								+dao.getBoardList(bo).get(i).getContent());
			}

	}

}
