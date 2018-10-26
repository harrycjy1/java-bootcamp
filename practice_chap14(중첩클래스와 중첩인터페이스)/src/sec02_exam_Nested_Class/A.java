package sec02_exam_Nested_Class;

public class A {
	
		public A() {
			System.out.println("A��ü�� ������");
			B b = new B(); //�̰� �� �����ұ�?
			b.a = 20;
			b.method1();
		}
		
		
		//�ν��Ͻ����Ŭ����
		class B {
			int a =10;
			//static int b =20;
			public B() {
				System.out.println("B��ü�� ������");
			}
			void method1() {
				System.out.println("BŬ������ ��� �޼��� method1�� ȣ���");
			}
			//static�� ���� �ȵȴ�.
		}

		
		//static���Ŭ����
		static class C{
			
			public C() {
				System.out.println("static C��ü�� ������");
			}
			
			int b=10;
			static int c=20;
			
			void method2() {
				System.out.println("static CŬ������ ����޼��� method2�� ȣ���.");
			}
			
			static void method3() {
				System.out.println("static CŬ������ static����޼��� method3�� ȣ���.");
			}
			
		}

		void method() {
			//����Ŭ������ D(����Ŭ�������� ���� static�� ���´�.)
			
			class D{
				
				public D() {
					System.out.println("D��ü�� ������");
				}
				
				int e =30;
				//static int f =30;
				
				void localmethod() {
					System.out.println("����Ŭ������ DŬ������ ����޼��� method()�� ȣ���");
					System.out.println(e);
				}
			}
			
			D d =new D();
			d.e=50;
			d.localmethod();
		}
		

}
