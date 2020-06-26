package com.hashtable.collision.openaddressing.quadricprobing;

public class ModHash implements HashProvider<Integer>{

	@Override
	public int hashVaue(Integer t,int c) {

		return t.intValue()%c;

		
		
	}

}
