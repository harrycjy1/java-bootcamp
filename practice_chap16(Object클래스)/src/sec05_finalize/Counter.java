package sec05_finalize;

public class Counter {

	private int no;
	
	public Counter(int no) {
		this.no=no;
	}
	
	//�����ϸ� finalize()�� ������ ���� �ʴ´�.
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.no+"�� ��ü�� finalize()�� �����");
	}
	
	
	
}
