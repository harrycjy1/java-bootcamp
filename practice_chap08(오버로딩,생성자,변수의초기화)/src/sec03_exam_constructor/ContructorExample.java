package sec03_exam_constructor;

public class ContructorExample {

	public static void main(String[] args) {
		
		
			Data1 d1 = new Data1();
			Data2 d2 = new Data2(5);//�Ű������� �ȳ־��༭ �׷���.
			
			d1.value = 10;
			System.out.println(d1.value);
			System.out.println(d2.value);
			
			Data2 d3 = new Data2(3);
			System.out.println(d3.value);

	}

}
