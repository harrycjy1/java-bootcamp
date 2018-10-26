package sec01_exam_static_instance_class;

public class Nested_Example {

	//�ν��Ͻ� ��� Ŭ����
	class InstanceClass{
		int iv = 100;
		//static int cv = 200;
		final static int CONST = 100; //final static�� ����̹Ƿ� ����Ѵ�.
	}
	
	//static ��� Ŭ����
	static class staticInner{
		
		int iv = 200; //�������Ŭ������ �ν��Ͻ���� �� ������ �ִ�.
					  //������ ����ϱ� ���ؼ��� new�� �ν��Ͻ��� �����ؾ���.
	
		static int cv = 200;
	}
	
	void method() {
		//����Ŭ����(�޼��� �ȿ� ����, ��� ����� �뵵)
		class Localclass{
			int iv = 300;
			//static int cv = 300;
			static final int CONST = 300;
		}
		
		Localclass lc = new Localclass();
		System.out.println(lc.iv);
		System.out.println(lc.CONST);
	}

	public static void main(String[] args) {
		
		Nested_Example ne = new Nested_Example();
		//�ν��Ͻ� ��� Ŭ������ �ܺ�Ŭ������ �ν��Ͻ��� �־�߸� ��밡���ϴ�.
		InstanceClass ic = ne.new InstanceClass();
		
		//���� Ŭ������ �ܺ� Ŭ������ �ν��Ͻ��� ��� �ٷ� ��밡���ϴ�.
		staticInner si= new staticInner();
		
		System.out.println(ic.iv);
		System.out.println(ic.CONST);
		System.out.println(si.iv);
		
		System.out.println(staticInner.cv);
		ne.method();
		
		
		
	}


}
