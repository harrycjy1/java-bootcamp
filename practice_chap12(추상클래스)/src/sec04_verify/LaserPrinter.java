package sec04_verify;

public class LaserPrinter extends Printer{
	
	static final int 	amountOfTonerToPrint=10;
	private int 		amountOfToner;

	
	public LaserPrinter(String modelName, String manufacturer,int numberOfPrinted,int numberOfpaper,int amountOfToner) {
		super(modelName,manufacturer,numberOfpaper,numberOfPrinted);
		this.amountOfToner=amountOfToner;
	}
	
	
	int getamountofToner() {
		return amountOfToner;
	}
	
	@Override
	public boolean print() {
		
		if(amountOfToner>=amountOfTonerToPrint && numberOfPaper>0) {
		--numberOfPaper;
		++numberOfPrinted;
		amountOfToner-=amountOfTonerToPrint;
		System.out.println("레이져 프린터 출력");
		System.out.println("제조사 : "+getManufacturer());
		System.out.println("모델명  : "+getModelName());
		System.out.println("레이저 프린터 >>인쇄용지 : "+getNumberOfPaper()+" 출력매수 : "+getNumberOfPrinted()+" 토너잔량 : "+getamountofToner());
		return true;
		}
		else {
			if(amountOfToner<amountOfTonerToPrint) {
				System.out.println("토너가 부족합니다.");
			}
			System.out.println("제조사 : "+getManufacturer());
			System.out.println("모델명  : "+getModelName());
			System.out.println("레이저 프린터 >>인쇄용지 : "+getNumberOfPaper()+" 출력매수 : "+getNumberOfPrinted()+" 토너잔량 : "+getamountofToner());
			return false;
		}
		
	}
	
	
	
}
