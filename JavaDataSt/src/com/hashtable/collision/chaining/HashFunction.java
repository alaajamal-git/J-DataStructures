package com.hashtable.collision.chaining;

public interface HashFunction<K,V> {
	
	public void put(K k,V v);
	public V get(K k);
	public int remove(K k);

}
