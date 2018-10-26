package sec01_verify;

public class Monitor {

	String		company; 		
	int 		inch;
	int			price;
	
	Monitor(String company,int inch,int price){
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
	
	Monitor(){
		this("LG",23,500000);
	}
	
	
	
	
}
