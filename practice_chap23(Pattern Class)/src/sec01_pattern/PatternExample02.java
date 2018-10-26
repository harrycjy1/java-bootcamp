package sec01_pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample02 {

	public static void main(String[] args) {
		
		//data array
		String[] data = {
				"bat","baby","bonus","cA","ca","c","c0","car","c.","c#",
				"combat","count","date","disc","car"
						};
		
		String[] pattern = {
							".*","c[a-z]*","c[a-z]","c[a-zA-Z]",
							"c[a-zA-Z0-9","c.","c.*","c\\.","c\\w",
							"c\\d","c.*t","[b|c].*",".*a.*","/*a.+","[b|c].{2}"
							};
		
		for(int i=0; i<pattern.length; i++) {
			Pattern p = Pattern.compile(pattern[i]);
			System.out.print("Pattern : "+pattern[i]+" 결과 : ");
			
			for(int j=0; j<data.length; j++) {
				Matcher m = p.matcher(data[i]); //Pattern과 일치하는지 검사
				if(m.matches())//맞으면 출력
					System.out.print(data[i]+",");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
