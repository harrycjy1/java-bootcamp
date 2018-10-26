package sec09_verify;

public class ConversationBook extends Book{
	
	private String 	language;
	
	public ConversationBook(int productID, String description, String maker, int price,int ISBN,String title,String author,String language) {
		super(productID,description,maker,price,ISBN,title,author);
		this.language=language;
	}

	public void showinfo() {
		super.showinfo();
		System.out.println("¾ð¾î>>"+getLanguage());
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	//getter, setter
	
	





}
