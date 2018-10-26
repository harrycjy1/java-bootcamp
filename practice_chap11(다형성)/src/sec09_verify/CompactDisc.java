package sec09_verify;

public class CompactDisc extends Product{
	
	//멤버변수
	private String 		albumTitle;
	private String 		artist;
	
	//생성자
	public CompactDisc(int productID, String description, String maker, int price,String albumTitle,String artist){
		super(productID,description,maker,price);
		this.albumTitle=albumTitle;
		this.artist=artist;
	}

	public void showinfo() {
		super.showinfo();
		System.out.println("앨범 제목 >>"+getAlbumTitle());
		System.out.println("가수>>"+getArtist());
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	
	
	
}
