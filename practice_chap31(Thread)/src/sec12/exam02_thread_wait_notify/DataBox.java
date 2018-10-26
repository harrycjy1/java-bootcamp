package sec12.exam02_thread_wait_notify;

public class DataBox {

		private String data;
		
		/*
		 * �Ʒ� getData()�� ConsumerThread�� data�� �о���� �Ǿ� �ִ�.
		 * �׷��� null�̸� wait(�Ͻ����� : Blocked����)�ϰ�, null�� �ƴ϶�� ConsumerThread��
		 * ���� �����͸� ����ϸ鼭 , �ٸ� waiting�� �����带 
		 * notify�� ���ؼ� ��������·� �ٲ۴�
		 * */
		
		public synchronized String getData() {
			if(this.data ==null) {
				try {
					wait();
				} catch (InterruptedException e) {}
			}
			String returnValue = this.data;
			System.out.println("ConsumerThread�� ���� ������ : "+returnValue);
			this.data=null;
			//�ٸ� ������(�����ڽ�����)�� �����(�� ��������·� �����)
			notify();
			return returnValue;
		}
		
		public synchronized void setData(String data) {
			//ConsumerThread�� �����͸� ���� �ʾҴٸ�....(Ctrl + 1 ������ ����Ű)
			if(this.data != null) {
				try {
					wait();
				} catch (InterruptedException e) {}
			}
			this.data = data; //�ʵ忡 ���� ����
			System.out.println("ProducerThread�� ������ ������ : "+this.data);
			notify(); 
		}
		/*
		  ����� ������ wait()�� notify()�� �̿��Ͽ� ������ ���鼭 ������
		  �� ������ü�� �����ϱ� ���ؼ��� syncronized�� ����ȭ Ű���尡 
		  ���� ���� ���ܵ� �߻����� �ƴ��ϰ�, �������� ��Ȯ���� �����Ѵ�.
		  �� �ٽø��� ��ü ����� �Ͼ�� �Ѵٴ� ���̴�.
		*/
}	
