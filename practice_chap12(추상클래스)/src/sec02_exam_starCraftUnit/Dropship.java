package sec02_exam_starCraftUnit;

public class Dropship extends Unit{

	
		String str;
		
		public Dropship() {}
		
		@Override
		public void move(int x, int y) {
			this.x=x;
			this.y=y;
			System.out.println("드랍쉽의 위치 : "+this.x +", "+this.y+"로 이동함.");
			
		}


		public void load() {
			this.str = "탑승모드 : 유닛 탑승!";
			System.out.println(this.str);
		}
		
		public void unload() {
			this.str = "탑승모드 : 유닛 하강!";
			System.out.println(this.str);
		}

}
