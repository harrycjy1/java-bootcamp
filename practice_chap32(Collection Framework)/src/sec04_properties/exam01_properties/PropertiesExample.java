package sec04_properties.exam01_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception{
		//Properties는 키와 값을 String으로 만들어진 Map컬렉셔닝다
		Properties properties = new Properties();
		
		//PropertieEample와 동이한 곳에 지금 property파일이 존재하므로 아래와 같이 패스 지정
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		//유니코드로 파일경로가 출력
		System.out.println(path);
		//path = URLDecoder.decode(path, "EUC-KR");
		//한글로 파일경로가 출력
		path = URLDecoder.decode(path, "utf-8");
		System.out.println(path);
		
		//첫번째 경로 읽는 법 (해당 폴더내 존재 할때 사용)
		properties.load(new FileReader(path));
		//두번째 경로 읽는 법(절대 경로)
		properties.load(new FileReader("D:\\java 작업 조진영\\practice_chap32(Collection Framework)\\src\\sec04_properties\\exam01_properties\\database.properties"));
		
		
		//키를 주고 값을 읽어옴
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		//얻어온 값을 출력해봄
		System.out.println("driver : "+driver);
		System.out.println("url : "+url);
		System.out.println("username : "+username);
		System.out.println("password : "+password);
	}

}
