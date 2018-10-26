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
					System.out.println("자전거의 스피드가 음수일리가 있나요?");
				}
				else if(bicycleSpeed==100) {
					System.out.println("자전거의 스피드가 "+bicycleSpeed+"KM라니 미쳤군요!");
				}
				else {
				System.out.println("자전거의 스피드 : "+bicycleSpeed+"KM 입니다.");
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
						System.out.println("기어를 넣어주셔야 합니다.");
					}
					else {
					System.out.println("차의 현재 기어 : "+cargear+"단 입니다.");
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
