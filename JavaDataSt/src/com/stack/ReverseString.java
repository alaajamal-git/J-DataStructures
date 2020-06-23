package com.stack;

public class ReverseString {

	public static void main(String[] args) {
		
		WarpperList<Character> list =new WarpperList<>();
		String str="Hello I am Alaa Jamal";
		char[] arr=str.toCharArray();
		for(char c:arr)
			list.push(c);
		System.out.println(list.getSize());
		while(!list.isEmpty())
			System.out.print(list.pop());
		System.out.print("\n"+list.getSize());
		
		System.out.println();
		
	}

}
