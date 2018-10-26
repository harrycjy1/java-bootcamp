package sec05_verify;

import java.util.concurrent.SynchronousQueue;

public class Document {

	static int 	count=0;
	String 		name;    
	
	
	//기본형 생성자
	Document(){
		this("제목없음"+count++);//매개변수 1개짜리
	}
	
	Document(String name){
		this.name=name;
		System.out.println("문서 "+this.name+"가 생성되었습니다.");
	}
}
