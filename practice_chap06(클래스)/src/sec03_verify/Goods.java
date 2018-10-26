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
		String str = "상품 이름\t:"+getName()+"\n상품 가격\t:"+getPrice()+"\n재고 수량\t:"
				+getNumberOfStock()+"\n팔린 수량\t:"+getSold();
		return str; 
	}

	
	
}