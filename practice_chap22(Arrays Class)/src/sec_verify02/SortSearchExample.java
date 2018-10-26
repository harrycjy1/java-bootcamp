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
		
		System.out.print("�л� ���� �Է��ϼ��� >>");
		int input = scan.nextInt();
		
		Student[] arr = new Student[input];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("["+(i)+"]��° �л� �й� : ");
			String input1 = scan.next();
			System.out.print("["+(i)+"]��° �л� �̸� : ");
			String input2 = scan.next();
			arr[i]=new Student(input1,input2);
			
		}
		System.out.println("-----------------------------------------");
		Arrays.sort(arr);
		System.out.println("�й� ����������� �����մϴ�.");
		int i =0;
		for(Student j : arr) {
			System.out.println("�й�["+i+"] = "+j.getHakbun()+" �̸�["+i+"] = "+j.getName());
			i++;
		}
		
		System.out.println("-----------------------------------------");
		System.out.print("ã����� �л��� �й� : ");
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
		
		

		System.out.println(arr[index].getName()+" �л��� "+index+"��° �濡 �ֽ��ϴ�.");
		
		
		
	}

}
