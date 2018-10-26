package sec02_exam_create_multiThread;

import java.awt.Toolkit;

//Runnable �������̽��� ���� �����ϰ� �ִ�.
public class BeepTask implements Runnable{
   //Runnable�������̽��� �ִ� run()�߻�޼��带 �������̵��Ѵ�.
   @Override
   public void run() {
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      for(int i = 0; i < 5; i++)
      {
         System.out.println("BeepTask" + (i + 1));
         toolkit.beep();
         try {
            Thread.sleep(500);
         } catch(InterruptedException e) {}
      }

   }
}