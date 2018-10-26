package sec04_exam_threadName;

public class ThreadNameExample {

   public static void main(String[] args) {
      
      // ���� �������� �����带 ���� �� �ִ� Thread�� �����޼����� currentThread()
      Thread thread = Thread.currentThread();
      
      // ������ �̸� ���
      String curThreadName = thread.getName();
      System.out.println("[���α׷� ���� ������ �̸�] : " + curThreadName);
      
      // �ϱ� ������ ���ν����尡 �����ϴ� ��.
      // �Ʒ��ڵ带 ���� �� ����غ��� CPU�� ���¿� ���� ����� �޸� �����°� �� �� �ִ�.
      Thread threadA = new ThreadA();
      System.out.println("[ThreadA�� ������ ������ �̸�] : " + Thread.currentThread().getName());
      System.out.println("[���ν����尡 ThreadA�� �̸��� ������ ��] : " + threadA.getName());
      threadA.start();
      
      // �������� Ư���� �ϳ��� �����尡 ������ �ǰ� �����尡 ����ǰ� �� ��,
      // �� start()�� ȣ���� �� ����. start() ���� �Ұ�
      // java.lang.IllegalThreadStateException ���ܰ� �߻��Ѵ�.
      // ThreadA.start();
      // ���� �Ȱ��� ������ �۾������尡 ����Ǿ�� �ϴ� ��찡 �߻��Ѵٸ� new�� ���� ���� ���� �����ؾ��Ѵ�.
      // Thread threadA_1 = new ThreadA();
      // System.out.println("[ThreadA_1�� ������ ������ �̸�] : " + Thread.currentThread().getName());
      // threadA_1.start();
      
      Thread threadB = new ThreadB();
      System.out.println("[ThreadB�� ������ ������ �̸�] : " + Thread.currentThread().getName());
      System.out.println("[���ν����尡 threadB�� �̸��� ������ ��] : " + threadB.getName());
      threadB.start();
      System.out.println("[������ ������ ������ �̸�] : " + Thread.currentThread().getName());
      // ����� ���� ���� �ڵ�� ���ν����尡 �����ϴ� ���̴�. �ƿ﷯ threadA�� threadB�� ������ ��
      // ���õ� ���ν������̴�. ����, threadA, threadB�� �ϴ� �۾��� run�޼��忡 �ڵ��Ǿ��ִ� ����
      // �� �����ϴ� �� ���̴�. �� �κ��� ���� ���� �ʵ��� �Ѵ�.
   }
}