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
		System.out.println("������ ������ ���");
		System.out.println("������ : "+getManufacturer());
		System.out.println("�𵨸�  : "+getModelName());
		System.out.println("������ ������ >>�μ���� : "+getNumberOfPaper()+" ��¸ż� : "+getNumberOfPrinted()+" ����ܷ� : "+getamountofToner());
		return true;
		}
		else {
			if(amountOfToner<amountOfTonerToPrint) {
				System.out.println("��ʰ� �����մϴ�.");
			}
			System.out.println("������ : "+getManufacturer());
			System.out.println("�𵨸�  : "+getModelName());
			System.out.println("������ ������ >>�μ���� : "+getNumberOfPaper()+" ��¸ż� : "+getNumberOfPrinted()+" ����ܷ� : "+getamountofToner());
			return false;
		}
		
	}
	
	
	
}
