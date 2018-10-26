package sec04_verify;

public class InkjetPrinter extends Printer{
	
	
	static final int 	amountOfInkToPrint =5;	
	private int 		amountOfInk;
	
	
	public InkjetPrinter(String modelName, String manufacturer,int numberOfPrinted,int numberOfpaper,int amountOfInk) {
		super(modelName,manufacturer,numberOfpaper,numberOfPrinted);
		this.amountOfInk=amountOfInk;
		
		
	}
	
	
	int getAmountOfInk() {
		
		return amountOfInk;
	}
	
	@Override
	public boolean print() {
		
		if(amountOfInk>=amountOfInkToPrint&&numberOfPaper>0) {
			--numberOfPaper;
			++numberOfPrinted;
			amountOfInk -=amountOfInkToPrint;
		System.out.println("잉크젯 프린터 출력");
		System.out.println("제조사 : "+getManufacturer());
		System.out.println("모델명  : "+getModelName());
		System.out.println("레이저 프린터 >>인쇄용지 : "+getNumberOfPaper()+" 출력매수 : "+getNumberOfPrinted()+" 잉크잔량 : "+getAmountOfInk());
		return true;
		}
		
		else {
			if(amountOfInk<amountOfInkToPrint) {
				System.out.println("잉크가 부족합니다.");
			}
			System.out.println("잉크젯 프린터 출력");
			System.out.println("제조사 : "+getManufacturer());
			System.out.println("모델명  : "+getModelName());
			System.out.println("레이저 프린터 >>인쇄용지 : "+getNumberOfPaper()+" 출력매수 : "+getNumberOfPrinted()+" 잉크잔량 : "+getAmountOfInk());
			return false;
		}
	}

}
