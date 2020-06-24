package com.hashtable.collision.linearopenaddressing;

public class MyHashTable<K,V> implements HashFunction<K, V>{
    private final HashProvider<K> hashProvider;
	Pair<K, V> pair;
	Pair<K,V>[] table;
	int c;
	int size=0;
	public MyHashTable(int capacity,HashProvider<K> hashProvider) {
		this.c=capacity;
		this.hashProvider=hashProvider;
		table=new Pair[c];
		
	}
	
	
	@Override
	public boolean put(K k, V v) {
		if(c==size) return false;//
		pair=new Pair<K,V>(k, v);
		int index=hashProvider.hashVaue(k, c);
		if(table[index]==null)
				table[index]=pair;
		else 
			while(table[(index++)%c]!=null); //find next free position
				table[index%c]=pair;
		
		size++;
				return true;
						

	}

	@Override
	public V get(K k) {
		int index=hashProvider.hashVaue(k, c);
		int stopIdx=index;
		Pair<K,V>pair =(Pair<K, V>) table[index];
		if(pair!=null&&pair.keyEquals(k))return pair.getV();
		index++;
		for(;!pair.keyEquals(k)&&pair!=null;index++) {   //null position means not found!
			if((index%=c)==stopIdx) return null;      //all elements are reached
			pair =(Pair<K, V>) table[index];
		}
		return (pair==null)?null:pair.getV();
			
		}

	@Override
	public int remove(K k) {


		return 0;
	}


	public void checkCollisionFactor() {

		

		
	}
	

	

}
