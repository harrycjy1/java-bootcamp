package sec11_verify;

public class TaskExample {

	public static void main(String[] args) {
		
		System.out.println("☆☆☆나의 우선순위별 업무리스트☆☆☆");
		
		System.out.println("일의 이름\t소요시간(분)\t우선순위");
		
		Task t1 = new Task("영어 공부",30);
		t1.setPriority(3);
		Task t2	= new Task("수학 공부",80);
		t1.setPriority(1);
		Task t3 = new Task("자바 공부",150);
		t1.setPriority(2);
		
		System.out.println(t1.taskName+"\t"+t1.time+"분\t\t"+t1.priority_number);
		System.out.println(t2.taskName+"\t"+t2.time+"분\t\t"+t2.priority_number);
		System.out.println(t3.taskName+"\t"+t3.time+"분\t\t"+t3.priority_number);

	}

}
