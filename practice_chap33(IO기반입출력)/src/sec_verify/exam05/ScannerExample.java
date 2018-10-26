package sec_verify.exam05;

import java.io.File;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		
		Score score = new Score();
		Scanner sc = new Scanner(new File("D:\\java 작업 조진영\\practice_chap33(IO기반입출력)\\src\\sec_verify\\exam05\\scoredata"));
		
		while (sc.hasNextLine()) {
		String line = sc.nextLine();
		Scanner sc2 = new Scanner(line).useDelimiter(",");
		score.add(sc2.next(), sc2.next(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt());
	}
	score.displayList();
	sc.close();

	}

}
