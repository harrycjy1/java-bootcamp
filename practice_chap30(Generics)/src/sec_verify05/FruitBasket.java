package sec_verify05;

public class FruitBasket {
	static int i=0;

	public static<K,V> Fruit<K,V> basketing(K k,V v){
		
		if(i==0)
		System.out.println("Fruit�ٱ��Ͽ� ������ ���׿�.");
		
		else
		System.out.println("Fruit�ٱ��Ͽ� �� ������ ���׿�.");
		
		Fruit<K,V> f = new Fruit<>();
		f.setK(k);
		f.setV(v);
		
		i++;
		
		return f;
	}
}
