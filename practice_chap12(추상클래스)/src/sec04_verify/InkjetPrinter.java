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
		System.out.println("��ũ�� ������ ���");
		System.out.println("������ : "+getManufacturer());
		System.out.println("�𵨸�  : "+getModelName());
		System.out.println("������ ������ >>�μ���� : "+getNumberOfPaper()+" ��¸ż� : "+getNumberOfPrinted()+" ��ũ�ܷ� : "+getAmountOfInk());
		return true;
		}
		
		else {
			if(amountOfInk<amountOfInkToPrint) {
				System.out.println("��ũ�� �����մϴ�.");
			}
			System.out.println("��ũ�� ������ ���");
			System.out.println("������ : "+getManufacturer());
			System.out.println("�𵨸�  : "+getModelName());
			System.out.println("������ ������ >>�μ���� : "+getNumberOfPaper()+" ��¸ż� : "+getNumberOfPrinted()+" ��ũ�ܷ� : "+getAmountOfInk());
			return false;
		}
	}

}
