package sec04_verify;

public abstract class Printer {

	static int		USB;
	static int 		PARALLEL;
	private String 		modelName;
	private String 		manufacturer;
	private int 		type;		// USB �Ǵ� ���� ������
	protected int 		numberOfPrinted; 	// �μ���  ���� �ż�
	protected int 		numberOfPaper;	 	// ���� ���� �ż�
	
	
	
	Printer(String modelName, String manufacturer,int numberOfPrinted,int numberOfpaper){
		this.modelName=modelName;
		this.manufacturer=manufacturer;
		this.numberOfPaper=numberOfpaper;
		this.numberOfPrinted=numberOfPrinted;
		
		
		
	}



	public int getNumberOfPaper() {
		return numberOfPaper;
	}



	public void setNumberOfPaper(int numberOfPaper) {
		this.numberOfPaper = numberOfPaper;
	}



	public static int getUSB() {
		return USB;
	}



	public static int getPARALLEL() {
		return PARALLEL;
	}



	public String getModelName() {
		return modelName;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public int getType() {
		return type;
	}



	public int getNumberOfPrinted() {
		return numberOfPrinted;
	}
	
	
	abstract public boolean print();//�߻�޼���
	
	
	
	
}
