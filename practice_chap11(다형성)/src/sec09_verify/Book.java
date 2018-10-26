package sec09_verify;

public class Book extends Product{

	//�������
	private	int			ISBN;
	private String		title;
	private String 		author;
	
	
	Book(int productID, String description, String maker, int price,int ISBN,String title,String author){
		super(productID,description,maker,price);
		this.ISBN=ISBN;
		this.title=title;
		this.author=author;
	}
	
	@Override
	public void showinfo() {
		super.showinfo();
		System.out.println("����ǥ�ص�����ȣ>>"+getISBN());
		System.out.println("å ����>>"+getTitle());
		System.out.println("����>>"+getAuthor());
	}

	
	
	
	
	//setter getter
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
	
}
