package sec_verify07;

public class OtherPair<K, V> {

	K			key;
	V			value;
	
	
	public OtherPair(K key, V value) {
		this.key=key;
		this.value=value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	
	
}
