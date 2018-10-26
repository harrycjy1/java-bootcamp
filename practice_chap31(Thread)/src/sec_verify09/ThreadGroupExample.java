package sec_verify09;

public class ThreadGroupExample {

	public static void main(String[] args) {
		
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		
		System.out.println("현재 실행중인 스레드명 : "+ Thread.currentThread().getName()+"\t"
				+ "스레드 그룹명 : "+ main.getName()+" 부모그룹명 : "+main.getParent().getName());
		
		ThreadGroup agroup = new ThreadGroup(main,"AGroup");
		ThreadGroup bgroup = new ThreadGroup(main,"BGroup");
		ThreadGroup asubgroup = new ThreadGroup(agroup,"A_SubGroup");
		
		Thread a = new UnitThread(agroup,"AGroup_Thread1");
		Thread b = new UnitThread(bgroup,"BGroup_Thread1");
		Thread c = new UnitThread(asubgroup,"A_SubGroupThread1");
		Thread d = new UnitThread(asubgroup,"A_SubGroupThread2");
		
		
		a.start();
		b.start();
		c.start();
		d.start();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
					
		
		main.interrupt();
		

	}

}
