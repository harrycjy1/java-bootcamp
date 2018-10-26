package sec02_verify;

import java.util.Scanner;

public class MoutainBikeExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		MountainBike m1 = new MountainBike(0, "Scott");
		m1.prtInfo();
		MountainBike m2 = new MountainBike(0, "Giant");
		m2.prtInfo();
		MountainBike m3 = new MountainBike(0, "Lespo");
		m3.prtInfo();
		
	}

}
