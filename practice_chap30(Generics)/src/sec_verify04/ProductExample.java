package sec_verify04;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<String,Audio> p1 = new Product<>();
		p1.setA("오디오");
		p1.setM(new Audio("Sony","최상",4));
		Audio a = p1.getM();
		
		System.out.println("내 "+p1.getA()+"는 "+a.getBrand()+" 제조사이며, 음질은 "+a.getQuality()+"이고, "+a.getChannel()+"채널이다");
		System.out.println();
		Product<Integer,Monitor> p2 = new Product<>();
		p2.setA(350000);
		p2.setM(new Monitor("삼성",27));
		Monitor m = p2.getM();
		
		System.out.println("모니터의 상세");
		System.out.println("브랜드 : "+m.getCompany()+"\n인치 : "+m.getInch()+"\n가격 : "+p2.getA());

	}

}
