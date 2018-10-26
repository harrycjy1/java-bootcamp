package sec12_verify;

public class Div {

	private int 	firstNum;
	private int		secondNum;
	
	
	public void setValue(int firstNum, int secondNum) {
		this.firstNum=firstNum;
		this.secondNum=secondNum;
	}
	int calculate() {
		return firstNum/secondNum;
	}
}
