package com.queuewithdynamicarray;

public class WarpperList<T> {
	
	private T[] tArray;
	private int  size=0;
	private int h_index=0;
	private int c_index=0;
	@SuppressWarnings("unchecked")
	public WarpperList() {
		size=10;
		tArray=(T[]) new Object[size];
	}
	
	public void enqueue(T t) {
		
		tArray[c_index++]=t;
		checkSize();
		
	}
	
	public T dequeue() {
		T t =tArray[h_index];
		tArray[h_index++]=null;
		return t;
	}

	private void checkSize() {

		if(c_index>=(size*(0.7)))
		{
			T[]	temp=(T[]) new Object[size*=2];
			for(int i=0;i<c_index;i++)
				temp[i]=tArray[i];
			tArray=temp;
			
		}

		
		
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int getNElements() {
		return this.c_index-this.h_index;
	}
	
	public String toString() {
		String result="";
		for(int i=this.h_index;i<c_index;i++)
			result+=tArray[i]+", ";
		return result;
		
		
	}

}
