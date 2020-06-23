package com.hashtable.collision.linearopenaddressing;

public class ModHash implements HashProvider<Integer>{

	@Override
	public int hashVaue(Integer t,int c) {

		return t.intValue()%c;

		
		
	}

}
