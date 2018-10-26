package sec_verify04;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		Board bo1 = new Board("이것이 자바다","신용권");
		Board bo2 = new Board("자바의 정석","남궁성");
		Board bo3 = new Board("명품 자바 프로그래밍","황기태");
		
		List<Board> bo = new ArrayList<>();
		bo.add(bo1);
		bo.add(bo2);
		bo.add(bo3);
		
		
		BoardDao dao = new BoardDao();
		System.out.println("현재 list에 저장되어 있는 Board객체들입니다.");
		for(int i=0; i<bo.size(); i++) {
			System.out.println(dao.getBoardList(bo).get(i).getTitle()+" : "
								+dao.getBoardList(bo).get(i).getContent());
			}

	}

}
