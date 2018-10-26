package sec_verify02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortSearchExample {
	
	public static Student findstu(Student[] arr,String input) {
		for(int i=0; i<arr.length; i++) {
		
			if(arr[i].getHakbun().equals(input))
			return arr[i];
		
	
		}
		return null;
			
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 >>");
		int input = scan.nextInt();
		
		Student[] arr = new Student[input];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("["+(i)+"]번째 학생 학번 : ");
			String input1 = scan.next();
			System.out.print("["+(i)+"]번째 학생 이름 : ");
			String input2 = scan.next();
			arr[i]=new Student(input1,input2);
			
		}
		System.out.println("-----------------------------------------");
		Arrays.sort(arr);
		System.out.println("학번 내림차순대로 정렬합니다.");
		int i =0;
		for(Student j : arr) {
			System.out.println("학번["+i+"] = "+j.getHakbun()+" 이름["+i+"] = "+j.getName());
			i++;
		}
		
		System.out.println("-----------------------------------------");
		System.out.print("찾고싶은 학생의 학번 : ");
		String input3= scan.next();
		
		Student key = SortSearchExample.findstu(arr, input3);
		
		/*int index1=0;
		
		for(int k=0; k<arr.length; k++) {
			if((arr[k].getHakbun()).equals(input3)) {
				index1=k;
				break;
				}
		}*/
		
		int index =Arrays.binarySearch(arr,key);
		
		

		System.out.println(arr[index].getName()+" 학생은 "+index+"번째 방에 있습니다.");
		
		
		
	}

}
