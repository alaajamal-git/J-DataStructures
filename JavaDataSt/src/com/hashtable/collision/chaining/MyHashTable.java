package com.hashtable.collision.chaining;

import com.linkedList.Node;
import com.linkedList.WarpperList;

public class MyHashTable<K,V> implements HashFunction<K, V>{
    private final HashProvider<K> hashProvider;
	Pair<K, V> pair;
	WarpperList<Pair<K,V>> [] table;
	int size;
	
	public MyHashTable(int size,HashProvider<K> hashProvider) {
		this.size=size;
		this.hashProvider=hashProvider;
		table=new WarpperList[size];
		for(int i=0;i<size;i++)
			table[i]=new WarpperList<>();
	}
	
	
	@Override
	public void put(K k, V v) {
		pair=new Pair<K,V>(k, v);
		table[hashProvider.hashVaue(k, size)].add(pair);
	}

	@Override
	public V get(K k) {
			
		WarpperList<Pair<K, V>> list=table[hashProvider.hashVaue(k, size)];
		Node node=list.get(0);
		if(list.getSize()==0)return null;
		else	if(list.getSize()==1)
			return ((Pair<K, V>)node.getData()).getV();
		else	if(list.getSize()>1) {
			
			while(node!=null){
				if(((Pair<K, V>)node.getData()).getK().equals(k))
					return ((Pair<K, V>)node.getData()).getV();
				node=node.getNext_node();
			}
			
		}

		return null;
	}

	@Override
	public int remove(K k) {


		return 0;
	}


	public void checkCollisionFactor() {

		

		
	}
	

	

}
