package sec01_pattern;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample01 {

	public static void main(String[] args) {
		
		String[] data = {
						"bat","baby","bonus","cA","ca","c","c0","car",
						"combat","count","date","disc"
						};

		
		Vector<String> vc = new Vector<String>();
		
		//Pattern�� ������ �����ϴµ� ���(ex c�� �����ϴ� �ҹ��� ���ܾ�)
		Pattern p = Pattern.compile("c[a-z]*");
		System.out.println("c�� �����ϴ� �ҹ��� ���ܾ ����մϴ�.");
		
		
		for(int i=0; i<data.length; i++) {
			//Matcher�� Pattern(���Խ�)�� ���ϴ� ����
			Matcher m = p.matcher(data[i]);
			
			//Pattern(���Խİ� ��ġ?
			if(m.matches()) {
				System.out.println(data[i]+",");
				vc.add(data[i]);
			}
		}
		System.out.println();
		System.out.println(vc.toString());
	
	
	
	}

}
