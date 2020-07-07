package com.hashtable.collision.openaddressing.linearprobing;
import java.math.BigInteger;

public class UniversalHashing<T> implements HashProvider<T> {
	
	//hi,j=((i*x+j)modp)mods
	private final long prime =7919;
	private BigInteger i;
	private BigInteger j;
	private BigInteger s;
	public UniversalHashing() {
		i=BigInteger.valueOf((long)(Math.random()*prime));
		j=BigInteger.valueOf(1+(long)(Math.random()*(prime-1L)));
	}
	
	
	@Override
	public int hashVaue(T k, int c) {
		s=BigInteger.valueOf(c);
		BigInteger key=BigInteger.valueOf(((Integer)k).longValue());
		return j.add(i.multiply(key)).mod(BigInteger.valueOf(prime)).mod(s).intValue();
	}
		
	

}
