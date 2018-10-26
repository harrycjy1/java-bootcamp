package sec13_verify;

public class ShopService {

	
	private static ShopService service = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		
		return ShopService.service;
	}
	
	
}
