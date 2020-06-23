package com.hashtable.collision.chaining;

import java.math.BigInteger;

import com.hashtable.collision.chaining.HashProvider;

public class ModHash implements HashProvider<Integer>{

	@Override
	public int hashVaue(Integer t,int c) {

		return t.intValue()%c;

		
		
	}

}
