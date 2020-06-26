package com.hashtable.collision.openaddressing.quadricprobing;

//h + (ai + bi2)

public class MyHashTable<K,V> implements HashFunction<K, V>{
    private final HashProvider<K> hashProvider;
    private final int a=0;
    private final int b=0;
    private Pair<K, V> pair;
    private Pair<K,V>[] table;
    private int c;
    private int size=0;
    
    
	public MyHashTable(int capacity,HashProvider<K> hashProvider) {
		this.c=capacity;
		this.hashProvider=hashProvider;
		table=new Pair[c];
	}
	
	
	@Override
	public boolean put(K k, V v) {
		if(c==size) return false;// table is full
		pair=new Pair<K,V>(k, v);
		int h=hashProvider.hashVaue(k, c);
		int i=0;
		if(table[h]==null||table[h].isEmptyObj())
				table[h]=pair;
		else 
			while(table[h%=c]!=null&&!table[(h++)%c].isEmptyObj()); //find next free position
		
				table[h]=pair;
		
		size++;
				return true;
						

	}

	@Override
	public V get(K k) {
		int h=hashProvider.hashVaue(k, c);
		int stopIdx=h;
		Pair<K,V>pair =(Pair<K, V>) table[h];
		if(pair!=null&&pair.keyEquals(k))return pair.getV();
		h++;
		for(;pair!=null&&!pair.keyEquals(k);h++) {   //null position means not found!
			if((h%=c)==stopIdx) return null;      //all elements are reached
			pair =(Pair<K, V>) table[h];
		}
		return (pair==null)?null:pair.getV();
			
		}

	@Override
	public int remove(K k) {

		int h=hashProvider.hashVaue(k, c);
		int stopIdx=h;
		Pair<K,V>pair =(Pair<K, V>) table[h++];
		if(pair!=null&&pair.keyEquals(k))
			{pair.remove();
			size--;
			return 1;
			}
		
		for(;!pair.keyEquals(k)&&pair!=null;h++) {  
			pair =(Pair<K, V>) table[h];
			if((h%=c)==stopIdx || pair==null) return 0;      //all elements are reached or not found
		}
		pair.remove();
		size--;
		return 1;
		}
	
	public int quadricJump(int h,int i) {
		h=(int) (h+a*i+b*Math.pow(i, 2));
		
		return h;
	}



	public int getSize() {
		return size;
	}
}
