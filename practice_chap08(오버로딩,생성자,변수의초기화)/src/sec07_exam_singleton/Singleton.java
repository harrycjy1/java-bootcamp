package sec07_exam_singleton;

public class Singleton {

		//������������ ������ ���� ���� private�� �ٿ��� �ܺο����� new�� ���� �ν��Ͻ� �����Ұ���
	//static�� Ŭ���� ������ �ö󰡴� ���� �ܺο��� new�����ڸ� ���ؼ� ������ �ص���.
	
	private static Singleton singLetion= new Singleton();
	
	//Singleton�� �⺻ ��������. ���� private ���������ڶ� �ܺο��� ���� ����.
	//�����Ϸ��� �⺻�����ڰ� �����ÿ���, �ڵ������� �˾Ƽ� �⺻�����ڸ� ��������.
	private Singleton() {}

	//static �޼����� getInstance�� singleton�� �ּҸ� ����.
	public static Singleton getInstance() {
		
		//return this.Singleton; //���ܹ߻� ������???? this.�� static������ ��� �Ұ���
		return Singleton.singLetion;
	}
	
	
	
}
