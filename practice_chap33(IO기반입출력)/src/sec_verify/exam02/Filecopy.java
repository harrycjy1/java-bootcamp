package sec_verify.exam02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Filecopy {

	public static void main(String[] args) throws Exception{
		
		Reader reader = new FileReader("D:\\text.txt");
		int readdata = 0;
		char[] cbuf = new char[20];
		String str = "";
		while(true) {
			readdata = reader.read(cbuf);
			
			if(readdata==-1)
				break;
			str += new String(cbuf,0,readdata);
			
		}

		
		reader.close();
		
		Writer writer = new FileWriter("D:\\text_บนป็บป.txt");
		writer.write(str);
		writer.flush();
		writer.close();
		

	}

}
