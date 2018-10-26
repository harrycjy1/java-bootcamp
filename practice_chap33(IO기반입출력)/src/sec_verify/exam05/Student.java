package sec_verify.exam05;

import java.text.Format;

public class Student {

	final static int 	LEFT = 0;
	final static int 	CENTER = 1;
	final static int 	RIGHT = 2;
	String 			name = "";
	String 			studentNo = "";
	int 			koreanScore = 0;
	int 			mathScore = 0;
	int 			englishScore =0;


	public Student(String name, String studentNo, int koreanScore, int mathScore, int englishScore) {
		this.name=name;
		this.studentNo=studentNo;
		this.koreanScore=koreanScore;
		this.mathScore=mathScore;
		this.englishScore=englishScore;
	}
	
	public int getTotal() {
		return this.koreanScore+this.englishScore+this.mathScore;
	}
	
	static String format(String str, int alignment) {
		
		if(alignment == LEFT)
		return String.format("%-1s\t", str);
		
		else if (alignment == CENTER)
		return String.format("%s\t", str);
		
		else if (alignment==RIGHT)
		return String.format("%s\t", str);
		
		return str;
	}
	
	@Override
	public String toString() {
		
		
		return format(this.name, LEFT)+format(this.studentNo,RIGHT)+format(""+this.koreanScore,CENTER)+format(""+this.mathScore,CENTER)+
		format(""+this.englishScore,CENTER)+format(""+this.getTotal(),RIGHT);
		
		/*return this.name+"\t"+this.studentNo+"\t"+this.koreanScore+"\t"+this.mathScore+"\t"+this.englishScore+
				"\t"+getTotal();*/
	}
	
}
