package sec_verify01;

public class DirectoryExample {

	public static void main(String[] args) {
		String  data = "D:/내폴더/photo/2016/travel/food.jpg";

		int location = data.indexOf("food");
		int location2 = data.indexOf(".");
		String filename = data.substring(location,location2);
		System.out.println("파일 이름 : "+filename);
		
		int lo3=data.indexOf("jpg");
		String extension = data.substring(lo3);
		System.out.println("확장자 : "+extension);
		
		String foldername = data.substring(0,location-1);
		System.out.println("폴더 이름 : "+foldername);
	}

}
