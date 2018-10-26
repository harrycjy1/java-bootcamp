package sec03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) throws Exception{
		
		//여기 들어가는 매개값에 따라 실행되는 메서드가 달라짐에 주목하자
		
		//Class clazz = Class.forName("java.lang.String");
		
		//SendAction 객체 생성
		//Class clazz = Class.forName("sec03_newinstance.SendAction");
		
		/*String str = (String)clazz.newInstance();
		str = "스트링 타입";
		System.out.println(str);*/
		
		//receiveAction 객체 생성
		
		Class clazz = Class.forName("sec03_newinstance.ReceiveAction");
		
		//Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");
		
		//인터페이스타입으로 강제 형변환(다형성)
		Action action = (Action) clazz.newInstance(); //newInstance는 obj타입으로 리턴값을 넘김
		//Object obj = clazz.newInstance();
		//Action action1 = (Action) obj;
		
		action.execute();

	}

}
