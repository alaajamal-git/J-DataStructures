package com.hashtable.collision.openaddressing.linearprobing;

public class Pair <K,V>{
	
	private K k;
	private V v;
    public boolean DELETE_FLAG;
	public Pair(K k, V v) {
		super();
		this.k = k;
		this.v = v;
		DELETE_FLAG=false;
	}
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
	public boolean keyEquals(Object o) {
		K key=(K) o;
		if(this.isEmptyObj()) return false;
		if(k.equals(key))return true;
		
		return false;
	}
	public void remove() {
		this.k=null;
		this.v=null;
		this.DELETE_FLAG=true;
	}
	
	public boolean isEmptyObj() {
		
		return this.DELETE_FLAG;
				
		
		
	}
	

}
