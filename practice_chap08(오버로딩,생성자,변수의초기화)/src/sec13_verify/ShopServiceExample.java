package sec13_verify;

public class ShopServiceExample {

	public static void main(String[] args) {
		
		ShopService shop1 = ShopService.getInstance();
		ShopService shop2 = ShopService.getInstance();
		
		if(shop1.equals(shop2)) {
			System.out.println("���� shopservice��ü�Դϴ�.");
		}
		
	}

}
