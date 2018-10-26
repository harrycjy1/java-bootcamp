package sec09_verify;

import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

public class Song {

	
	private String 		title;
	private String 		artist;
	private String 		album;
	private String[] 	composer;
	private int 		year;
	private int 		track;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String[] getComposer() {
		return composer;
	}
	public void setComposer(String[] composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	
	
	void show() {
			System.out.println(this.album+",\n"+this.artist+",\n"+this.title+",\n"+this.track+",\n"+this.year+",\n"+Arrays.toString(this.composer));
	}
	
	
	Song() {
		//this("엄마 부탁해요~","홍진영","엄마 부탁해요 OST",5,2016,"윤일상,한효주,김을동")
	}
	
	Song(String title, String artist, String album, int track, int year,String[] composer){
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.track=track;
		this.year=year;
		this.composer=composer;
		
		
		System.out.println("노래 제목 : "+this.title);
		System.out.println("가수 : "+ this.artist);	
		System.out.println("앨범 : "+ this.album);
		System.out.println("작곡가 : "+Arrays.toString(this.composer));
		System.out.println("년도 : "+this.year);
		System.out.println("트랙 : "+this.track);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
