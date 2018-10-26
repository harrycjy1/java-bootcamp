package sec09_verify;

public class Book extends Product{

	//멤버변수
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
		System.out.println("국제표준도서번호>>"+getISBN());
		System.out.println("책 제목>>"+getTitle());
		System.out.println("저자>>"+getAuthor());
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
