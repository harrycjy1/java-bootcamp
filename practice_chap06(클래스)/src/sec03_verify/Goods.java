package sec03_verify;

public class Goods {


	private String		name;
	private int 		price;
	private int 		numberOfStock;
	private int 		sold;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}

	
	@Override
	public String toString() {
		String str = "��ǰ �̸�\t:"+getName()+"\n��ǰ ����\t:"+getPrice()+"\n��� ����\t:"
				+getNumberOfStock()+"\n�ȸ� ����\t:"+getSold();
		return str; 
	}

	
	
}