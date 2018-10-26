package sec_verify08;

import java.util.Arrays;

public class DeepCloneDriveExample {

	public static void main(String[] args) {
		
		System.out.println("[원본 드라이브의 필드 값]");
		Drive d1 = new Drive("C드라이브",500,new String[]{"윈도우폴더","시스템폴더"},new Folder("야시꾸리한거",15));
		
		System.out.println("이름 : "+d1.name);
		System.out.println("크기 : "+d1.size);
		System.out.println("폴더 목록 : "+Arrays.toString(d1.driverList));
		System.out.println("새 폴더명 : "+d1.folder.name);
		System.out.println("크기 : "+d1.folder.size);
		
		System.out.println();
		
		Drive d2=d1.getDrive();//깊은 복제 실행
		
		
		System.out.println("[복제된 드라이브 필드 값]");
		System.out.println("이름 : "+d2.name);
		System.out.println("크기 : "+d2.size);
		System.out.println("폴더 목록 : "+Arrays.toString(d2.driverList));
		System.out.println("새 폴더명 : "+d2.folder.name);
		System.out.println("크기 : "+d2.folder.size);
		
	}

}
