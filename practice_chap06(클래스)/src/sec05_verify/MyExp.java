package sec05_verify;

public class MyExp {

	int base;
	int exp;
	
	
	public int getValue() {
		return (int)Math.pow(base, exp);
	}
	
	@Override
	public String toString() {
		String str = base+"ÀÇ "+exp+"½Â =";
		return str;
	}
	
	
}
