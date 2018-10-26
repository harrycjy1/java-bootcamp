package sec05_verify;

public class MyExpExample {

	public static void main(String[] args) {
		
		MyExp my = new MyExp();
		
		my.base =2;
		my.exp =3;
		my.getValue();
		
		System.out.println(my+" "+my.getValue());
		
		my.base=3;
		my.exp=4;
		my.getValue();
		
		System.out.println(my+" "+my.getValue());
	}

}
