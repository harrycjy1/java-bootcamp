package sec09_verify;

public class CompactDisc extends Product{
	
	//�������
	private String 		albumTitle;
	private String 		artist;
	
	//������
	public CompactDisc(int productID, String description, String maker, int price,String albumTitle,String artist){
		super(productID,description,maker,price);
		this.albumTitle=albumTitle;
		this.artist=artist;
	}

	public void showinfo() {
		super.showinfo();
		System.out.println("�ٹ� ���� >>"+getAlbumTitle());
		System.out.println("����>>"+getArtist());
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
