package com.hashtable.collision.openaddressing.quadricprobing;

public interface HashFunction<K,V> {
	
	public boolean put(K k,V v);
	public V get(K k);
	public int remove(K k);

}
