package sec06_verify;

public class Anonymous {
				
	int 	bicycleSpeed;
	int 	cargear;
	
	
		Vehicle field = new Vehicle() {
			@Override
			public void speedup() {
				bicycleSpeed+=10;
				
			}
			@Override
			public void run() {
				
				if(bicycleSpeed==0) {
					System.out.println("�������� ���ǵ尡 �����ϸ��� �ֳ���?");
				}
				else if(bicycleSpeed==100) {
					System.out.println("�������� ���ǵ尡 "+bicycleSpeed+"KM��� ���Ʊ���!");
				}
				else {
				System.out.println("�������� ���ǵ� : "+bicycleSpeed+"KM �Դϴ�.");
				}
				speedup();
				
			}
		};

		
		public void passengerCar() {
			
			Vehicle local = new Vehicle() {
				
				@Override
				public void speedup() {
					cargear++;	
				}
				@Override
				public void run() {
					if(cargear==0) {
						System.out.println("�� �־��ּž� �մϴ�.");
					}
					else {
					System.out.println("���� ���� ��� : "+cargear+"�� �Դϴ�.");
					}
					speedup();
				}
				
			};
			local.run();
			
		}

		public void airPlane(Vehicle v) {
			for(int i=0; i<10; i++) {
			v.run();
			v.speedup();
			}
		}

}
