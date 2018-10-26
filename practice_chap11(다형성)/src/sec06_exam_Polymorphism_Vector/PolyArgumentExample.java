package sec06_exam_Polymorphism_Vector;

import java.util.Iterator;

public class PolyArgumentExample {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Apple apple = new Apple();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(com);
		b.buy(audio);
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Audio());
		
		
		Iterator it = b.item.iterator();
		while(it.hasNext()) {
			Product p = (Product)it.next();
			System.out.println(p);
		}
		
		System.out.println("ÇöÀç º¤ÅÍ¿¡ Product °´Ã¼ÀÇ ¼ö : " + b.item.size());
		//b.buy(apple);
		b.summary();
		System.out.println();
		//b.refund(com);
		//b.refund(audio);
		
		//b.item.clear(); //°´Ã¼ ´Ù Áö¿ò
		b.item.remove(audio);
		
		b.summary();
		System.out.println("ÇöÀç º¤ÅÍ¿¡ Product °´Ã¼ÀÇ ¼ö : " + b.item.size());
		
		
	}

}
