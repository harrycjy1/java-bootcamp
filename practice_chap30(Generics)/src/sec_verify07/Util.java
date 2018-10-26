package sec_verify07;

public class Util<K,V> {

	K			key;
	V			value;
		
	static <K,V> V getValue(Pair<K,V> text, K key) {
		if(text.getKey()==key)
			return text.getValue();
		else
		return null;
	}
}
