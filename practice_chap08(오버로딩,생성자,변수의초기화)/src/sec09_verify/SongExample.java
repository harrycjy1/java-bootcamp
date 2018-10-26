package sec09_verify;

public class SongExample {

	public static void main(String[] args) {
		
		
		String[] composer = new String[] {"윤일상","한효주","김을동"};
		
		
				
		Song song = new Song("엄마 부탁해요~","홍진영","엄마 부탁해요 OST",5,2016,composer);//매개변수가 6개인 생성자호출
		
		System.out.println();
		//메서드
		song.show();


	}

}
