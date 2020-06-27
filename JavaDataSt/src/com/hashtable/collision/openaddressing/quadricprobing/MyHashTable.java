package com.hashtable.collision.openaddressing.quadricprobing;

//h + (a*i + b*i^2) 

public class MyHashTable<K,V> implements HashFunction<K, V>{
    private final HashProvider<K> hashProvider;
    private final int a=4;
    private final int b=12;
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
		int index;
			for(int j=0;j<c;j++) {
				index=quadricJump(h, j);
				if(table[index]==null||table[index].isEmptyObj()) {
					table[index]=pair;
					size++;
					break;
				}
				else if(table[index]!=null)				//if key already exists update its value.
					if(table[index].keyEquals(k))
						table[index].setV(v);
			}	
				return true;
	}

	@Override
	public V get(K k) {
		int h=hashProvider.hashVaue(k, c);
		int index;
		for(int j=0;j<c;j++) {
			index=quadricJump(h, j);
			if(table[index]==null)
				break;
			else {
				if(table[index].getK().equals(k))
					return table[index].getV();
			}
		}
		return null;
		}

	@Override
	public int remove(K k) {
		
	int h=hashProvider.hashVaue(k, c);
	int index;
	for(int j=0;j<c;j++) {
		index=quadricJump(h, j);
		if(table[index]==null)
			break;
		else {
			if(table[index].getK().equals(k)) {
				 table[index].remove();
				 size--;
				 return 1;
			}
		}
	}
	return 0;
	}
	
	public int quadricJump(int h,int i) {
		int powi=(int) Math.pow(i, 2);
		return (h+(a*i)+(b*powi))%c;
	}



	public int getSize() {
		return size;
	}
	
	public String toString() {
		String result="[";
		for(Pair<K, V> pair:table) {
			if(pair!=null&&!pair.isEmptyObj())
			result+=pair.toString()+", ";
			else
				result+="0, ";
		}
		result+="]";
		return result;
		
	}
}
