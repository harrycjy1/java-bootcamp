package sec08_exam_generic_extends;

public class ChildProductExample {

	public static void main(String[] args) {
		
		
			Product<Tv,String> product = new ChildProduct<>();
			ChildProduct<Tv,String,String> childProduct = new ChildProduct<>();
			
			
			product.setKind(new Tv());
			product.setMode("ĸ��TV");
			//product.setCompany("�Ｚ");
			
			String pmodel = product.getMode();
			System.out.println(pmodel);
			
			
			
			childProduct.setKind(new Tv());
			childProduct.setMode("����Ʈ TV");
			childProduct.setCompany("LG");
			
			String model = childProduct.getMode();
			String company = childProduct.getCompany();
			
			System.out.println(company + " : "+ model);

	}

}
