package sec_verify05;

public class FruitBasket {
	static int i=0;

	public static<K,V> Fruit<K,V> basketing(K k,V v){
		
		if(i==0)
		System.out.println("Fruit바구니에 과일이 담겼네요.");
		
		else
		System.out.println("Fruit바구니에 또 과일이 담겼네요.");
		
		Fruit<K,V> f = new Fruit<>();
		f.setK(k);
		f.setV(v);
		
		i++;
		
		return f;
	}
}
