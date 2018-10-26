package sec01_exam;

public class Array_Example05 {

	public static void main(String[] args) {
	
		
		
		int[] arr= new int[5];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
			System.out.println("변경 전  arr.length : "+arr.length);
			System.out.println("변경전 arr주소값"+arr);
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
			}
		
		int[] tmp = new int[arr.length*2];
		
		for (int i=0; i<arr.length; i++) {
			tmp[i]= arr[i];
		}
		
		arr= tmp;//tmp에 저장된 주소값을 arr에 저장한다.
				//기존 arr의 주소값은 사라지고 힙영역의 생성된 배열들은 GC가 없앰.
		
		System.out.println("변경후 arr주소값"+arr);//tmp의 주소값을 가져와서 변한것을 알수 있음.
		System.out.println("변경 후 arr.length : "+arr.length);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
