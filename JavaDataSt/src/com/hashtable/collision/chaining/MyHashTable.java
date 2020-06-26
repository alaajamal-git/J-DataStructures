package com.hashtable.collision.chaining;

import com.linkedList.Node;
import com.linkedList.WarpperList;

public class MyHashTable<K,V> implements HashFunction<K, V>{
    private final HashProvider<K> hashProvider;
	Pair<K, V> pair;
	WarpperList<Pair<K,V>> [] table;
	int size=0;
	int capacity;
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public MyHashTable(int capacity,HashProvider<K> hashProvider) {
		this.capacity=capacity;
		this.hashProvider=hashProvider;
		table=new WarpperList[capacity];
		for(int i=0;i<capacity;i++)
			table[i]=new WarpperList<>();
	}
	
	
	@Override
	public void put(K k, V v) {
		pair=new Pair<K,V>(k, v);
		table[hashProvider.hashVaue(k, capacity)].add(pair);
		size++;
	}

	@Override
	public V get(K k) {
			
		WarpperList<Pair<K, V>> list=table[hashProvider.hashVaue(k, capacity)];
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
		
		Pair<K, V> temp=new Pair(k,null);
		for(WarpperList<Pair<K,V>> ls:table) {
			
			if(ls.getSize()>0) 
				if(ls.remove(temp)) {size--;return 1;}
			
		}
		return -1;
	}


	public void checkCollisionFactor() {

		

		
	}
	

	

}
