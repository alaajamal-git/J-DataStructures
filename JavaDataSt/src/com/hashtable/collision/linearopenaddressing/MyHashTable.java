package com.hashtable.collision.linearopenaddressing;

public class MyHashTable<K,V> implements HashFunction<K, V>{
    private final HashProvider<K> hashProvider;
	Pair<K, V> pair;
	Pair<K,V>[] table;
	int size;
	
	public MyHashTable(int size,HashProvider<K> hashProvider) {
		this.size=size;
		this.hashProvider=hashProvider;
		table=new Pair[size];
		
	}
	
	
	@Override
	public void put(K k, V v) {
		pair=new Pair<K,V>(k, v);
		int index=hashProvider.hashVaue(k, size);
		if(table[index]==null)
				table[index]=pair;
		else {
			while(table[(++index)%size]!=null);
				table[index%size]=pair;
		}
		//System.out.println(index);


	}

	@Override
	public V get(K k) {
		int index=hashProvider.hashVaue(k, size);
		

		Pair<K,V>pair =(Pair<K, V>) table[index];
		while(pair!=null&&!pair.keyEquals(k))
			pair =(Pair<K, V>) table[(++index)%size];
		
		return (pair==null)?null:pair.getV();
			
		}

	@Override
	public int remove(K k) {


		return 0;
	}


	public void checkCollisionFactor() {

		

		
	}
	

	

}
