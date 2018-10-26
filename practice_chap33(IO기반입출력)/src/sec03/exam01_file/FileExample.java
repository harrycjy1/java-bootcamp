package sec03.exam01_file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception	{
		
		File dir = new File("D:\\example\\dir");
		File file1 = new File("D:\\example\\text_복사본.txt");
		File file2 = new File(new URI("file:///D:/example/file2.txt"));
		
		//local pc이기 때문에 localhost를 생략해도 무방하다
		
		/* URI란 원래 통합자원 식별자(Uniform Resource Identifierm URI)는
		인터넷에 있는 자원을 나타내는 유일한 주소를 말한다. URI의 존재는 인터넷에서 
		요구되는 기본저건으로서 인터넷 프로토콜(통신양식)에 붙는다
		소켓 프로그래밍에서 자주 나오니 개념을 알도록 하자. 프로토콜(HTTP혹은 FTP) + : + / + 호스트이름  + 주소*/
		
		/*원래 IP주소나 호스트주소가 와야한다.
		 * File file3 = new File(new URI("file://localhost/C:/temp/file3.txt"));
		 * URI는 파일이라는 schema가 필요하다
		 * URI표기법에 따르지 아니하면 IllegalArgumentException바생함
		 * File file3 = new File(new URI("C:/temp/file3.txt"));
		 */
		
		//dir디렉토리가 존재하는가?
		if(dir.exists() ==false)
			//dir.mkdirs(); 부모디렉토리는 생성하지 아니하고 자신만 생성한다.
			//경로상 없는 디렉토르리르 다생성한다(권장) 있어도 덮어씀
			dir.mkdirs();
		
		if(file1.exists() == false)
			//만약 C:/temp/file1.txt경로에 Temp디렉토리가없다면 IOException이 발생하므로 
			//반드시 디렉토리 생서이나 경로를 잘 설정해야 한다.
			file1.createNewFile();
		
		if(file2.exists()==false)
			file2.createNewFile();
		
		//File객체를 하나 만든다
		File temp = new File("D:\\example");
		//Temp하위 서브디렉토리및 파일을 파일 배열로 생성하여 리턴함
		File[] contents = temp.listFiles();
		
		System.out.println("날짜\t\t시간\t형태\t크기\t이름");
		System.out.println("--------------------------------------------");
		
		//수정날자의 출력형태를 결정하기 위해 아래와 같이 SimpleDateFormat객체를 생성한다
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:MM");
		
		//리턴받은 File[]을 출력해본다,
		
		for(File file : contents) {
			//파일의 수정한 날짜를 매개값으로 DATA객체를 생성하여 SimpleDateFormat객체의 Format()의 매개타입으로 준다.
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			//file이 데릭토리이냐?
			if(file.isDirectory()) {
				System.out.print("\t[DIR]\t\t"+file.getName());
			}
			
			//file이면
			else {
				System.out.print("\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}
	
	}	

}
