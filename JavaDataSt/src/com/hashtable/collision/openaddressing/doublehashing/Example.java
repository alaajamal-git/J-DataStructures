package com.hashtable.collision.openaddressing.doublehashing;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {


		int a=5,b=12;
		int m=(int) Math.pow(3, 5);
		int h=2;
		int [] result=new int[m];
		for(int i=0;i<m;i++) {
			int powi=(int) Math.pow(i, 2);
			result[i]=(h+(a*i)+(b*powi))%m;
		}
		System.out.println(Arrays.toString(result));
		Arrays.sort(result);			
		System.out.println(Arrays.toString(result));
	}

}
